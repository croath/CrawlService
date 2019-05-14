package com.module.xhs;

import java.net.URLEncoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import com.utils.CalUtil;
import com.utils.StringUtil;

public class XhsModlue {
	
	public static HashMap<String, String> calcSignAndShiled(Map<String, String> paramsCalc)  {
		
		HashMap<String, String> result = new HashMap<String, String>();
		String crypt_method = paramsCalc.remove("crypt_method");
		String url = paramsCalc.remove("url");
		String sign = calcSign(paramsCalc);
		paramsCalc.put("sign", sign);
		String shiled = calShiled(url, crypt_method, paramsCalc);
		result.put("sign", sign);
		result.put("shiled", shiled);

		return result;
		
	}
	
	
	
	private static String calcSign(Map<String, String> params)  {
		try {
			int var1 = 0;
			String deviceID = params.get("deviceId");
			ArrayList<String> var3 = new ArrayList<String>();
			var3.addAll(params.keySet());
			Collections.sort(var3);
	
			StringBuilder var4 = new StringBuilder();
			Iterator<String> iter = var3.iterator();
			while (iter.hasNext()) {
				String var5 = iter.next();
				var4.append(var5);
				var4.append("=");
				var4.append((String) params.get(var5));
			}
			byte[] var9 = URLEncoder.encode(var4.toString(), "UTF-8").getBytes();
			byte[] buffer = deviceID.getBytes();
			var4 = new StringBuilder();
			for (int i = 0; var1 < var9.length; ++var1) {
				var4.append(var9[var1] ^ buffer[i]);
				i = (i + 1) % buffer.length;
			}
			return CalUtil.md5(CalUtil.md5(var4.toString()).toLowerCase() + deviceID).toLowerCase();
			}
		catch(Exception e) {
			return "";
		}
	}
	
	private static String calShiled(String path, String crypt_method, Map<String, String> query) {
		
		try {
			String result="";	
			Map<String, String> queryParams = new HashMap<String, String>();
			queryParams.putAll(query);
			queryParams.put("url", path);
	
			String params = CalUtil.sortHashMapString(queryParams);
			String deviceid = queryParams.get("deviceId");
			params = URLEncoder.encode(params, "UTF-8");
	
			if(crypt_method=="" || crypt_method.isEmpty()) {
				return S4(params);
			}
			
			byte[] data = StringUtil.toByteArray(crypt_method);		
			String algName = D0(data, deviceid);
			switch(algName) {
				case "S4":
					result = S4(params);
					break;
				case "S2":
					result = S2(params);
					break;
			}
			
			return result;
		}
		catch(Exception e) {
			return "";
		}
		
	}
	
	static String D0(byte[] key, String deviceid){
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");
			byte[] md5Bytes = messageDigest.digest(deviceid.getBytes());
			byte[] newKey = new byte[8];
			System.arraycopy(md5Bytes, 2, newKey, 0, 8);
			byte[] data = CalUtil.decryptDes(key, newKey);
			return new String(data);
		}catch(Exception e) {
			return null;
		}
	}

	private static String S4(String params) throws Exception {
		System.out.println("params:"+ params);
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		byte[] md5Bytes = messageDigest.digest(params.getBytes());
		byte[] newKey = new byte[8];
		System.arraycopy(md5Bytes, 2, newKey, 0, 8);

		byte[] data = CalUtil.encryptByKeyDes(params.getBytes(), newKey);
		MessageDigest sha256 = MessageDigest.getInstance("SHA-256");
		sha256.reset();
		sha256.update(data);
		return StringUtil.hex2LowerString(sha256.digest());
	}
	private static String S2(String params) throws Exception {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");
		byte[] md5Bytes = messageDigest.digest(params.getBytes());
		byte[] newKey = new byte[8];
		System.arraycopy(md5Bytes, 2, newKey, 0, 8);

		byte[] data = CalUtil.encryptByKeyDes(params.getBytes(), newKey);
		MessageDigest sha256 = MessageDigest.getInstance("MD5");
		sha256.reset();
		sha256.update(data);
		return StringUtil.hex2LowerString(sha256.digest());
	}
}
