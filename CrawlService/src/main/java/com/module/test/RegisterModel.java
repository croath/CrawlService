package com.module.test;

import java.io.IOException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.utils.OkHttpUtils;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class RegisterModel {
	public static RegisterResult register() {
		RegisterParams rp = RegisterParams.generateParam();
		RegisterResult rr = new RegisterResult();
		rr.uuid 		= uuidRegister(rp);
		rr.unionid 		= unionidRegister(rp);
		rr.push_token	= dpmtpushRegister(rp);
		rr.deviceid     = rp.deviceid;
		rr.mac 			= rp.mac;
		rr.deviceModel  = rp.deviceModel;
		
		return rr;
	} 
	
	public static String uuidRegister(RegisterParams params){
		try {
			String requestBody = "devid="+params.devid+"&"
								+ "ctype="+params.ctype+"&"
								+ "android_id="+params.android_id+"&"
								+ "serial_number="+params.serial_number+"&"
								+ "brand="+params.brand+"&"
								+ "model="+params.model+"";
			Request request = new Request.Builder()
					.url("http://api.mobile.meituan.com/uuid/v2/register")
					.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
					.build();
			
			Response resp = OkHttpUtils.postSync(request);
			JsonObject json = (JsonObject) new JsonParser().parse(resp.body().string());
			return json.get("uuid").getAsString();
		}catch(Exception e) {
			return "";
		}
	}
	
	public static String unionidRegister(RegisterParams params) {
		try {
			JsonObject obj = new JsonObject();
			
			JsonObject communicationInfo = new JsonObject();
			communicationInfo.addProperty("jddje", params.jddje);
			communicationInfo.addProperty("nop", params.nop);
			communicationInfo.addProperty("jntj",params.jntj);
			obj.add("communicationInfo", communicationInfo);
			
			JsonObject environmentInfo = new JsonObject();
			environmentInfo.addProperty("platform", params.platform);
			environmentInfo.addProperty("osName", params.osName);
			environmentInfo.addProperty("clientType",params.clientType);
			environmentInfo.addProperty("osVersion",params.osVersion);
			obj.add("environmentInfo", environmentInfo);
			
			JsonObject idInfo = new JsonObject();
			idInfo.addProperty("requiredId", params.requiredId);
			idInfo.addProperty("unionId", params.unionId);
			idInfo.addProperty("dpid",params.dpid);
			idInfo.addProperty("localUuid",params.localUuid);
			idInfo.addProperty("localId",params.localId);
			obj.add("idInfo", idInfo);
			
			JsonObject deviceInfo = new  JsonObject();
				JsonObject brandInfo = new  JsonObject();
				brandInfo.addProperty("deviceModel",params.deviceModel);
				brandInfo.addProperty("brand", params.brand);
				deviceInfo.add("brandInfo", brandInfo);
				
				JsonObject secondaryDeviceInfo = new  JsonObject();
				secondaryDeviceInfo.addProperty("serialNumber", params.serial_number);
				secondaryDeviceInfo.addProperty("wifiMac", params.wifiMac);
				secondaryDeviceInfo.addProperty("simulateId", params.simulateId);
				secondaryDeviceInfo.addProperty("bluetoothMac", params.bluetoothMac);
				deviceInfo.add("secondaryDeviceInfo", secondaryDeviceInfo);
				
				JsonObject keyDeviceInfo = new  JsonObject();
				secondaryDeviceInfo.addProperty("serialNumber", params.serial_number);
				secondaryDeviceInfo.addProperty("androidId"	, params.androidId);
				secondaryDeviceInfo.addProperty("imei2",params.imei2);
				secondaryDeviceInfo.addProperty("meid",params.meid);
				secondaryDeviceInfo.addProperty("imei1", params.imei1);
				deviceInfo.add("keyDeviceInfo", keyDeviceInfo);
			obj.add("deviceInfo", deviceInfo);
			
			
			JsonObject appInfo = new  JsonObject();
			appInfo.addProperty("appName", params.appName);
			appInfo.addProperty("app", params.app);
			appInfo.addProperty("userId",params.userId);
			appInfo.addProperty("appName", params.appName);
			appInfo.addProperty("sdkVersion", params.sdkVersion);
			appInfo.addProperty("version", params.version);
			obj.add("appInfo", appInfo);
			

			String requestBody = obj.toString();
			//System.out.println(requestBody);
			Request request = new Request.Builder()
					.url("http://api-unionid.meituan.com/unionid/android/register")
					.post(RequestBody.create(MediaType.parse("application/json;charset=UTF-8"), requestBody))
					.build();
			
			Response resp = OkHttpUtils.postSync(request);
			JsonObject json = (JsonObject) new JsonParser().parse(resp.body().string());
			return json.get("data").getAsJsonObject().get("unionId").getAsString();
		}catch(Exception e) {
			return "";
		}
		
	}
	
	public static String dpmtpushRegister(RegisterParams params){
		try {
			JsonObject  obj = new JsonObject();
			obj.addProperty("os", params.os);
			obj.addProperty("model",params.model);
			obj.addProperty("random", params.random);
			obj.addProperty("brand", params.brand);
			obj.addProperty("mac",   params.mac);
			obj.addProperty("signature", params.signature);
			obj.addProperty("network", params.network);
			obj.addProperty("mode", params.mode);
			obj.addProperty("deviceid", params.deviceid);
			
			String requestBody = obj.toString();
			System.out.println(requestBody);
			Request request = new Request.Builder()
					.url("http://dpmtpush.dianping.com/sdkapi/newreg")
					.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
					.header("PushToken", "")
					.header("SdkVersion", "200")
			        .header("AppName", "com.sankuai.meituan.takeoutnew")
			        .header("PhoneType", "1")
					.build();
			
			Response resp = OkHttpUtils.postSync(request);
			String responsebody = resp.body().string();
			JsonObject json = (JsonObject) new JsonParser().parse(responsebody);
			System.out.println(responsebody);
			return json.get("pushtoken").getAsString();
		}catch(Exception e) {
			return "";
		}

	}

}
