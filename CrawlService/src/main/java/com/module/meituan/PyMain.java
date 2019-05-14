package com.module.meituan;

import java.io.InputStream;
import java.net.Socket;
import java.util.HashMap;
import com.google.gson.Gson;
import com.google.gson.JsonObject;


public class PyMain {
	public static void main(String args[]){
		PoiChannel.mt_test_channel();
		//Poimenu.mt_test_menu();
		//PoiComment.mt_test_comment();
		//PoiDetail.mt_test_detail();
		//fakeDevice();
	}
	
	public static void fakeDevice() {
		try {
			HashMap<String, String> fakeDevice = new HashMap<String, String>();
			Socket socket = new Socket("192.168.1.127", 31218);
			JsonObject calSignTask = new JsonObject();
			calSignTask.addProperty("id", 1000);
			calSignTask.addProperty("type", "3003");
			calSignTask.addProperty("args", new Gson().toJson(fakeDevice));
			
			//new Gson().fromJson((String)args, HashMap.class);
			System.out.println("task:" + calSignTask.toString());
			socket.getOutputStream().write(calSignTask.toString().getBytes());
			InputStream is = socket.getInputStream();
			byte[] buffer = new byte[1024];
			int n = is.read(buffer);
			String str = new String(buffer, 0, n);
			//return new JsonParser().parse(str).getAsJsonObject().get("ret_msg").getAsString();
			//testPostChannel();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}