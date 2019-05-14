package com.utils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class OkHttpUtils {
	public static Response  postSync(Request request ){
		OkHttpClient client = new OkHttpClient.Builder().readTimeout(5, TimeUnit.SECONDS).build();
		Call call = client.newCall(request);

		try {
			Response response = call.execute();
			return response;

		} catch (IOException e) {
			return null;
		}
	}
	
	public static Response postSync(RequestBean poiRequest) throws IOException {
		//System.out.println(poiRequest.requestUrl+"\r\n" + (poiRequest.requestBody));
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(poiRequest.requestUrl)
				.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), poiRequest.requestBody))
				.build();
		Call call = okHttpClient.newCall(request);
			return call.execute();
		
		
	}
	
}
