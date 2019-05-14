package com.module.test;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.google.gson.JsonObject;
import com.module.meituan.MeituanModule;
import com.utils.KeyValue;
import com.utils.OkHttpUtils;
import com.utils.RequestBean;

import okhttp3.Call;
import okhttp3.Callback;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ChannelpageModel {
	
	private static void testPostChannel() throws Exception {
		
		ChannelParam params = ChannelParam.generateParam(null);
		RequestBean poiRequest = getPoiChannepageRequest(params);
		sendRequest(poiRequest);
	}

			
	private static void sendRequest(RequestBean poiRequest) throws IOException {
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(poiRequest.requestUrl)
				.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), poiRequest.requestBody))
				//.header("siua","E8smAlnR7uHOFVbXYVGV3k7/17XChPjPkYyjpLFyxWb8v3mb3i6xorTU1wcHr4mSfKbbFIsNaWTyQZt77JHDpzFGdA0nY1KD5EOwvjlbibf/KVuYwzp+adkPkbb8W6+1FCEDbDxjhyHvA9A38DFwFBFJUK6cyc/RZ0Cw1IHX5/dQKzuMAg6CwOIYwb7pUpoRv/hF7Ko5xKMKJrduam8UOEG38rINPuNwBaqk385CFTrPpeu1fk+A+GDaEnUtbSao8yT/eYQPRoFYC83JOq3IWIvcJfjQmYSZo55lSLxGsZgRcLnJWGXB3nyrC+44MOmcK7zoKR53+Asg727hgYVfOm6PXDjVXZe2UMjtAqwlbXgb58PSBhDD4c2x109N/X6mnuJXm8AhuOZtmgBuBSN2+PU61PHR1IOxYahm87bHQZ+rM/0+M3MSCQtF+FP3C7WE0qB0aJHU12BvTBxNQfw5WzcitDNVbq4JkQNlwe84zkSAwQqrb+tilIWz5PdwJ0uGHE/Y2G9jsOnR+0GvMfvWMYccpHzO08TLvQUTfpBzgDHteJ8hrh+7+jnWOsM0BBXOxlEhL+R11Kas2AIZkJZ0e0FCnmtH8ZLeP1jMYvt6/yilI/E4y5AtPH4XWjP6LNg98APqrpMMSWjn0ixLsiVnRXXI77IamU9oD0WjyHoCotQ=")
				.build();
		Call call = okHttpClient.newCall(request);
		Response response = call.execute();
		System.out.println("" + response.body().string());
	

	}

	public static RequestBean getPoiChannepageRequest(ChannelParam params) throws Exception {
		String url = "http://wmapi.meituan.com/api/v7/poi/channelpage";
		List<KeyValue> query = new ArrayList<KeyValue>();
		List<KeyValue> body = new ArrayList<KeyValue>();

		query.add(new KeyValue("ci", params.ci));
		query.add(new KeyValue("utm_content", params.utm_content));
		query.add(new KeyValue("utm_medium", params.utm_medium));
		query.add(new KeyValue("uuid", params.uuid));
		query.add(new KeyValue("utm_term", params.utm_term));
		query.add(new KeyValue("utm_campaign", params.utm_campaign));
		query.add(new KeyValue("utm_source", params.utm_source));
		query.add(new KeyValue("region_id",  params.region_id));
		query.add(new KeyValue("region_version",  params.region_version));

		body.add(new KeyValue("latitude", params.latitude));
		body.add(new KeyValue("longitude", params.longitude));
		body.add(new KeyValue("page_index", params.page_index));
		body.add(new KeyValue("page_size", params.page_size));
		body.add(new KeyValue("sort_type", params.sort_type));
		body.add(new KeyValue("category_type", params.category_type));
		body.add(new KeyValue("filter_type", params.filter_type));
		body.add(new KeyValue("second_category_type", params.second_category_type));
		body.add(new KeyValue("navigate_type", params.navigate_type));
		body.add(new KeyValue("activity_filter_codes", params.activity_filter_codes));
		body.add(new KeyValue("slider_select_data", params.slider_select_data));
		body.add(new KeyValue("load_type", params.load_type));
		body.add(new KeyValue("preload", params.preload));
		body.add(new KeyValue("trace_tag", params.trace_tag));
		body.add(new KeyValue("rank_trace_id", params.rank_trace_id));
		body.add(new KeyValue("session_id", params.session_id));
		body.add(new KeyValue("union_id", params.union_id));
		body.add(new KeyValue("app", params.app));
		body.add(new KeyValue("platform", params.platform));
		body.add(new KeyValue("push_token", params.push_token));
		body.add(new KeyValue("wm_latitude", params.wm_latitude));
		body.add(new KeyValue("userid", params.userid));
		body.add(new KeyValue("wm_logintoken", params.wm_logintoken));
		body.add(new KeyValue("wm_mac", params.wm_mac));
		body.add(new KeyValue("wm_uuid", params.wm_uuid));
		body.add(new KeyValue("version", params.version));
		body.add(new KeyValue("wm_actual_longitude", params.wm_actual_longitude));
		body.add(new KeyValue("wm_dtype", params.wm_dtype));
		body.add(new KeyValue("request_id", params.request_id));
		body.add(new KeyValue("wm_actual_latitude", params.wm_actual_latitude));
		body.add(new KeyValue("wm_did", params.wm_did));
		body.add(new KeyValue("wm_ctype", params.wm_ctype));
		body.add(new KeyValue("wm_visitid", params.wm_visitid));
		body.add(new KeyValue("seq_id", params.seq_id));
		body.add(new KeyValue("partner", params.partner));
		body.add(new KeyValue("uuid", params.uuid));
		body.add(new KeyValue("wm_appversion", params.wm_appversion));
		body.add(new KeyValue("wm_dversion", params.wm_dversion));
		body.add(new KeyValue("wm_longitude", params.wm_longitude));
		body.add(new KeyValue("wm_channel", params.wm_channel));
		body.add(new KeyValue("wm_seq", params.wm_seq));
		body.add(new KeyValue("req_time", ""+System.currentTimeMillis()));

		String waimai_sign = MeituanModule.calc_sign("wmapi.meituan.com/api/v7/poi/channelpage", body);
		body.add(new KeyValue("waimai_sign", waimai_sign));
		
		query.add(new KeyValue("__skck", "6a375bce8c66a0dc293860dfa83833ef"));
		query.add(new KeyValue("__skts","" + System.currentTimeMillis() ));
		query.add(new KeyValue("__skua", "d41d8cd98f00b204e9800998ecf8427e"));
		query.add(new KeyValue("__skno",UUID.randomUUID().toString()));
		String __skcy = MeituanModule.calc_skcy(url, query, body);
		query.add(new KeyValue("__skcy", URLEncoder.encode(__skcy)));
		RequestBean poiRequest = new RequestBean();
		poiRequest.requestUrl = url + "?" + list2String(query);
		poiRequest.requestBody = list2String(body);
		return poiRequest;

	}

	private static String list2String(List<KeyValue> list) {
		StringBuilder sb = new StringBuilder();
		for (KeyValue item : list) {
			sb.append(item.key + "=" + item.value + "&");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
	
	public static void main(String args[]) {
		try {

			testPostChannel();
		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void uuidRegister() throws IOException{
		String requestBody = "devid=359125052338383&"
							+ "ctype=android&"
							+ "android_id=f82362fcd5b710e0&"
							+ "serial_number=067b8c74439cd0f9&"
							+ "brand=Android&"
							+ "model=AOSP+on+HammerHead";
		Request request = new Request.Builder()
				.url("http://api.mobile.meituan.com//uuid/v2/register")
				.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
				.build();
		
		Response resp = OkHttpUtils.postSync(request);
		System.out.println(""+resp.body().string());
	}
	
	public static void unionidRegister() throws IOException{
		
		JsonObject obj = new JsonObject();
		
		JsonObject communicationInfo = new JsonObject();
		communicationInfo.addProperty("jddje", "");
		communicationInfo.addProperty("nop", "unknown");
		communicationInfo.addProperty("jntj","");
		obj.add("communicationInfo", communicationInfo);
		
		JsonObject environmentInfo = new JsonObject();
		environmentInfo.addProperty("platform", "android");
		environmentInfo.addProperty("osName", "aosp_hammerhead-userdebug 4.4.4 KTU84P eng.tux.20171204.151609 test-keys");
		environmentInfo.addProperty("clientType","4");
		environmentInfo.addProperty("osVersion","4.4.4");
		obj.add("environmentInfo", environmentInfo);
		
		JsonObject idInfo = new JsonObject();
		idInfo.addProperty("requiredId", "1");
		idInfo.addProperty("unionId", "");
		idInfo.addProperty("dpid","");
		idInfo.addProperty("localUuid","");
		idInfo.addProperty("localId","8a1b51b7ad0c1d71626ad3f8966e26ffd5c862139042fb8895");
		obj.add("idInfo", idInfo);
		
		JsonObject deviceInfo = new  JsonObject();
			JsonObject brandInfo = new  JsonObject();
			brandInfo.addProperty("deviceModel","AOSP on HammerHead");
			brandInfo.addProperty("brand", "Android");
			deviceInfo.add("brandInfo", brandInfo);
			
			JsonObject secondaryDeviceInfo = new  JsonObject();
			secondaryDeviceInfo.addProperty("serialNumber", "067b8c74439cd0f9");
			secondaryDeviceInfo.addProperty("wifiMac", "f8:a9:d0:1c:bd:87");
			secondaryDeviceInfo.addProperty("simulateId", "359125052338383");
			secondaryDeviceInfo.addProperty("bluetoothMac", "F8:A9:D0:AD:85:FE");
			deviceInfo.add("secondaryDeviceInfo", secondaryDeviceInfo);
			
			JsonObject keyDeviceInfo = new  JsonObject();
			secondaryDeviceInfo.addProperty("serialNumber", "067b8c74439cd0f9");
			secondaryDeviceInfo.addProperty("androidId"	, "f82362fcd5b710e0");
			secondaryDeviceInfo.addProperty("imei2","359125052338383");
			secondaryDeviceInfo.addProperty("meid","359125052338383");
			secondaryDeviceInfo.addProperty("imei1", "359125052338383");
			deviceInfo.add("keyDeviceInfo", keyDeviceInfo);
		obj.add("deviceInfo", deviceInfo);
		
		
		JsonObject appInfo = new  JsonObject();
		appInfo.addProperty("appName", "waimai");
		appInfo.addProperty("app", "com.sankuai.meituan.takeoutnew");
		appInfo.addProperty("userId", "");
		appInfo.addProperty("appName", "waimai");
		appInfo.addProperty("sdkVersion", "1.6.3");
		appInfo.addProperty("version","6.6.7");
		obj.add("appInfo", appInfo);
		

		String requestBody = obj.toString();
		System.out.println(requestBody);
		Request request = new Request.Builder()
				.url("http://api-unionid.meituan.com/unionid/android/register")
				.post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), requestBody))
				.build();
		
		Response resp = OkHttpUtils.postSync(request);
		System.out.println(""+resp.body().string());
	}
	
	public static void dpmtpushRegister() throws IOException{
		JsonObject  obj = new JsonObject();
		obj.addProperty("os", "4.4.4");
		obj.addProperty("model","AOSP on HammerHead");
		obj.addProperty("random", "1552013586442");
		obj.addProperty("brand", "Android");
		obj.addProperty("mac",   "f8:a9:d0:1c:bd:87");
		obj.addProperty("signature", "21cf9dcc0eaec5785b028605844673b3587eb406");
		obj.addProperty("network", 1);
		obj.addProperty("mode", 1);
		obj.addProperty("deviceid", "359125052338383");
		
		String requestBody = obj.toString();
		System.out.println(requestBody);
		Request request = new Request.Builder()
				.url("http://dpmtpush.dianping.com//sdkapi/newreg")
				.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
				.header("PushToken", "")
				.header("SdkVersion", "200")
		        .header("AppName", "com.sankuai.meituan.takeoutnew")
		        .header("PhoneType", "1")
				.build();
		
		Response resp = OkHttpUtils.postSync(request);
		System.out.println(""+resp.body().string());
		
		
//		POST /sdkapi/newreg HTTP/1.1
//		PushToken: 
//		SdkVersion: 200
//		AppName: com.sankuai.meituan.takeoutnew
//		PhoneType: 1
//		User-Agent: Dalvik/1.6.0 (Linux; U; Android 4.4.4; AOSP on HammerHead Build/KTU84P)
//		Host: dpmtpush.dianping.com
//		Accept-Encoding: gzip
//		Content-Type: 
//		Content-Length: 217
//		Connection: keep-alive

		
	}
}

