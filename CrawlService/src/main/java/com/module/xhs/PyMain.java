package com.module.xhs;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.utils.StringUtil;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PyMain {

	public static void main(String[] args) {
		try {
			
			user_VfcCode();
			//checkCode();
			//userCodeLogin();
			//user_activate();
			//test();
			//userSocicalLogin();
			
			//noteSearch();
			//userDetail();
			//userNotes();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	private static void checkCode() {
		// TODO Auto-generated method stub
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		String url = "?"
				+ "code=191801&"
				+ "deviceId=BC7F7299-5E59-4DBD-A766-09B43E1C55C3&"
				+ "device_fingerprint=20190514151504b9111df83ee8a302f95978a60debfcab01ec4d7b7756a340&"
				+ "device_fingerprint1=20190514151504b9111df83ee8a302f95978a60debfcab01ec4d7b7756a340&"
				+ "lang=zh&"
				+ "phone=18681544318&"
				+ "platform=iOS&"
				+ "sid=session.1557828008805038672883&"
				+ "sign=4b6d2fe29e0b30d3bbccc8216664d00e&"
				+ "t=1557828049&"
				+ "zone=86";
		
		query.put("code", "191801");
		query.put("deviceId", "B60DCB34-D088-4B58-B7AE-45FBA1B22B6B");
		query.put("device_fingerprint", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("device_fingerprint1", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("lang", "zh");
		query.put("phone", "18681544318");
		query.put("platform", "iOS");
		query.put("sid", "session.1557818110169391090697");
		query.put("zone", "86");
		query.put("t", "1557818347");
		query.put("t", "1557818347");
		
		query.put("sign", XhsModlue.calcSign(query));
		String shiled = XhsModlue.calShiled(query, "/api/sns/v1/system_service/check_code");

		StringBuilder sb = new StringBuilder();
		sb.append("https://www.xiaohongshu.com/api/sns/v1/system_service/check_code?");
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		requestGet(sb.toString(), shiled);
	}


	private static void user_VfcCode() throws Exception {
		HashMap<String, String> query = new LinkedHashMap<String, String>();
	
		
		query.put("deviceId", "B60DCB34-D088-4B58-B7AE-45FBA1B22B6B");
		query.put("device_fingerprint", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("device_fingerprint1", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("lang", "zh");
		query.put("phone", "18681544318");
		query.put("platform", "iOS");
		query.put("sid", "session.1557818110169391090697");
		query.put("type", "login");
		query.put("zone", "86");
		query.put("t", "1557818347");
		query.put("sign", XhsModlue.calcSign(query));
		
		query.put("crypt_method", "eac4e6e24b69082b");
		String shiled = XhsModlue.calShiled(query, "/api/sns/v1/system_service/vfc_code");
		StringBuilder sb = new StringBuilder();
		sb.append("https://www.xiaohongshu.com/api/sns/v1/system_service/vfc_code?");
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		requestGet(sb.toString(), shiled);
		
	}


	private static void user_activate() throws Exception {
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		
		query.put("imei", "867981023009148");
		query.put("android_id", "1530f8b6871414c8");
		query.put("platform","android");
		query.put("deviceId", "d1636a77-fce0-3fbe-8f9b-d3c0685f3f6e");
		query.put("device_fingerprint", "201904241048288e339865b3a94c4de43400dd39c5e0fc01bd100daef7fdce");
		query.put("device_fingerprint1", "201904241048288e339865b3a94c4de43400dd39c5e0fc01bd100daef7fdce");
		query.put("lang", "zh-lang");
		query.put("t", "1556437250882");
		
		String sign = XhsModlue.calcSign(query);
		query.put("sign", sign);
		String shiled = XhsModlue.calShiled(query, "/api/sns/v1/user/activate");

		String requestUrl = "https://www.xiaohongshu.com/api/sns/v1/user/activate";
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		String requestBody = sb.toString();
		try {
			OkHttpClient okHttpClient = new OkHttpClient();
			final Request request = new Request.Builder().url(requestUrl)
					.header("User-Agent",
							"Dalvik/1.6.0 (Linux; U; Android 4.4.4; HM2014811 Build/KTU84Q) Resolution/720*1280 Version/5.22.0 Build/5220137 Device/(Xiaomi;HM2014811)")
					.header("shield", shiled)
					.header("device_id", "60eef661-b43f-33b4-b600-c24a199d4a09")
					.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
					.build();
			Call call = okHttpClient.newCall(request);
			Response response = call.execute();
			System.out.print(response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void test() {
		byte[] data = StringUtil.toByteArray("eac4e6e24b69082b");
		String device_id = "B60DCB34-D088-4B58-B7AE-45FBA1B22B6B";
		String alg = XhsModlue.D0(data, device_id);
		System.out.println("alg:"+alg);
	}

	private static void userCodeLogin() throws Exception {
		// TODO Auto-generated method stub
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		
		String str = "appname=%E5%B0%8F%E7%BA%A2%E4%B9%A6&"
				+ "deviceId=BC7F7299-5E59-4DBD-A766-09B43E1C55C3&"
				+ "device_fingerprint=20190514151504b9111df83ee8a302f95978a60debfcab01ec4d7b7756a340&"
				+ "device_fingerprint1=20190514151504b9111df83ee8a302f95978a60debfcab01ec4d7b7756a340&"
				+ "idfa=69478F67-CDEE-4AB6-87D2-91E29A2DAF1D&"
				+ "idfv=9FF5A5B6-8F1E-4D20-B837-7EA72938F266&"
				+ "lang=zh&"
				+ "mobile_token=mobile_token%3Ayashumgipn&"
				+ "package=com.xingin.discover&"
				+ "phone=18877373903&"
				+ "platform=iOS&"
				+ "sid=session.1557828008805038672883&"
				+ "sign=811eefc81063d3384fbc57afb7e3f38c&"
				+ "t=1557828049&"
				+ "type=phone&"
				+ "zone=86";
		
		query.put("app_name", "小红书");
		query.put("deviceId", "B60DCB34-D088-4B58-B7AE-45FBA1B22B6B");
		query.put("device_fingerprint", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("device_fingerprint1", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		
		query.put("idfa", "69478F67-CDEE-4AB6-87D2-91E29A2DAF1D");
		query.put("idfv","9FF5A5B6-8F1E-4D20-B837-7EA72938F266");
		query.put("lang", "zh");
		query.put("mobile_token", "mobile_token:uwajalghxe");
		query.put("package", "com.xingin.discover");
		query.put("phone", "18681544318");
		
		query.put("platform", "iOS");
		query.put("sid", "session.1557828008805038672883");
		query.put("type", "phone");
		
		query.put("zone", "86");
		query.put("t", "1557828049");
		String sign = XhsModlue.calcSign(query);
		query.put("sign", sign);
		
		String shiled = XhsModlue.calShiled(query, "/api/sns/v4/user/login/code");

		//"afc64d8205151f49bcd4bba6dc185c2d";
		String requestUrl = "https://www.xiaohongshu.com/api/sns/v4/user/login/code";
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		String requestBody = sb.toString();
		try {
			OkHttpClient okHttpClient = new OkHttpClient();
			final Request request = new Request.Builder().url(requestUrl)
					.header("User-Agent",
							"Dalvik/1.6.0 (Linux; U; Android 4.4.4; HM2014811 Build/KTU84Q) Resolution/720*1280 Version/5.22.0 Build/5220137 Device/(Xiaomi;HM2014811)")
					.header("shield", shiled)
					.header("device_id", "60eef661-b43f-33b4-b600-c24a199d4a09")
					.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
					.build();
			Call call = okHttpClient.newCall(request);
			Response response = call.execute();
			System.out.println("onResponse: " + response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void userSocicalLogin() throws Exception {
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		query.put("android_id", "67582d1308caaa34");
		query.put("nickname", "dennychen");
		query.put("token",
				"21_CaPkKMM63DnzNG3J3QT7rXiE1hz5x4zDZ3fSDI-iI1VL0gdBggahwMFzHrLqdyrMn6y_2aBHCtK9_koQlFgeyIRNl76-M5TqhsDLVkwi5i8");
		query.put("unionid", "oky2-t_VXiW1nHxMsiMaELGdcUQc");
		query.put("imei", "359125052714981");
		query.put("tokenExireTime", "1970-01-01 08:00:00");
		query.put("gender", "2");
		query.put("openid", "oJ5rgjpp16h_mV35W0qXaWFenwSQ");
		query.put("type", "weixin");
		query.put("platform", "Android");
		query.put("deviceId", "60eef661-b43f-33b4-b600-c24a199d4a09");
		query.put("device_fingerprint", "20190119154852434b0309d1caab90414ad6c350dd15ec0116ef7ac9c2fd74");
		query.put("device_fingerprint1", "20190119154852434b0309d1caab90414ad6c350dd15ec0116ef7ac9c2fd74");
		query.put("versionName", "5.22.0");
		query.put("channel", "YingYongBao");
		query.put("lang", "zh-lang");
		query.put("t", "1556437250882");
		String sign = XhsModlue.calcSign(query);
		query.put("sign", sign);
		String shiled = XhsModlue.calShiled(query, "/api/sns/v4/user/login/social");

		String requestUrl = "https://www.xiaohongshu.com/api/sns/v4/user/login/social";
		StringBuilder sb = new StringBuilder();
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		String requestBody = sb.toString();
		try {
			OkHttpClient okHttpClient = new OkHttpClient();
			final Request request = new Request.Builder().url(requestUrl)
					.header("User-Agent",
							"Dalvik/1.6.0 (Linux; U; Android 4.4.4; HM2014811 Build/KTU84Q) Resolution/720*1280 Version/5.22.0 Build/5220137 Device/(Xiaomi;HM2014811)")
					.header("shield", shiled)
					.header("device_id", "60eef661-b43f-33b4-b600-c24a199d4a09")
					.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
					.build();
			Call call = okHttpClient.newCall(request);
			Response response = call.execute();
			System.out.println("onResponse: " + response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static void userDetail() throws Exception {
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		query.put("platform", "Android");
		query.put("deviceId", "425cef0d-33bb-374e-bdc3-deda9c344722");
		query.put("device_fingerprint", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("device_fingerprint1", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("versionName", "5.22.0");
		query.put("channel", "YingYongBao");
		query.put("sid", "session.1547780789878540128");
		query.put("lang", "en");
		query.put("t", "1550129662");
		query.put("sign", XhsModlue.calcSign(query));
		String shiled = XhsModlue.calShiled(query, "/api/sns/v3/user/55519d7cb203d93d4c2885ed/info");

		StringBuilder sb = new StringBuilder();
		sb.append("https://www.xiaohongshu.com/api/sns/v3/user/55519d7cb203d93d4c2885ed/info?");
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());
		requestGet(sb.toString(), shiled);
	}
	private static void userNotes() throws Exception {
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		String str = "page=1&" + "page_size=10&" + "sub_tag_id=&" + "platform=Android&"
				+ "deviceId=425cef0d-33bb-374e-bdc3-deda9c344722&"
				+ "device_fingerprint=20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63&"
				+ "device_fingerprint1=20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63&"
				+ "versionName=5.22.0&channel=YingYongBao&sid=session.1547780789878540128&lang=en&t=1550129664&sign=c394f62dcffca8fa11a417799fa84a1d";
		query.put("page", "1");
		query.put("page_size", "10");
		query.put("sub_tag_id", "");

		query.put("platform", "Android");
		query.put("deviceId", "425cef0d-33bb-374e-bdc3-deda9c344722");
		query.put("device_fingerprint", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("device_fingerprint1", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("versionName", "5.22.0");
		query.put("channel", "YingYongBao");
		query.put("sid", "session.1547780789878540128");
		query.put("lang", "en");
		query.put("t", "1550129664");
		query.put("sign", XhsModlue.calcSign(query));

		String shiled = XhsModlue.calShiled(query, "/api/sns/v2/note/user/55519d7cb203d93d4c2885ed");
		StringBuilder sb = new StringBuilder();
		sb.append("https://www.xiaohongshu.com/api/sns/v2/note/user/55519d7cb203d93d4c2885ed?");
		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());

		requestGet(sb.toString(), shiled);
	}

	private static void noteSearch() throws Exception {
		HashMap<String, String> query = new LinkedHashMap<String, String>();
		query.put("keyword", "健");
		query.put("sort", "");
		query.put("page", "1");
		query.put("page_size", "20");
		query.put("source", "follow_feed");
		query.put("search_id", "A48444ED1F92B94BFC4C482C892B083D");
		query.put("platform", "Android");
		query.put("deviceId", "425cef0d-33bb-374e-bdc3-deda9c344722");
		query.put("device_fingerprint", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("device_fingerprint1", "20190102161106ec4a4ba2c366f03746775b3f22b0bde9015d1fb51eae3b63");
		query.put("versionName", "5.22.0");
		query.put("channel", "YingYongBao");
		query.put("sid", "session.1547780789878540128");
		query.put("lang", "en");
		query.put("t", "" + System.currentTimeMillis() / 1000);
		query.put("sign", XhsModlue.calcSign(query));
		String shiled = XhsModlue.calShiled(query, "/api/sns/v8/search/notes");
		System.out.println("shiled:"+ shiled);
		StringBuilder sb = new StringBuilder();
		sb.append("https://www.xiaohongshu.com/api/sns/v8/search/notes?");

		for (Map.Entry<String, String> entry : query.entrySet()) {
			sb.append(entry.getKey() + "=" + entry.getValue() + "&");
		}
		sb.deleteCharAt(sb.length() - 1);
		System.out.println(sb.toString());

		requestGet(sb.toString(), shiled);
	}

	private static void requestGet(String requestUrl, String shiled) {
		try {
			OkHttpClient okHttpClient = new OkHttpClient();
			final Request request = new Request.Builder().url(requestUrl)
					.header("Authorization", "session.1547780789878540128")
					.header("device_id", "425cef0d-33bb-374e-bdc3-deda9c344722")
					.header("User-Agent",
							"Dalvik/1.6.0 (Linux; U; Android 4.4.4; HM2014811 Build/KTU84Q) Resolution/720*1280 Version/5.22.0 Build/5220137 Device/(Xiaomi;HM2014811)")
					.header("shield", shiled).build();
			Call call = okHttpClient.newCall(request);
			Response response = call.execute();
			System.out.println("onResponse: " + response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
