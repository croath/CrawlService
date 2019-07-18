package com.tencent.mm;

import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PyMain {

	public static void test() {
		String url = // "https://szsupport.weixin.qq.com/cgi-bin/mmsupport-bin/addchatroombyqrcode?uuid=AVoaVXL_wsTwyVnS&exportkey=AzSLtbbTvGn1Uypr2M5qc10%3D&pass_ticket=TtXeGtcczN%2BvFmnil6EeNeIJVKsuk0BA%2B3Vu0gZOtrc4LSWR2bVqgw3UyjZ7vMZK&wechat_real_lang=zh_CN";
				"https://szsupport.weixin.qq.com/cgi-bin/mmsupport-bin/addchatroombyqrcode?uuid=AVoaVXL_wsTwyVnS&exportkey=A75XMX4lypn62t0w8OA%2Fn8A%3D&pass_ticket=%2Bl1vAECe7aI1PwFfIuz0Fl5uYt3JsBtPtRTb7HJ1gb0ttYCZ%2F1DSs9QOfeTQ22wr&wechat_real_lang=zh_CN";

		// String cache-control: max-age=0
		// origin: https://szsupport.weixin.qq.com
		// upgrade-insecure-requests: 1
		// content-type: application/x-www-form-urlencoded
		// user-agent: Mozilla/5.0 (Linux; Android 6.0; Nexus 6P Build/MDA89D;
		// wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0
		// Chrome/66.0.3359.126 MQQBrowser/6.2 TBS/044606 Mobile Safari/537.36
		// MMWEBID/7880 MicroMessenger/7.0.3.1400(0x27000334) Process/tools
		// NetType/WIFI Language/zh_CN
		// accept:
		// text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,image/wxpic,image/sharpp,image/apng,image/tpg,*/*;q=0.8
		String referer = "https://szsupport.weixin.qq.com/cgi-bin/mmsupport-bin/addchatroombyqrcode?uuid=AVoaVXL_wsTwyVnS&exportkey=AzSLtbbTvGn1Uypr2M5qc10%3D&pass_ticket=TtXeGtcczN%2BvFmnil6EeNeIJVKsuk0BA%2B3Vu0gZOtrc4LSWR2bVqgw3UyjZ7vMZK&wechat_real_lang=zh_CN";
		// accept-encoding: gzip, deflate, br
		// accept-language: zh-CN,en-US;q=0.9
		// q-ua2:
		// QV=3&PL=ADR&PR=WX&PP=com.tencent.mm&PPVN=7.0.3&TBSVC=43620&CO=BK&COVC=044606&PB=GE&VE=GA&DE=PHONE&CHID=0&LCID=9422&MO=
		// Nexus6P &RL=1440*2392&OS=6.0&API=23
		// q-guid: 699adce8ef9a1144b3c583c913b788cb
		// q-auth: 31045b957cf33acf31e40be2f3e71c5217597676a9729f1b

		// forBlackberry=forceToUsePost

		// method: POST
		// authority: szsupport.weixin.qq.com

		// forBlackberry=forceToUsePost

		try {
			OkHttpClient okHttpClient = new OkHttpClient();
			final Request request = new Request.Builder().url(
					"https://szsupport.weixin.qq.com/cgi-bin/mmsupport-bin/addchatroombyqrcode?uuid=AVoaVXL_wsTwyVnS&exportkey=A75XMX4lypn62t0w8OA%2Fn8A%3D&pass_ticket=%2Bl1vAECe7aI1PwFfIuz0Fl5uYt3JsBtPtRTb7HJ1gb0ttYCZ%2F1DSs9QOfeTQ22wr&wechat_real_lang=zh_CN")
					// .header("referer", referer)
					// .header("cache-control", "max-age=0")
					// .header("origin", "https://szsupport.weixin.qq.com")
					// .header("upgrade-insecure-requests", "1")
					// .header("user-agent", "Mozilla/5.0 (Linux; Android 6.0;
					// Nexus 6P Build/MDA89D; wv) AppleWebKit/537.36 (KHTML,
					// like Gecko) Version/4.0 Chrome/66.0.3359.126
					// MQQBrowser/6.2 TBS/044606 Mobile Safari/537.36
					// MMWEBID/7880 MicroMessenger/7.0.3.1400(0x27000334)
					// Process/tools NetType/WIFI Language/zh_CN")
					// .header("accept",
					// "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,image/wxpic,image/sharpp,image/apng,image/tpg,*/*;q=0.8")
					// .header("referer",
					// "https://szsupport.weixin.qq.com/cgi-bin/mmsupport-bin/addchatroombyqrcode?uuid=AVoaVXL_wsTwyVnS&exportkey=Awu3hjXSuX4IxHj8Xh7odEE%3D&pass_ticket=TtXeGtcczN%2BvFmnil6EeNeIJVKsuk0BA%2B3Vu0gZOtrc4LSWR2bVqgw3UyjZ7vMZK&wechat_real_lang=zh_CN")
					// .header("accept-encoding", "gzip, deflate, br")
					// .header("accept-language", "zh-CN,en-US;q=0.9")
					// .header("q-ua2",
					// "QV=3&PL=ADR&PR=WX&PP=com.tencent.mm&PPVN=7.0.3&TBSVC=43620&CO=BK&COVC=044606&PB=GE&VE=GA&DE=PHONE&CHID=0&LCID=9422&MO=
					// Nexus6P &RL=1440*2392&OS=6.0&API=23")
					// .header("q-guid", "699adce8ef9a1144b3c583c913b788cb")
					// .header("q-auth",
					// "31045b957cf33acf31e40be2f3e71c5217597676a9729f1b")
					// .post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"),
					// "forBlackberry=forceToUsePost"))
					.build();
			Call call = okHttpClient.newCall(request);
			Response response = call.execute();
			System.out.println("ssss:" + response.header("location"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public static final MediaType JSON = MediaType.parse("application/json");
	public static String  login (String userid, String password) throws Exception{
		JsonObject json = new JsonObject();

		// json.
		json.addProperty("user_id", userid);
		json.addProperty("password", password);

		Request req = new Request.Builder().url("https://andromeda.dev:8443/api_rad/v1/auth")
				.post(RequestBody.create(JSON, json.toString())).build();
		OkHttpClient okHttpClient = new OkHttpClient();
		Response resp = okHttpClient.newCall(req).execute();
	//	System.out.println("" + resp.body().string());
		JsonObject res = new JsonParser().parse(resp.body().string()).getAsJsonObject();
		return res.get("payload").getAsJsonObject().get("token").getAsString();

	}

	public static String getRepyMessage(String token ) throws Exception{
		
		JsonObject json = new JsonObject();
		json.addProperty("timestamp", "1563345642");
		json.addProperty("receiver_id" , "14041950753@chatroom");
		json.addProperty("sender_id", "friendid");
		json.addProperty("message", "fruit");
		json.addProperty("attachments", "[]");
		
		Request req = new Request.Builder().url("http://andromeda.dev:15007/wechat/receive/group")
				.post(RequestBody.create(JSON, json.toString()))
				.header("Authorization", "Bearer "+ token)
				.build();
		
		OkHttpClient okHttpClient = new OkHttpClient();
		Response resp = okHttpClient.newCall(req).execute();
		System.out.println("" + resp.body().string());
		return null;
		
	}
	public static void main(String[] args) {
		try {
			String token = login("aefa03e9-cce9-4efd-ad9d-132bec23d19c", "test");
			getRepyMessage(token);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
