package com.module.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.module.meituan.MeituanModule;
import com.utils.KeyValue;
import com.utils.RequestBean;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class HomepageModel {

	public static void main(String args[]) {
		try {
			//test1();	
			//testPostChannel();
			testPoiHomepage();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void test1() {
		String str = "latitude=22540332&longitude=113940064&page_index=0&page_size=20&sort_type=0&category_type=910&filter_type=0&second_category_type=0&navigate_type=910&activity_filter_codes=&slider_select_data=&load_type=1&preload=0&trace_tag=&rank_trace_id=&session_id=9834a16d-8f61-48d3-ac3b-d930a21ce8331552024700103904&union_id=36754aa8a05042599b9e9f5b90d84a0ea154707980884615831&app=4&platform=4&push_token=dpsh487b82577f6069f66e31a3fb84b65b3fatpu&wm_latitude=22540332&userid=0&wm_logintoken=&wm_mac=f8%3Aa9%3Ad0%3A1c%3Abd%3A87&wm_uuid=321F9A1AE676D5794BB5D70326F4E3258E32DCCA32D9ED3F72E62CF98DE98041&version=6.6.7&wm_actual_longitude=113940064&wm_dtype=AOSP+on+HammerHead&request_id=1E4B042B-A444-4584-99C0-A41CBD79D005&wm_actual_latitude=22540332&wm_did=359125052338383&wm_ctype=android&wm_visitid=a3e435a6-2d93-49e9-85e5-8da0af75b027&seq_id=33&partner=4&uuid=321F9A1AE676D5794BB5D70326F4E3258E32DCCA32D9ED3F72E62CF98DE98041&wm_appversion=6.6.7&wm_dversion=19_4.4.4&wm_longitude=113940064&wm_channel=1040&wm_seq=27&req_time=1552024767387&waimai_sign=RJ%2B2A%2BMh5wDxnFY7VwPIvsko3w7WDizeFTSvro0d0fWtnlu1g9bUjn2OZ7DKAZB3W3F%2FbxgFFhSzuHJdsP0ta8mjerMsFB9zJa%2BMwGpF097YEnOsUnoFxmPeIM9n2sZOLKZTxV%2FQjsjrs12G62mraOvL94J9l02AbWpVuI7i5Kg%3D";
		String[] strarray=str.split("=|&"); 
	
		for (int i = 0; i < strarray.length; i+=2) 
			System.out.println(strarray[i]+":" + strarray[i+1]);
	}

	private static void testPostChannel() throws Exception {
		// TODO Auto-generated method stub
	    ChannelParam params = new ChannelParam();
		params.ci = "30";
		params.utm_content = "353490066863560";
		params.utm_medium = "android";
		params.uuid = "B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F";
		params.utm_term = "60607";
		params.utm_campaign = "AwaimaiBwaimaiGhomepage";
		params.utm_source = "1040";
		
		String requestUrl  = "http://wmapi.meituan.com/api/v7/poi/channelpage?"
				+ "ci=30&"
				+ "utm_content=353490066863560&"
				+ "utm_medium=android&"
				+ "uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&"
				+ "utm_term=60607&"
				+ "utm_campaign=AwaimaiBwaimaiGhomepage&"
				+ "utm_source=1040&"
				
				+ "__skck=6a375bce8c66a0dc293860dfa83833ef&"
				+ "__skts=1550649738012&"
				+ "__skua=d41d8cd98f00b204e9800998ecf8427e&"
				+ "__skno=c5860ed2-ac78-4443-ac37-804cf71e0e8e&"
				+ "__skcy=iK0mA0Xs3BoH7M0jv1yVkzcJqWA%3D";
		

		params.latitude="22540331";
		params.longitude="113940064";
		params.page_index="0";
		params.page_size="0";
		params.sort_type="5";
		params.category_type="910";
		params.filter_type="0";
		params.second_category_type="0";
		params.navigate_type="910";
		params.activity_filter_codes="";
		params.slider_select_data="";
		params.load_type="2";
		params.preload="0";
		params.trace_tag="";
		params.rank_trace_id="";
		params.session_id="aa01701e-182a-498c-a7ee-bd8b284d6a9c1550729057949338";
		params.union_id="36754aa8a05042599b9e9f5b90d84a0ea154707980884615831";
		params.app="4";
		params.platform="4";
		params.push_token="dpsh5b8829a7cf44e2072c5e76783a40306datpu";
		params.wm_latitude="22540331";
		params.userid="0";
		params.wm_logintoken="";
		params.wm_mac=//"f8%3Aa9%3Ad0%3A1e%3A17%3A06";
		              "f8%3Aa9%3Ad0%3A1c%3Abd%3A87";
		params.wm_uuid="B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F";
		params.version="6.6.7";
		params.wm_actual_longitude="113940064";
		params.wm_dtype="AOSP+on+HammerHead";
		params.request_id="6EFBCE65-E9EF-4A59-90ED-2F7A53FCB0E9";
		params.wm_actual_latitude="22540331";
		params.wm_did="353490066863560";
		params.wm_ctype="android";
		params.wm_visitid="945796e1-aab1-4dc6-ad66-39f0e49786c6";
		params.seq_id="119";
		params.partner="4";
		params.wm_appversion="6.6.7";
		params.wm_dversion="19_4.4.4";
		params.wm_longitude="113940064";
		params.wm_channel="1040";
		params.wm_seq="44";
	 
	
		RequestBean poiRequest = getPoiRequest(params);

		sendRequest(poiRequest);
	}

	private static void testPoiHomepage() throws Exception {
		    PoiHomepageParam poiParam = new PoiHomepageParam();
			poiParam.ci = "30";
			poiParam.utm_content = "866048020492064";
			poiParam.utm_medium = "android";
			poiParam.uuid = "5F50AF704BE305BDC5D3088F0B1AB37AE3676D64E755451F9866ECEB6ACCCC6F";
			poiParam.utm_term = "60607";
			poiParam.utm_campaign = "AwaimaiBwaimaiGhomepage";
			poiParam.utm_source = "1040";
			poiParam.region_id = "1000440300";
			poiParam.region_version = "" + System.currentTimeMillis();
			poiParam.page_index = "0";
			poiParam.page_size = "20";
			poiParam.sort_type = "5";
			poiParam.activity_filter_codes = "";
			poiParam.slider_select_data = "";
			poiParam.load_type = "0";
			poiParam.rank_trace_id = "";
			poiParam.session_id = "f2d1dfb8-8260-4b04-b17c-fb283fd352f91548918424373477";
			poiParam.union_id = "92afb9557d3f403aabe57295e631bfec0000000000001177090";
			poiParam.app = "4";
			poiParam.platform = "4";
			poiParam.push_token = "dpsh348ab71145487a6d43d9a10de5bbc61aatpu";
			poiParam.wm_latitude = "22539979";
			poiParam.userid = "1823170407";
			poiParam.wm_logintoken = "r-fV30YPGgGPU-byefwETm3QsgAAAAAAvgcAAIz7Xe1CXaK379K8pNJSNwarfuqwHM5hlc4DbVA3ZXUpygQZ4H7mkvTHOdHnAlyqGw";
			poiParam.wm_mac = "00%3A0a%3Af5%3A78%3A53%3A8c";
			poiParam.wm_uuid = "5F50AF704BE305BDC5D3088F0B1AB37AE3676D64E755451F9866ECEB6ACCCC6F";
			poiParam.version = "6.6.7";
			poiParam.wm_actual_longitude = "113939777";
			poiParam.wm_dtype = "HM2014811";
			poiParam.request_id = "A9C0ED8E-A4F1-4422-B8A9-A2ACE0013D91";
			poiParam.wm_actual_latitude = "22539979";
			poiParam.wm_did = "866048020492064";
			poiParam.wm_ctype = "android";
			poiParam.wm_visitid = "810adff3-95c1-4964-979c-1a1f76f4e335";
			poiParam.seq_id = "86";
			poiParam.partner = "4";
			poiParam.wm_appversion = "6.6.7";
			poiParam.wm_dversion = "19_4.4.4";
			poiParam.wm_longitude = "113939777";
			poiParam.wm_channel = "1040";
			poiParam.wm_seq = "35";

			RequestBean poiRequest = getPoiHomepageRequest(poiParam);

			sendRequest(poiRequest);
		
	}



	
	
	
	
	
	private static void sendRequest(RequestBean poiRequest) {
		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(poiRequest.requestUrl)
				.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), poiRequest.requestBody))
				.build();
		Call call = okHttpClient.newCall(request);
		call.enqueue(new Callback() {
			@Override
			public void onFailure(Call call, IOException e) {
				System.out.println("onFailure: " + e.getMessage());
			}

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				System.out.println("onResponse: " + response.body().string());
			}
		});

	}

	public static RequestBean getPoiHomepageRequest(PoiHomepageParam params) throws Exception {
		String url = "http://wmapi.meituan.com/api/v7/poi/homepage";
		List<KeyValue> query = new ArrayList<KeyValue>();
		List<KeyValue> body = new ArrayList<KeyValue>();
		query.add(new KeyValue("ci", params.ci));
		query.add(new KeyValue("utm_content", params.utm_content));
		query.add(new KeyValue("utm_medium", params.utm_medium));
		query.add(new KeyValue("uuid", params.uuid));
		query.add(new KeyValue("utm_term", params.utm_term));
		query.add(new KeyValue("utm_campaign", params.utm_campaign));
		query.add(new KeyValue("utm_source", params.utm_source));
		query.add(new KeyValue("region_id", params.region_id));
		query.add(new KeyValue("region_version", "" + System.currentTimeMillis()));

		body.add(new KeyValue("page_index", params.page_index));
		body.add(new KeyValue("page_size", params.page_size));
		body.add(new KeyValue("sort_type", params.sort_type));
		body.add(new KeyValue("activity_filter_codes", params.activity_filter_codes));
		body.add(new KeyValue("slider_select_data", params.slider_select_data));
		body.add(new KeyValue("load_type", params.load_type));
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
		body.add(new KeyValue("req_time", "" + System.currentTimeMillis()));

		String waimai_sign = MeituanModule.calc_sign("wmapi.meituan.com/api/v7/poi/homepage", body);
		body.add(new KeyValue("waimai_sign", waimai_sign));

		query.add(new KeyValue("__skck", "6a375bce8c66a0dc293860dfa83833ef"));
		query.add(new KeyValue("__skts", ""+System.currentTimeMillis()));
		query.add(new KeyValue("__skua", "d41d8cd98f00b204e9800998ecf8427a"));
		query.add(new KeyValue("__skno", UUID.randomUUID().toString()));
		
		String __skcy = MeituanModule.calc_skcy(url, query, body);
		query.add(new KeyValue("__skcy", __skcy));

		RequestBean poiRequest = new RequestBean();
		poiRequest.requestUrl = url + "?" + list2String(query);
		poiRequest.requestBody = list2String(body);
		
		
		return poiRequest;

	}

	public static RequestBean getPoiRequest(ChannelParam params) throws Exception {
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
		body.add(new KeyValue("req_time", "1550649737981" /*+ System.currentTimeMillis()*/));

		String waimai_sign = MeituanModule.calc_sign("wmapi.meituan.com/api/v7/poi/channelpage", body);
		waimai_sign = "WietvGDv7g3hq4pHeQMgMx2NJ2i0vDRoJzP0BpfjJzW%2BJDXyQIONYBvaqLtlwbi1ovX%2BWvmNQOr2MS1SEBZ4%2Bi5aSCL0TohoQvPHnOPRffquFPHuugOUrUU34XMVikqDO6lCx8U%2BTHyh%2BKRHXKAvnHlk9Q8sSMBWSfgK6aaUMq0%3D";
		body.add(new KeyValue("waimai_sign", waimai_sign));

		query.add(new KeyValue("__skck", "6a375bce8c66a0dc293860dfa83833ef"));
		query.add(new KeyValue("__skts", "1550649738012" /*+ System.currentTimeMillis()*/));
		query.add(new KeyValue("__skua", "d41d8cd98f00b204e9800998ecf8427e"));
		query.add(new KeyValue("__skno", "c5860ed2-ac78-4443-ac37-804cf71e0e8e"/*UUID.randomUUID().toString()*/));
		
		String __skcy = MeituanModule.calc_skcy(url, query, body);
		System.out.println(__skcy);
		__skcy = "iK0mA0Xs3BoH7M0jv1yVkzcJqWA%3D";
		query.add(new KeyValue("__skcy", __skcy));
		

		RequestBean poiRequest = new RequestBean();
		poiRequest.requestUrl = url + "?" + list2String(query);
		poiRequest.requestBody = list2String(body);
		
		
		poiRequest.requestUrl  = "http://wmapi.meituan.com/api/v7/poi/channelpage?"
				+ "ci=30&"
				+ "utm_content=353490066863560&"
				+ "utm_medium=android&"
				+ "uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&"
				+ "utm_term=60607&"
				+ "utm_campaign=AwaimaiBwaimaiGhomepage&"
				+ "utm_source=1040&"
				+ "__skck=6a375bce8c66a0dc293860dfa83833ef&"
				+ "__skts=1550649738012&"
				+ "__skua=d41d8cd98f00b204e9800998ecf8427e&"
				+ "__skno=c5860ed2-ac78-4443-ac37-804cf71e0e8e&"
				+ "__skcy=iK0mA0Xs3BoH7M0jv1yVkzcJqWA%3D";
		
		poiRequest.requestBody = "latitude=22540331&"
				+ "longitude=113940064&"
				+ "page_index=0&"
				+ "page_size=0&"
				+ "sort_type=0&"
				+ "category_type=910&"
				+ "filter_type=0&"
				+ "second_category_type=0&"
				+ "navigate_type=910&"
				+ "activity_filter_codes=&"
				+ "slider_select_data=&"
				+ "load_type=2&"
				+ "preload=0&"
				+ "trace_tag=&"
				+ "rank_trace_id=&"
				+ "session_id=aa01701e-182a-498c-a7ee-bd8b284d6a9c1550729057949338&"
				+ "union_id=36754aa8a05042599b9e9f5b90d84a0ea154707980884615831&"
				+ "app=4&"
				+ "platform=4&"
				+ "push_token=dpshafa1e73a2a34f2122e519f31f9e6bf66atpu&"
				+ "wm_latitude=22540331&"
				+ "userid=0&"
				+ "wm_logintoken=&"
				+ "wm_mac=f8%3Aa9%3Ad0%3A1c%3Abd%3A87&"
				+ "wm_uuid=321F9A1AE676D5794BB5D70326F4E325D51996C56BBD0B4124F7865C41882693&"
				+ "version=6.6.7&"
				+ "wm_actual_longitude=113940064&"
				+ "wm_dtype=AOSP+on+HammerHead&"
				+ "request_id=4F913AA1-CC38-4D27-96E2-C707A0C37B80&"
				+ "wm_actual_latitude=22540331&"
				+ "wm_did=359125052338383&"
				+ "wm_ctype="
				+ "android&"
				+ "wm_visitid=2bd2bf31-d578-48da-8aaa-67015b410d61&"
				+ "seq_id=14&"
				+ "partner=4&"
				+ "uuid=321F9A1AE676D5794BB5D70326F4E325D51996C56BBD0B4124F7865C41882693&"
				+ "wm_appversion=6.6.7&"
				+ "wm_dversion=19_4.4.4&"
				+ "wm_longitude=113940064&"
				+ "wm_channel=1040&"
				+ "wm_seq=37&"
				+ "req_time=1550729901975&"
				+ "waimai_sign=C3nbb%2FHEKjNncxiimCQgEnfp59LvoEKvb6VlLMpojdKlL0NmO6HWg%2Bzc0QRqS0DJ9R5utDG6pgh4oVrfmDwDd3%2Ftwe%2Fo123%2FexXO5gv6GsDGqlV0oz9joq4GVwaHQ%2FzHJ3eA70wY3FTMp1xs0GTq6s%2Bw6oXsgiFU13l6EF1urVI%3D";
		
		
		System.out.println(""+poiRequest.requestUrl);
		System.out.println(""+poiRequest.requestBody);
		return poiRequest;

	}
	
	private static String list2String(List<KeyValue> list) {
		StringBuilder sb = new StringBuilder();
		for (KeyValue item : list) {
			sb.append(item.key + "=" + item.value + "&");
		}
		return sb.toString().substring(0, sb.length() - 1);
	}
}

//http://wmapi.meituan.com/api/v7/poi/channelpage?ci=30&utm_content=353490066863560&utm_medium=android&uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&utm_term=60607&utm_campaign=AwaimaiBwaimaiGhomepage&utm_source=1040&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1550649738012&__skua=d41d8cd98f00b204e9800998ecf8427e&__skno=c5860ed2-ac78-4443-ac37-804cf71e0e8e&__skcy=Qf88XRbsmbzV1xjS7xFmzD45jnw=
//http://wmapi.meituan.com/api/v7/poi/channelpage?ci=30&utm_content=353490066863560&utm_medium=android&uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&utm_term=60607&utm_campaign=AwaimaiBwaimaiGhomepage&utm_source=1040&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1550649738012&__skua=d41d8cd98f00b204e9800998ecf8427e&__skno=c5860ed2-ac78-4443-ac37-804cf71e0e8e&__skcy=iK0mA0Xs3BoH7M0jv1yVkzcJqWA%3D")
//http://wmapi.meituan.com/api/v7/poi/channelpage?ci=30&utm_content=353490066863560&utm_medium=android&uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&utm_term=60607&utm_campaign=AwaimaiBwaimaiGhomepage&utm_source=1040&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1550649738012&__skua=d41d8cd98f00b204e9800998ecf8427e&__skno=c5860ed2-ac78-4443-ac37-804cf71e0e8e&__skcy=Qf88XRbsmbzV1xjS7xFmzD45jnw=




//http://wmapi.meituan.com/api/v7/poi/channelpage?ci=30&utm_content=353490066863560&utm_medium=android&uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&utm_term=60607&utm_campaign=AwaimaiBwaimaiGhomepage&utm_source=1040&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1550649738012&__skua=d41d8cd98f00b204e9800998ecf8427e&__skno=c5860ed2-ac78-4443-ac37-804cf71e0e8e&__skcy=iK0mA0Xs3BoH7M0jv1yVkzcJqWA%3D
//latitude=22540331&longitude=113940064&page_index=0&page_size=0&sort_type=5&category_type=910&filter_type=0&second_category_type=0&navigate_type=910&activity_filter_codes=&slider_select_data=&load_type=3&preload=0&trace_tag=&rank_trace_id=&session_id=5fffdc0a-5fa1-4ada-8eba-994e63a8edd41550648671261759&union_id=ca9b0fef7a45482fbe54ff0eb9b1d567a155068350691537514&app=4&platform=4&push_token=dpsh5b8829a7cf44e2072c5e76783a40306datpu&wm_latitude=22540331&userid=0&wm_logintoken=&wm_mac=f8%3Aa9%3Ad0%3A1e%3A17%3A06&wm_uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&version=6.6.7&wm_actual_longitude=113940064&wm_dtype=AOSP+on+HammerHead&request_id=6EFBCE65-E9EF-4A59-90ED-2F7A53FCB0E9&wm_actual_latitude=22540331&wm_did=353490066863560&wm_ctype=android&wm_visitid=945796e1-aab1-4dc6-ad66-39f0e49786c6&seq_id=119&partner=4&uuid=B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F&wm_appversion=6.6.7&wm_dversion=19_4.4.4&wm_longitude=113940064&wm_channel=1040&wm_seq=44&req_time=1550649737981&waimai_sign=WietvGDv7g3hq4pHeQMgMx2NJ2i0vDRoJzP0BpfjJzW%2BJDXyQIONYBvaqLtlwbi1ovX%2BWvmNQOr2MS1SEBZ4%2Bi5aSCL0TohoQvPHnOPRffquFPHuugOUrUU34XMVikqDO6lCx8U%2BTHyh%2BKRHXKAvnHlk9Q8sSMBWSfgK6aaUMq0%3D

