package com.module.taobao;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.util.HashMap;

import org.bouncycastle.util.encoders.Base64;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class PyMain {
	public static void main(String args[]) throws Exception {
		//tb_getdetail();
		//tb_homepage_recommend();
		tb_live();
	}
	
	private static void tb_live() throws Exception{
		//		request:Request{ url=
		//?data=	//method=GET, 
		//appKey=21646297, 
		//authCode=null, 
		
		//headers:{data={"PARCELABLE_WRITE_RETURN_VALUE":"1","s":"20","channelId":"0","CONTENTS_FILE_DESCRIPTOR":"1","n":"10","CREATOR":"{}","queryAd":"1","moduleIndex":"12","haveOnlook":"false","version":"10"}}
		//			nBacktrace:njava.lang.Exception
		
		
		
		
		
		String data= "%7B%22PARCELABLE_WRITE_RETURN_VALUE%22%3A%221%22%2C%22s%22%3A%2220%22%2C%22channelId%22%3A%220%22%2C%22CONTENTS_FILE_DESCRIPTOR%22%3A%221%22%2C%22n%22%3A%2210%22%2C%22CREATOR%22%3A%22%7B%7D%22%2C%22queryAd%22%3A%221%22%2C%22moduleIndex%22%3A%2212%22%2C%22haveOnlook%22%3A%22false%22%2C%22version%22%3A%2210%22%7D";		
		String strData = new String(URLDecoder.decode(data));
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("content-type","application/x-www-form-urlencoded");
		headers.put("charset", "UTF-8");
		headers.put("x-umt", "TctLrt5LOv477jVr1Lfpe1SkhcRTb4TU");
		headers.put("x-region-channel","CN");
		headers.put("x-app-conf-v", "19");
		headers.put("x-features","27"); 
		headers.put("x-nettype","WIFI"); 
		headers.put("x-utdid","ADqYe0dIN3UDAOMIFobd3OTJ"); 
		headers.put("user-agent","MTOPSDK%2F3.1.1.7+%28Android%3B4.4.4%3BLGE%3BAOSP+on+HammerHead%29");
		headers.put("x-nq", "WIFI");
		headers.put("x-pv", "6.1");
		headers.put("x-mini-wua","HHnB_Mq8mo9OW9cLG7UQ7MwO6UkcM3Ke9zpVnTn8ovWVW0CwaDO2GkQkk5rDi2RsyxRbEo1QfVnb0UcJ0WGyerboH%2Fz7Vf5tuuWixYCW9Cx9lL5b8FwmPrtilyha3LFuAToxr"); 
		headers.put("x-location", "114.418888%2C30.466112");
		headers.put("x-devid","AiKqef86Ry_ZEna6MEEvoW2BU6NZnN83riONd8NKdV6d"); 
		headers.put("x-c-traceid","ADqYe0dIN3UDAOMIFobd3OTJ15630875178200034110836"); 
		headers.put("x-appkey","21646297"); 
		headers.put("x-m-biz-live-bizcode","TAOBAO"); 
		headers.put("x-app-ver","8.6.10"); 
		headers.put("x-ttid", "1551686692688%40taobao_android_8.6.10");
		headers.put("x-page-url","http%3A%2F%2Fh5.m.taobao.com%2Ftaolive%2Fmain.html"); 
		headers.put("x-page-name","com.taobao.taolivehome.TaoLiveHomepageActivity"); 
		headers.put("f-refer","mtop"); 
		headers.put("c-launch-info","0,0,1563087517814,1563083666000"); 
		headers.put("body","null"); 
		headers.put("seqNo","MTOP34"); 
		headers.put("connectTimeoutMills","10000"); 
		headers.put("readTimeoutMills","15000"); 
		headers.put("retryTimes", "1"); 
		headers.put("env","0"); 
		headers.put("reqContext","null"); 
		headers.put("api","mtop.mediaplatform.live.videolist");
		headers.put("x-t", ""+System.currentTimeMillis()/1000);
		String sign = calSign("mtop.mediaplatform.live.videolist",strData, headers);
		headers.put("x-sign", sign);

		//headers.put("x-sign", "ab20380090ce827cfff3459c4f34eb058ff7c697224c262120");
		
		
		
//		headers.put("x-appkey", "21646297");
//		headers.put("x-region-channel", "CN");
//		headers.put("x-mini-wua",
//				"HHnB_k3SbtdVkHZF91m6SMVlApefpZBJxEl7APRZMFLJZl3nf4n15t7VYK8Du9eMK2Enbotc6CAcVmEZE7RHUn52S0DPHY%2BZzDIrr9kz51%2BU89EE3JywgAUIy7gZ6ewzKlWN7");
//		headers.put("x-nq", "WIFI");
//		headers.put("x-c-traceid", "XLNRKmSjZQ0DAKPRVDYM%2FTUU1556533396546014514671");
//		headers.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
//		headers.put("x-app-conf-v", "19");
//		headers.put("x-features", "27");
//		headers.put("c-launch-info", "3,0,1556533396545,1556530520000");
//		headers.put("x-page-name", "com.taobao.android.detail.wrapper.activity.DetailActivity");
//		headers.put("x-app-ver", "8.6.10");
//		headers.put("x-t", "1556533396");
//		headers.put("x-pv", "6.1");
//		headers.put("x-location", "113.939778%2C22.540102");
//		headers.put("user-agent", "MTOPSDK%2F3.1.1.7+%28Android%3B6.0%3BHuawei%3BNexus+6P%29");
//		headers.put("f-refer", "mtop");
//		headers.put("x-ttid", "1551686692688%40taobao_android_8.6.10");
//		headers.put("x-nettype", "WIFI");
//		headers.put("cache-control", "no-cache");
//		headers.put("x-utdid", "XLNRKmSjZQ0DAKPRVDYM%2FTUU");
//		headers.put("x-umt", "qCtLWLxLOt%2Bh5TVqZ9rCsntxLqmXyLwx");
//		headers.put("x-devid", "AkL9reMiyzxVGNsaZS4M8b71xjJdIo9FXw31mH2LHtke");
//		headers.put("x-page-url", "http%3A%2F%2Fitem.taobao.com%2Fitem.htm}");
//		
//		long t= System.currentTimeMillis();
		
		

		String url = "https://guide-acs.m.taobao.com/gw/mtop.mediaplatform.live.videolist/5.0/?data="
			+ strData;
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(url)
				.headers(Headers.of(headers))
				.get().build();
		Call call = okHttpClient.newCall(request);
		Response response = call.execute();
		System.out.println(response.body().string());
		
	}
	
	private static void tb_getdetail() throws IOException {
		String data= "%7B%22detail_v%22%3A%223.3.2%22%2C%22exParams%22%3A%22%7B%5C%22ad_type%5C%22%3A%5C%221.0%5C%22%2C%5C%22appReqFrom%5C%22%3A%5C%22detail%5C%22%2C%5C%22container_type%5C%22%3A%5C%22xdetail%5C%22%2C%5C%22countryCode%5C%22%3A%5C%22CN%5C%22%2C%5C%22device%5C%22%3A%5C%2280%5C%22%2C%5C%22dinamic_v3%5C%22%3A%5C%22true%5C%22%2C%5C%22id%5C%22%3A%5C%224569030103%5C%22%2C%5C%22latitude%5C%22%3A%5C%2222.540046%5C%22%2C%5C%22longitude%5C%22%3A%5C%22113.940264%5C%22%2C%5C%22osVersion%5C%22%3A%5C%2223%5C%22%2C%5C%22phoneType%5C%22%3A%5C%22Nexus+6P%5C%22%2C%5C%22pvid%5C%22%3A%5C%22b32d3077-dca2-4b7d-b1ea-1d21a4b1a11b%5C%22%2C%5C%22scm%5C%22%3A%5C%221007.18849.126744.754%5C%22%2C%5C%22soVersion%5C%22%3A%5C%222.0%5C%22%2C%5C%22spm%5C%22%3A%5C%22a2141.1.guessitemtab_2.9%5C%22%2C%5C%22spm-cnt%5C%22%3A%5C%22a2141.7631564%5C%22%2C%5C%22ultron2%5C%22%3A%5C%22true%5C%22%2C%5C%22utdid%5C%22%3A%5C%22XLNRKmSjZQ0DAKPRVDYM%2FTUU%5C%22%2C%5C%22utparam%5C%22%3A%5C%22%7B%5C%5C%5C%22guessModelVersion%5C%5C%5C%22%3A%5C%5C%5C%22%5C%5C%5C%22%2C%5C%5C%5C%22card_subtype%5C%5C%5C%22%3A%5C%5C%5C%22-%5C%5C%5C%22%2C%5C%5C%5C%22x_object_type%5C%5C%5C%22%3A%5C%5C%5C%22item%5C%5C%5C%22%2C%5C%5C%5C%22matrix_score%5C%5C%5C%22%3A0.0%2C%5C%5C%5C%22miniapp_score%5C%5C%5C%22%3A0.0%2C%5C%5C%5C%22hybrid_score%5C%5C%5C%22%3A0.0%2C%5C%5C%5C%22card_type%5C%5C%5C%22%3A%5C%5C%5C%22-%5C%5C%5C%22%2C%5C%5C%5C%22tpp_buckets%5C%5C%5C%22%3A%5C%5C%5C%228849%230%23126744%238_8849%23191%23754%23394_14189%230%23130950%232_14189%23328%231275%23691%5C%5C%5C%22%2C%5C%5C%5C%22miniapphc_score%5C%5C%5C%22%3A0.0%2C%5C%5C%5C%22pvid%5C%5C%5C%22%3A%5C%5C%5C%22b32d3077-dca2-4b7d-b1ea-1d21a4b1a11b%5C%5C%5C%22%2C%5C%5C%5C%22x_item_ids%5C%5C%5C%22%3A4569030103%2C%5C%5C%5C%22auction_score%5C%5C%5C%22%3A0.0%2C%5C%5C%5C%22x_sytab%5C%5C%5C%22%3A%5C%5C%5C%221002%5C%5C%5C%22%2C%5C%5C%5C%22x_object_id%5C%5C%5C%22%3A4569030103%7D%5C%22%7D%22%2C%22itemNumId%22%3A%224569030103%22%7D";		
		String strData = new String(URLDecoder.decode(data));
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("x-appkey", "21646297");
		headers.put("x-region-channel", "CN");
		headers.put("x-mini-wua",
				"HHnB_k3SbtdVkHZF91m6SMVlApefpZBJxEl7APRZMFLJZl3nf4n15t7VYK8Du9eMK2Enbotc6CAcVmEZE7RHUn52S0DPHY%2BZzDIrr9kz51%2BU89EE3JywgAUIy7gZ6ewzKlWN7");
		headers.put("x-nq", "WIFI");
		headers.put("x-c-traceid", "XLNRKmSjZQ0DAKPRVDYM%2FTUU1556533396546014514671");
		headers.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
		headers.put("x-app-conf-v", "19");
		headers.put("x-features", "27");
		headers.put("c-launch-info", "3,0,1556533396545,1556530520000");
		headers.put("x-page-name", "com.taobao.android.detail.wrapper.activity.DetailActivity");
		headers.put("x-app-ver", "8.6.10");
		headers.put("x-t", "1556533396");
		headers.put("x-pv", "6.1");
		headers.put("x-location", "113.939778%2C22.540102");
		headers.put("user-agent", "MTOPSDK%2F3.1.1.7+%28Android%3B6.0%3BHuawei%3BNexus+6P%29");
		headers.put("f-refer", "mtop");
		headers.put("x-ttid", "1551686692688%40taobao_android_8.6.10");
		headers.put("x-nettype", "WIFI");
		headers.put("cache-control", "no-cache");
		headers.put("x-utdid", "XLNRKmSjZQ0DAKPRVDYM%2FTUU");
		headers.put("x-umt", "qCtLWLxLOt%2Bh5TVqZ9rCsntxLqmXyLwx");
		headers.put("x-devid", "AkL9reMiyzxVGNsaZS4M8b71xjJdIo9FXw31mH2LHtke");
		headers.put("x-page-url", "http%3A%2F%2Fitem.taobao.com%2Fitem.htm}");
		long t= System.currentTimeMillis();
		String sign = calSign("mtop.taobao.detail.getdetail",strData, headers);
		System.out.println("cost:"+ (System.currentTimeMillis() - t));
		headers.put("x-sign", sign);

		String url = "https://trade-acs.m.taobao.com/gw/mtop.taobao.detail.getdetail/6.0/?data="
				+ strData;
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(url)
				.headers(Headers.of(headers))
				.get().build();
		Call call = okHttpClient.newCall(request);
		Response response = call.execute();
		
		System.out.println("" + response.body().string());
		
	}
	private static void tb_homepage_recommend() throws IOException {
		
		//String data = "%7B%22address%22%3A%22%E5%B9%BF%E4%B8%9C%E7%9C%81+%E6%B7%B1%E5%9C%B3%E5%B8%82+%E5%8D%97%E5%B1%B1%E5%8C%BA+%E5%85%B4%E6%B5%B7%E5%A4%A7%E9%81%93+3%E6%A0%8B+%E9%9D%A0%E8%BF%91%E6%B7%B1%E5%9C%B3%E5%B8%82%E4%BA%91%E5%87%A4%E6%80%9D%E5%84%92%E6%9C%8D%E9%A5%B0%E6%9C%89%E9%99%90%E5%85%AC%E5%8F%B8+%22%2C%22countryName%22%3A%22%E4%B8%AD%E5%9B%BD%22%2C%22gatewayVersion%22%3A%221.0%22%2C%22encryptUserId%22%3A%22%22%2C%22longitude%22%3A%22113.894726%22%2C%22userId%22%3A%22%22%2C%22utdid%22%3A%22XLNRKmSjZQ0DAKPRVDYM%2FTUU%22%2C%22cityName%22%3A%22%E6%B7%B1%E5%9C%B3%22%2C%22cityCode%22%3A%22440300%22%2C%22edition%22%3A%22%7B%5C%22actualLanguageCode%5C%22%3A%5C%22zh-CN%5C%22%2C%5C%22countryId%5C%22%3A%5C%22CN%5C%22%2C%5C%22countryNumCode%5C%22%3A%5C%22156%5C%22%2C%5C%22currencyCode%5C%22%3A%5C%22CNY%5C%22%7D%22%2C%22nick%22%3A%22%E5%A4%9A%E5%A4%9A%E7%9A%84%E9%9B%A8%E5%A4%A9%22%2C%22areaCode%22%3A%22440305%22%2C%22countryCode%22%3A%22CN%22%2C%22areaName%22%3A%22%E5%8D%97%E5%B1%B1%E5%8C%BA%22%2C%22provinceCode%22%3A%22440000%22%2C%22latitude%22%3A%2222.487632%22%2C%22containerParams%22%3A%22%7B%5C%22recommend_home_main_1002%5C%22%3A%7B%5C%22baseCacheTime%5C%22%3A0%2C%5C%22bizParams%5C%22%3A%7B%5C%22appId%5C%22%3A%5C%228849%5C%22%2C%5C%22expireAction%5C%22%3A%5C%22%5C%22%2C%5C%22tabIndex%5C%22%3A2%7D%2C%5C%22clientReqOffsetTime%5C%22%3A0%2C%5C%22clientReqTime%5C%22%3A0%2C%5C%22deltaCacheTime%5C%22%3A0%2C%5C%22pageParams%5C%22%3A%7B%5C%22isLastPage%5C%22%3A%5C%22n%5C%22%2C%5C%22itemLastCount%5C%22%3A%5C%2250%5C%22%2C%5C%22pageNum%5C%22%3A1%7D%2C%5C%22passParams%5C%22%3A%7B%5C%22contentIds%5C%22%3A%5C%227606785352%2C5604886079%2C6232344687%2C7318875665%2C7472178474%2C7615606015%2C5877314569%2C5876958060%2C5606480976%2C5879051660%2C6293073865%2C6262956739%5C%22%2C%5C%22lastVersion%5C%22%3A%5C%22v5%5C%22%7D%2C%5C%22realBaseCacheTime%5C%22%3A0%2C%5C%22requestType%5C%22%3A%5C%22scrollNextPage%5C%22%7D%7D%22%2C%22provinceName%22%3A%22%E5%B9%BF%E4%B8%9C%E7%9C%81%22%7D";
		//String data ="%7B%22address%22%3A%22%E5%B9%BF%E4%B8%9C%E7%9C%81%20%E6%B7%B1%E5%9C%B3%E5%B8%82%20%E5%8D%97%E5%B1%B1%E5%8C%BA%20%E7%A7%91%E8%89%BA%E8%B7%AF%209968%E5%8F%B7%20%E9%9D%A0%E8%BF%91%E6%8B%9B%E5%95%86%E9%93%B6%E8%A1%8C%28%E6%B7%B1%E5%9C%B3%E5%A8%81%E7%9B%9B%E5%A4%A7%E5%8E%A6%E6%94%AF%E8%A1%8C%29%20%22,%22countryName%22%3A%22%E4%B8%AD%E5%9B%BD%22,%22gatewayVersion%22%3A%221.0%22,%22encryptUserId%22%3A%22null%22,%22longitude%22%3A%22113.940021%22,%22userId%22%3A%221798208675%22,%22utdid%22%3A%22XLNRKmSjZQ0DAKPRVDYM%2FTUU%22,%22cityName%22%3A%22%E6%B7%B1%E5%9C%B3%22,%22cityCode%22%3A%22440300%22,%22edition%22%3A%22%7B%5C%22actualLanguageCode%5C%22%3A%5C%22zh-CN%5C%22,%5C%22countryId%5C%22%3A%5C%22CN%5C%22,%5C%22countryNumCode%5C%22%3A%5C%22156%5C%22,%5C%22currencyCode%5C%22%3A%5C%22CNY%5C%22%7D%22,%22nick%22%3A%22%E5%A4%9A%E5%A4%9A%E7%9A%84%E9%9B%A8%E5%A4%A9%22,%22areaCode%22%3A%22440305%22,%22countryCode%22%3A%22CN%22,%22areaName%22%3A%22%E5%8D%97%E5%B1%B1%E5%8C%BA%22,%22provinceCode%22%3A%22440000%22,%22latitude%22%3A%2222.540468%22,%22containerParams%22%3A%22%7B%5C%22recommend_home_main_1002%5C%22%3A%7B%5C%22baseCacheTime%5C%22%3A1555257076556,%5C%22bizParams%5C%22%3A%7B%5C%22appId%5C%22%3A%5C%228849%5C%22,%5C%22clickId%5C%22%3A%5C%22578275939923%5C%22,%5C%22expireAction%5C%22%3A%5C%22%5C%22,%5C%22tabIndex%5C%22%3A3%7D,%5C%22clientReqOffsetTime%5C%22%3A0,%5C%22clientReqTime%5C%22%3A1555294595801,%5C%22deltaCacheTime%5C%22%3A0,%5C%22pageParams%5C%22%3A%7B%5C%22pageNum%5C%22%3A1%7D,%5C%22passParams%5C%22%3A%7B%5C%22contentIds%5C%22%3A%5C%227603154442,7603156351,5628362306,5858311627,7604690863,7472178474,7144912331,5877211317,7399673710,5880328852,6262721532,7567957057%5C%22,%5C%22isTenIconWithMiniApp%5C%22%3A%5C%222%5C%22,%5C%22lastVersion%5C%22%3A%5C%22v5%5C%22%7D,%5C%22realBaseCacheTime%5C%22%3A0,%5C%22requestType%5C%22%3A%5C%22pageEnter%5C%22%7D%7D%22,%22provinceName%22%3A%22%E5%B9%BF%E4%B8%9C%E7%9C%81%22%7D";
		String data= "%7B%22address%22%3A%22%E5%B9%BF%E4%B8%9C%E7%9C%81%20%E6%B7%B1%E5%9C%B3%E5%B8%82%20%E5%8D%97%E5%B1%B1%E5%8C%BA%20%E7%A7%91%E8%89%BA%E8%B7%AF%209968%E5%8F%B7%20%E9%9D%A0%E8%BF%91%E6%8B%9B%E5%95%86%E9%93%B6%E8%A1%8C%28%E6%B7%B1%E5%9C%B3%E5%A8%81%E7%9B%9B%E5%A4%A7%E5%8E%A6%E6%94%AF%E8%A1%8C%29%20%22,%22countryName%22%3A%22%E4%B8%AD%E5%9B%BD%22,%22gatewayVersion%22%3A%221.0%22,%22encryptUserId%22%3A%22null%22,%22longitude%22%3A%22113.940021%22,%22userId%22%3A%221798208675%22,%22utdid%22%3A%22XLNRKmSjZQ0DAKPRVDYM%2FTUU%22,%22cityName%22%3A%22%E6%B7%B1%E5%9C%B3%22,%22cityCode%22%3A%22440300%22,%22edition%22%3A%22%7B%5C%22actualLanguageCode%5C%22%3A%5C%22zh-CN%5C%22,%5C%22countryId%5C%22%3A%5C%22CN%5C%22,%5C%22countryNumCode%5C%22%3A%5C%22156%5C%22,%5C%22currencyCode%5C%22%3A%5C%22CNY%5C%22%7D%22,%22nick%22%3A%22%E5%A4%9A%E5%A4%9A%E7%9A%84%E9%9B%A8%E5%A4%A9%22,%22areaCode%22%3A%22440305%22,%22countryCode%22%3A%22CN%22,%22areaName%22%3A%22%E5%8D%97%E5%B1%B1%E5%8C%BA%22,%22provinceCode%22%3A%22440000%22,%22latitude%22%3A%2222.540468%22,%22containerParams%22%3A%22%7B%5C%22recommend_home_main_1002%5C%22%3A%7B%5C%22baseCacheTime%5C%22%3A1555257076556,%5C%22bizParams%5C%22%3A%7B%5C%22appId%5C%22%3A%5C%228849%5C%22,%5C%22clickId%5C%22%3A%5C%22578275939923%5C%22,%5C%22expireAction%5C%22%3A%5C%22%5C%22,%5C%22tabIndex%5C%22%3A3%7D,%5C%22clientReqOffsetTime%5C%22%3A0,%5C%22clientReqTime%5C%22%3A1555294595801,%5C%22deltaCacheTime%5C%22%3A0,%5C%22pageParams%5C%22%3A%7B%5C%22pageNum%5C%22%3A11%7D,%5C%22passParams%5C%22%3A%7B%5C%22contentIds%5C%22%3A%5C%227603154442,7603156351,5628362306,5858311627,7604690863,7472178474,7144912331,5877211317,7399673710,5880328852,6262721532,7567957057%5C%22,%5C%22isTenIconWithMiniApp%5C%22%3A%5C%222%5C%22,%5C%22lastVersion%5C%22%3A%5C%22v5%5C%22%7D,%5C%22realBaseCacheTime%5C%22%3A0,%5C%22requestType%5C%22%3A%5C%22pageEnter%5C%22%7D%7D%22,%22provinceName%22%3A%22%E5%B9%BF%E4%B8%9C%E7%9C%81%22%7D";
		String strData = new String(URLDecoder.decode(data));
		HashMap<String, String> headers = new HashMap<String, String>();
		headers.put("x-appkey", "21646297");
		headers.put("x-region-channel", "CN");
		headers.put("x-mini-wua",
				"HHnB_jeIFxXGRze97tSqtbObrIy9K3uKzXLIELrwTQQL91gm%2FmDAUh%2B%2B1CCCQ%2BAYP51sMYGrg2MkVmDQj0nSZDCtSz%2FKrgmT7HInKPiE%2BUcVmtDNqvd%2B%2B1XXmoaMXVQmfwE0u");
		headers.put("x-nq", "WIFI");
		headers.put("x-c-traceid", "XLNRKmSjZQ0DAKPRVDYM%2FTUU1555836941887006514925");
		headers.put("content-type", "application/x-www-form-urlencoded;charset=UTF-8");
		headers.put("x-app-conf-v", "19");
		headers.put("x-features", "27");
		headers.put("c-launch-info", "0,0,1555836941887,1555836723000,");
		headers.put("x-page-name", "com.taobao.tao.TBMainActivity");
		headers.put("x-app-ver", "8.6.10");
		headers.put("x-t", ""+System.currentTimeMillis()/1000);
		headers.put("x-pv", "6.1");
		headers.put("x-location", "113.894726%2C22.487632");
		headers.put("user-agent", "MTOPSDK%2F3.1.1.7+%28Android%3B6.0%3BHuawei%3BNexus+6P%29");
		headers.put("f-refer", "mtop");
		headers.put("x-ttid", "1551686692688%40taobao_android_8.6.10");
		headers.put("x-nettype", "WIFI");
		headers.put("cache-control", "no-cache");
		headers.put("x-utdid", "XLNRKmSjZQ0DAKPRVDYM%2FTUU");
		headers.put("x-umt", "TqNL1YFLOogaUjVqPrwoSQ9zN4X1PYQL");
		headers.put("x-devid", "AkL9reMiyzxVGNsaZS4M8b71xjJdIo9FXw31mH2LHtke");
		headers.put("x-page-url", "http%3A%2F%2Fm.taobao.com%2Findex.htm");
		long t= System.currentTimeMillis();
		String sign = calSign("mtop.taobao.wireless.home.awesome.homepage.recommend", strData, headers);
		System.out.println("cost:"+ (System.currentTimeMillis() - t));
		headers.put("x-sign", sign);

		String url = "http://guide-acs.m.taobao.com/gw/mtop.taobao.wireless.home.awesome.homepage.recommend/1.0/?data="
				+ strData;
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(url)
				.headers(Headers.of(headers))
				.get().build();
		Call call = okHttpClient.newCall(request);
		Response response = call.execute();
		System.out.println("" + response.body().string());
	}

	
	private static String calSign(String api, String strData, HashMap<String, String> headers) {
		HashMap<String, String> haspMap = new HashMap<String, String>();
		String[] locations = URLDecoder.decode(headers.get("x-location")).split(",");
		String lng = locations[0];
		String lat = locations[1];
		haspMap.put("deviceId", headers.get("x-devid"));
		haspMap.put("appKey", headers.get("x-appkey"));
		haspMap.put("api", api);
		haspMap.put("utdid", URLDecoder.decode(headers.get("x-utdid")));
		haspMap.put("x-features", headers.get("x-features"));
		haspMap.put("ttid", URLDecoder.decode(headers.get("x-ttid")));
		haspMap.put("lng", lng);
		haspMap.put("lat", lat);
		haspMap.put("v", "1.0");
		//haspMap.put("sid", headers.get("x-sid"));
		haspMap.put("t", headers.get("x-t"));
		//haspMap.put("uid", headers.get("x-uid"));
		haspMap.put("data", strData);
		
		try {
			Socket socket = new Socket("172.20.10.3", 2153);
			JsonObject calSignTask = new JsonObject();
			calSignTask.addProperty("id", 1000);
			calSignTask.addProperty("action", "CalsignAction");
			calSignTask.addProperty("args", new Gson().toJson(haspMap));
			System.out.println("task:" + calSignTask.toString());
			socket.getOutputStream().write(calSignTask.toString().getBytes());
			InputStream is = socket.getInputStream();
			byte[] buffer = new byte[1024];
			int n = is.read(buffer);
			String str = new String(buffer, 0, n);
			return new JsonParser().parse(str).getAsJsonObject().get("ret_msg").getAsString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
