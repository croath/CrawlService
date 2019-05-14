package com.utils;

import java.io.File;
import java.io.InputStream;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class StringUtil {
	private static String[] LowerHexDig = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b",
			"c", "d", "e", "f" };
	private static String[] UpperHexDig = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B",
			"C", "D", "E", "F" };

	public static String hex2UpperString(byte[] bArr) {
		StringBuilder stringBuilder = new StringBuilder();
		for (byte b : bArr) {
			stringBuilder.append(UpperHexDig[(b >> 4) & 15]).append(UpperHexDig[b & 15]);
		}
		return stringBuilder.toString();
	}

	public static String hex2LowerString(byte[] bArr) {
		StringBuilder stringBuilder = new StringBuilder();
		for (byte b : bArr) {
			stringBuilder.append(LowerHexDig[(b >> 4) & 15]).append(LowerHexDig[b & 15]);
		}
		return stringBuilder.toString();
	}

	/**
	 * 16进制的字符串表示转成字节数组
	 * 
	 * @param hexString 16进制格式的字符串
	 * @return 转换后的字节数组
	 **/
	public static byte[] toByteArray(String hexString) {
		if (hexString.isEmpty())
			throw new IllegalArgumentException("this hexString must not be empty");

		hexString = hexString.toLowerCase();
		final byte[] byteArray = new byte[hexString.length() / 2];
		int k = 0;
		for (int i = 0; i < byteArray.length; i++) {// 因为是16进制，最多只会占用4位，转换成字节需要两个16进制的字符，高位在先
			byte high = (byte) (Character.digit(hexString.charAt(k), 16) & 0xff);
			byte low = (byte) (Character.digit(hexString.charAt(k + 1), 16) & 0xff);
			byteArray[i] = (byte) (high << 4 | low);
			k += 2;
		}
		return byteArray;
	}

	/**
	 * 字节数组转成16进制表示格式的字符串
	 * 
	 * @param byteArray 需要转换的字节数组
	 * @return 16进制表示格式的字符串
	 **/
	public static String toHexString(byte[] byteArray) {
		if (byteArray == null || byteArray.length < 1)
			throw new IllegalArgumentException("this byteArray must not be null or empty");

		final StringBuilder hexString = new StringBuilder();
		for (int i = 0; i < byteArray.length; i++) {
			if ((byteArray[i] & 0xff) < 0x10)// 0~F前面不零
				hexString.append("0");
			hexString.append(Integer.toHexString(0xFF & byteArray[i]));
		}
		return hexString.toString().toLowerCase();
	}
}
