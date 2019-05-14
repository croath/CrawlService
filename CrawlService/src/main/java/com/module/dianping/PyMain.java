package com.module.dianping;

import java.io.IOException;

import com.utils.FileUtil;
import com.utils.RequestBean;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PyMain {

	public static void main(String args[]){
		
	}
	private static void requestGet() {
		String url = "https://mapi.dianping.com/mapi/guesslike/indexfeeds.bin?"
				+ "latitude=22.54232499940828&longitude=113.93461699999347&"
				+ "haswifi=true&"
				+ "choosecityid=7&"
				+ "wifiinfo=YIMIAN%2Cd0%3A76%3Ae7%3A5d%3Aac%3A9f%2C-25&"
				+ "start=0&"
				+ "sessionid=&"
				+ "cityid=7&"
				+ "filters=&"
				+ "tabid=2&"
				+ "needalltab=false&"
				+ "startuptype=3&"
				+ "feedtype=2&"
				+ "picassogroup=Feed%2FAdvertisement-bundle.js%3A7b7853a3c429efcef8ccf16c03e68a6a%7CFeed%2FCommon-bundle.js%3Ab67991841e3297f11aedb07add4fe110%7CFeed%2FContent-bundle.js%3A314f7bfceb86f431b733b97235e278eb%7CFeed%2FOperation-bundle.js%3Ad4febb118840d17904aea30e18f996de%7CFeed%2FRank-bundle.js%3A9010bf44686995a94e15480f309ea082%7CFeed%2FSpecial-bundle.js%3A1cd23760a743e298fb88699e7fa11263%7CCommon%3Ab67991841e3297f11aedb07add4fe110%7CContent%3Ab770d97e5fd313f202fc5d3ad2fe34c8%3BFeed%2FFeed&"
				+ "nogif=false&"
				+ "__skck=8f5973b085446090f224af74e30e0181&"
				+ "__skts=1550303743&"
				+ "__skua=a0011a68027d94aee333ed4cffc2aad2&"
				+ "__skno=d7d07bc8-4b87-422f-8d87-881a1d519001&__skvs=1.1&"
				+ "__skcy=3Bs9m5y9ndjf4AWCCgVLcXuAyKg%3Dmet";
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder()
		        .url(url)
		        .get()
		        .header("pragma-dpid","92afb9557d3f403aabe57295e631bfec0000000000001177090")
		        .header("User-Agent","MApi 1.3 (com.dianping.v1 10.8.4 om_sd_baidusz HM2014811Android 4.4.4)")
		        .header("pragma-uuid","29d47be9-77d4-4036-93db-bbc0e843c40c")
		        .header("pragma-unionid", "92afb9557d3f403aabe57295e631bfec0000000000001177090")
		        .header("network-type", "wifi")
		        .header("pragma-device", "866048020492064")
		        .header("pragma-os", "MApi 1.3 (com.dianping.v1 10.8.4 om_sd_baidusz HM2014811; Android 4.4.4))")
		        .build();
		Call call = okHttpClient.newCall(request);
		call.enqueue(new Callback() {
		    @Override
		    public void onFailure(Call call, IOException e) {
		    	System.out.println("onFailure: "+ e.getMessage());
		    }
		    
		    @Override
		    public void onResponse(Call call, Response response) throws IOException {
		      
		    	FileUtil.writeFile(response.body().bytes(), "/Users/changle/Desktop/indexfeed.txt", false);
		    }
		});
		
	}
}
