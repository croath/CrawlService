package com.module.meituan;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.module.meituan.Params.PoiChannelParam;
import com.utils.CommUtil;
import com.utils.KeyValue;
import com.utils.OkHttpUtils;
import com.utils.RequestBean;
import okhttp3.Response;

public class PoiChannel {
	
	/** 
	* @Title: ${mt_test_channel} 
	* @Description: ${todo}(测试 接口getPoiChanelRequest是否有效) 
	* @param ${void}
	* @return ${void}    
	* @throws 
	*/
	public static void mt_test_channel() {
		PoiChannelParam channel = new PoiChannelParam();
		channel.uuid = "B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F";
		channel.union_id = "ca9b0fef7a45482fbe54ff0eb9b1d567a155068350691537514";
		channel.userid = "1823170407";
		channel.session_id = "5fffdc0a-5fa1-4ada-8eba-994e63a8edd41552374578942550";
		channel.wm_logintoken = "";
		channel.wm_mac =  "f8%3Aa9%3Ad0%3A1e%3A17%3A06";
		channel.wm_uuid = "B6DD058043FB5D5246C212E4E994BA4410FFA6CED02EDB22A9FFF61B4C0B6E0F";
		channel.push_token = "dpsh5b8829a7cf44e2072c5e76783a40306datpu";
		channel.wm_did = "353490066863560";
		channel.request_id = "8A5A2081-10F0-4F74-987D-6A2A5002F40F";
		channel.wm_visitid = "95af1ad9-239f-43f4-b6ed-067beedba1ea";
		
		channel.latitude = "22540331";
		channel.longitude = "113940064";
		channel.page_index = "0";
		channel.page_size = "20";//modifiy
		channel.sort_type = "5";
		channel.category_type = "910";
		channel.filter_type = "0";
		channel.second_category_type = "0";
		channel.navigate_type = "910";
		channel.activity_filter_codes = "";
		channel.slider_select_data = "";
		channel.load_type = "1";
		channel.preload = "0";
		channel.trace_tag = "";
		channel.rank_trace_id = "";
		channel.app = "4";
		channel.platform = "4";
		channel.wm_latitude = "22540331";
		channel.version = "6.6.7";
		channel.wm_actual_longitude = "113940064";
		channel.wm_dtype = "AOSP%20on%20HammerHead";
		channel.wm_actual_latitude = "22540331";
		channel.wm_ctype = "android";
		channel.seq_id = "140";
		channel.partner = "4";
		channel.wm_appversion = "6.6.7";
		channel.wm_dversion = "19_4.4.4";
		channel.wm_longitude = "113940064";
		channel.wm_channel = "1040";
		channel.wm_seq = "66";
		
		channel.ci = "30";
		channel.utm_content = "353490066863560";
		channel.utm_medium = "android";
		channel.utm_term = "60607";
		channel.utm_campaign = "AwaimaiBwaimaiGhomepage";
		channel.utm_source = "1040";
		channel.region_id = "1000440300";
		
		
		RequestBean poiRequest = getPoiChanelRequest(channel);
		
		try {
			Response response = OkHttpUtils.postSync(poiRequest);
			System.out.println(response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/** 
	* @Title: ${getPoiChannepageRequest} 
	* @Description: ${todo}(根据channelpage参数设置, 生成一个合法的channel方法请求) 
	* @param ${tags}     
	* @return ${return_type}    返回类型 
	* @throws 
	*/
	public static RequestBean getPoiChanelRequest(PoiChannelParam params) {
		String url = "http://wmapi.meituan.com/api/v7/poi/channelpage";
		List<KeyValue> query = new ArrayList<KeyValue>();
		List<KeyValue> body = new ArrayList<KeyValue>();

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
		
		query.add(new KeyValue("ci", params.ci));
		query.add(new KeyValue("utm_content", params.utm_content));
		query.add(new KeyValue("utm_medium", params.utm_medium));
		query.add(new KeyValue("uuid", params.uuid));
		query.add(new KeyValue("utm_term", params.utm_term));
		query.add(new KeyValue("utm_campaign", params.utm_campaign));
		query.add(new KeyValue("utm_source", params.utm_source));
		query.add(new KeyValue("region_id",  params.region_id));
		query.add(new KeyValue("region_version",  ""+System.currentTimeMillis()));
		
		query.add(new KeyValue("__skck", "6a375bce8c66a0dc293860dfa83833ef"));
		query.add(new KeyValue("__skts","" + System.currentTimeMillis() ));
		query.add(new KeyValue("__skua", "d41d8cd98f00b204e9800998ecf8427e"));
		query.add(new KeyValue("__skno",UUID.randomUUID().toString()));
		
		String __skcy = MeituanModule.calc_skcy(url, query, body);
		query.add(new KeyValue("__skcy", URLEncoder.encode(__skcy)));
		
		RequestBean poiRequest = new RequestBean();
		
		poiRequest.requestUrl = url + "?" + CommUtil.list2String(query);
		poiRequest.requestBody = CommUtil.list2String(body);
		return poiRequest;
	}
}

