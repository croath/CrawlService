package com.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

public class CalUtil {

	public static String md5(String var0) {
		try {
			var0 = md5(var0.getBytes("utf-8"));
		} catch (UnsupportedEncodingException var1) {
			var1.printStackTrace();
			var0 = "";
		}

		return var0;
	}

	public static String md5(byte[] var0) {
		String var3;
		try {
			MessageDigest var1 = MessageDigest.getInstance("MD5");
			var1.update(var0);
			var3 = StringUtil.hex2UpperString(var1.digest());
		} catch (NoSuchAlgorithmException var2) {
			var2.printStackTrace();
			var3 = "";
		}

		return var3;
	}

	public static String sortHashMapString(Map<String, String> queryParams) {
		List<Map.Entry<String, String>> list = new ArrayList<Map.Entry<String, String>>(queryParams.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, String>>() {
			public int compare(Entry<String, String> o1, Entry<String, String> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> item : list) {
			sb.append(item.getKey() + "=" + item.getValue());
		}
		System.out.println(sb.toString());
		return sb.toString();
	}


	/**
	 * 加密
	 * 
	 * @param datasource
	 *            byte[]
	 * @param password
	 *            String
	 * @return byte[]
	 */
	public static byte[] encryptByKeyDes(byte[] datasource, byte[] key) {
		try {
			SecureRandom random = new SecureRandom();
			DESKeySpec desKey = new DESKeySpec(key);
			SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
			SecretKey securekey = keyFactory.generateSecret(desKey);
			Cipher cipher = Cipher.getInstance("DES");
			cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
			return cipher.doFinal(datasource);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 解密
	 * 
	 * @param src
	 *            byte[]
	 * @param password
	 *            String
	 * @return byte[]
	 * @throws Exception
	 */
	public static byte[] decryptDes(byte[] src, byte[] key) throws Exception {
		SecureRandom random = new SecureRandom();
		DESKeySpec desKey = new DESKeySpec(key);
		SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
		SecretKey securekey = keyFactory.generateSecret(desKey);
		Cipher cipher = Cipher.getInstance("DES");
		cipher.init(Cipher.DECRYPT_MODE, securekey, random);
		return cipher.doFinal(src);
	}
}
