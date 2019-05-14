package com.utils;

import java.net.URLEncoder;
import java.util.Base64;
import java.util.List;

import org.bouncycastle.crypto.digests.SHA1Digest;

public class CommUtil {
	public static String list2String(List<KeyValue> list) {
		StringBuilder sb = new StringBuilder();
		for (KeyValue item : list) {
			sb.append(item.key + "=" + item.value + "&");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
	
	/**
	 * 
	 * @param data1
	 * @param data2
	 * @return data1 与 data2拼接的结果
	 */
	public static byte[] mergeByteArray(byte[] data1, byte[] data2) {
		byte[] data3 = new byte[data1.length + data2.length];
		System.arraycopy(data1, 0, data3, 0, data1.length);
		System.arraycopy(data2, 0, data3, data1.length, data2.length);
		return data3;
 
	}
	
    public static byte[] sha1(byte[] data) {
    	SHA1Digest digest = null;
        try {
        	digest = new SHA1Digest();
            digest.update(data, 0, data.length);
            byte[]md5Bytes = new byte[digest.getDigestSize()];
            digest.doFinal(md5Bytes, 0);
           return md5Bytes;
        } catch (Exception e) {
        	return null;
        }
    }
    
    public static String base64encode(byte[] data) {
    	return Base64.getEncoder().encodeToString(data);
    }
    
    public static String urlEncode(String data) {
    	return URLEncoder.encode(data);
    }  
    
	public static String getValueByKey(List<KeyValue> list, String key){
		for(KeyValue item: list){
			if(item.key.equals(key)){
				return item.value;
			}
		}
		return "";
	}
	
	
    private static String byte2Str(byte arg11) {
    	String b[] = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};
        int v11 = arg11;
        if(arg11 < 0) {
            v11 = arg11 + 0x100;
        }
        String v0_1 = b[v11 >> 4] + b[v11 & 15];
        return v0_1;
    }

    public static String byte2Hexstr(byte[] arg10) {
            StringBuilder v1 = new StringBuilder();
            for(int v0=0; v0 < arg10.length; v0++) {
                v1.append(CommUtil.byte2Str(arg10[v0]));

            }
        return v1.toString();
    }

}
