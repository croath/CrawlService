package com.module.test;

import java.io.UnsupportedEncodingException;

import com.utils.CommUtil;

public class RegisterParams {
	String devid;
	String deviceid;
	String simulateId;
	String imei2;
	String meid;
	String imei1;
	String android_id;
	String androidId;
	String mac; 
	String wifiMac;
	String bluetoothMac;
	String serial_number;
	String serialNumber;
	String localId;
	String random;
	String model;
	String signature;
	String osName;
	String brand;
	String platform;
	String ctype;
	String clientType;
	String osVersion;
	String os;
	int    network;
	int    mode;
	String jddje;
	String nop;
	String jntj;
	String requiredId;
	String unionId;
	String dpid;
	String localUuid;
	String deviceModel;
	String appName;
	String app;
	String userId;
	String sdkVersion;
	String version;
	
	
	public static RegisterParams generateParam() {
		RegisterParams rp = new RegisterParams();
		
		rp.devid      = "306065104722640"; 
		rp.deviceid   = rp.devid;
		rp.simulateId = rp.devid;;
		rp.imei2      = rp.devid;;
		rp.meid       = rp.devid;;
		rp.imei1      = rp.devid;;
		rp.android_id = "8773bd8659edfd52";
		rp.androidId =  rp.android_id;
		rp.mac    = CommUtil.urlEncode("f8:a4:c1:1c:bd:86"); 
		rp.wifiMac = rp.mac;
		rp.bluetoothMac = "F8:A9:D0:AE:85:FE";
		rp.serial_number="067b8c75439cd0f9";
		rp.serialNumber = rp.serial_number;
		rp.localId = "00be9941db4823e2f67aca96560557ee2d1767d1f609d5f2ee";
		

		rp.random = "4071943067";//""+System.currentTimeMillis();
		rp.model  = "ssss";
		rp.deviceModel = rp.model;
		
		rp.signature =  rp.calcSignature(); 
		rp.osName =  "Xiaomi2";
		
		rp.brand    = "Android";
		rp.platform = "android";
		rp.ctype    = "android";
		
		rp.version = "6.6.7";
		
		rp.clientType =  "4";
		rp.osVersion = "4.4.4";
		rp.os     = rp.osVersion;
		rp.network = 1;
		rp.mode = 1;
		rp.jddje = "";
		rp.nop =  "unknown";
		rp.jntj  = "";
		rp.requiredId =  "1";
		rp.unionId=  "";
		rp.dpid =  "";
		rp.localUuid="";
		rp.appName =  "waimai";
		rp.app =  "com.sankuai.meituan.takeoutnew";
		rp.userId= "";
		rp.sdkVersion = "1.6.3";
		return rp;
	}


	private String calcSignature() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.random).append("-com.sankuai.meituan.takeoutnew-takeoutnew");
		String p =sb.toString();
		try {
			byte[] data = p.getBytes("UTF-8");
			return CommUtil.byte2Hexstr(CommUtil.sha1(data));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			return "";
		}
		
	}
}
