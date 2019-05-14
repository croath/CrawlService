package com.module.meituan;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.crypto.Cipher;
import com.utils.CommUtil;
import com.utils.KeyValue;

public class MeituanModule {

	public static String calc_sign(String api, List<KeyValue> body) {
		try {
			String deviceid = CommUtil.getValueByKey(body, "wm_did");
			String req_time = CommUtil.getValueByKey(body, "req_time");
			String wm_seq = CommUtil.getValueByKey(body, "wm_seq");

			StringBuilder sb = new StringBuilder();
			sb.append(api).append("/").append(deviceid).append("/").append(req_time).append("/").append(wm_seq);
			String data = sb.toString();

			byte[] doFinal;
			RSAPublicKey rSAPublicKey = (RSAPublicKey) KeyFactory.getInstance("RSA")
					.generatePublic(new RSAPublicKeySpec(new BigInteger(
							"AC14E4A51F1B8E11A95971CA4EBD7E2314631F137596A66A43FA2D792B2FD8447CBD6553D591F00A8B9D58E8BA33C229317A0D122C965D84A286114A963C3AE2694C81665D5AF04C80A71CBF350CD4C66280DC8FADBE6B8EDA7B2EC3D0C50E150850445EF84D3A4192662AC135D912C2CA2C68176D79EC64CACFF34089482B69",
							16), new BigInteger("010001", 16)));
			Cipher instance = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			instance.init(1, rSAPublicKey);
			byte[] bytes = data.getBytes();
			int length = bytes.length;
			ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
			int i = 0;
			int i2 = 0;
			while (length - i > 0) {
				if (length - i > 117) {
					doFinal = instance.doFinal(bytes, i, 117);
				} else {
					doFinal = instance.doFinal(bytes, i, length - i);
				}
				byteArrayOutputStream.write(doFinal, 0, doFinal.length);
				int i3 = i2 + 1;
				i = i3 * 117;
				i2 = i3;
			}
			doFinal = byteArrayOutputStream.toByteArray();
			byteArrayOutputStream.close();
			return CommUtil.urlEncode(CommUtil.base64encode(doFinal));
		} catch (Exception e) {
			return "";
		}

	}

	public static String calc_skcy(String url, List<KeyValue> query, List<KeyValue> body) {
		try {
			List<KeyValue> resultMap = new ArrayList<KeyValue>();
			resultMap.addAll(query);
			resultMap.addAll(body);
			resultMap.add(new KeyValue("__sksc", "http"));
			Collections.sort(resultMap, new Comparator<KeyValue>() {
				@Override
				public int compare(KeyValue o1, KeyValue o2) {
					return o1.key.compareTo(o2.key);
				}
			});

			StringBuilder sb = new StringBuilder();
			sb.append("POST ").append(url).append(" ");
			for (KeyValue item : resultMap) {
				sb.append(item.key + "=" + item.value + "&");
			}
			String params = sb.deleteCharAt(sb.length() - 1).toString();

			byte[] key1 = { 0x0e, 0x05, 0x55, 0x0f, 0x00, 0x54, 0x04, 0x06, 0x0f, 0x53, 0x54, 0x0f, 0x01, 0x05, 0x07,
					0x54, 0x57, 0x54, 0x00, 0x07, 0x52, 0x52, 0x06, 0x05, 0x52, 0x55, 0x05, 0x02, 0x53, 0x07, 0x57,
					0x50, 0x6f, 0x02, 0x4f, 0x74, 0x7c, 0x5e, 0x64, 0x03, 0x41, 0x5e, 0x74, 0x79, 0x05, 0x5c, 0x0e,
					0x5a, 0x71, 0x79, 0x5d, 0x6e, 0x7c, 0x67, 0x0b, 0x0b, 0x36, 0x36, 0x36, 0x36, 0x36, 0x36, 0x36,
					0x36 };

			byte[] key2 = { 0x64, 0x6f, 0x3f, 0x65, 0x6a, 0x3e, 0x6e, 0x6c, 0x65, 0x39, 0x3e, 0x65, 0x6b, 0x6f, 0x6d,
					0x3e, 0x3d, 0x3e, 0x6a, 0x6d, 0x38, 0x38, 0x6c, 0x6f, 0x38, 0x3f, 0x6f, 0x68, 0x39, 0x6d, 0x3d,
					0x3a, 0x05, 0x68, 0x25, 0x1e, 0x16, 0x34, 0x0e, 0x69, 0x2b, 0x34, 0x1e, 0x13, 0x6f, 0x36, 0x64,
					0x30, 0x1b, 0x13, 0x37, 0x04, 0x16, 0x0d, 0x61, 0x61, 0x5c, 0x5c, 0x5c, 0x5c, 0x5c, 0x5c, 0x5c,
					0x5c };

			byte[] data = CommUtil.mergeByteArray(key1, params.getBytes());
			data = CommUtil.sha1(data);
			data = CommUtil.mergeByteArray(key2, data);
			data = CommUtil.sha1(data);
			return CommUtil.base64encode(data);
		} catch (Exception e) {
			return "";
		}
	}
}