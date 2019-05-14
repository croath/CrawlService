package com.module.meituan;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.module.meituan.Params.PoiCommentParam;
import com.utils.CommUtil;
import com.utils.KeyValue;
import com.utils.OkHttpUtils;
import com.utils.RequestBean;

import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class PoiComment {
	/** 
	* @Title: ${mt_test_channel} 
	* @Description: ${todo}(测试 接口getPoiComment是否有效) 
	* @param ${void}
	* @return ${void}    
	* @throws 
	*/
	public static void mt_test_comment() {
		PoiCommentParam menuParam = new PoiCommentParam();
		menuParam.wmpoiid="2991821";
		menuParam.page_offset="0";
		menuParam.page_size = "20";
		menuParam.comment_score_type =  "0";
		menuParam.label_id =  "0";
		
		menuParam.wm_latitude="22540640";
		menuParam.wm_logintoken="";
		menuParam.wm_mac="02%3A00%3A00%3A00%3A00%3A00";
		menuParam.request_id="0E67D1BB-D82B-4437-9857-EE1723EDB65D";
		menuParam.poilist_mt_cityid="30";
		menuParam.uuid="4A246A75A4E27F91C6F526C90A1691FC5422ED28653C89E2BB69685D9C8663FE";
		menuParam.wm_actual_longitude="113940004";
		menuParam.wm_actual_latitude="22539913";
		menuParam.wm_ctype="android";
		menuParam.app="4";
		menuParam.wm_visitid="10585585-a832-451a-970e-68c7b4d962da";
		menuParam.wm_did="867981023009148";
		menuParam.userid="0";
		menuParam.platform="4";
		menuParam.seq_id="144";
		menuParam.wm_dversion="23_6.0";
		menuParam.wm_longitude="113939945";
		menuParam.wm_channel="1040";
		menuParam.wm_uuid="4A246A75A4E27F91C6F526C90A1691FC5422ED28653C89E2BB69685D9C8663FE";
		menuParam.wm_dtype="Nexus%206P";
		menuParam.poilist_wm_cityid="440300";
		menuParam.version="6.6.7";
		menuParam.push_token="dpshad82ca16853387c8caf8b2db308941e2atpu";
		menuParam.partner="4";
		menuParam.wm_appversion="6.6.7";
		menuParam.wm_seq="43";
		menuParam.ci = "30";
		menuParam.utm_content = "867981023009148";
		menuParam.utm_medium = "android";
		menuParam.utm_term = "60607";
		menuParam.utm_campaign = "AwaimaiBwaimaiGhomepage";
		menuParam.utm_source = "1040";
		
		RequestBean poiRequest = getPoiComment(menuParam);
		
		try {
			Response response = OkHttpUtils.postSync(poiRequest);
			System.out.println(response.body().string());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	//Frida hook Dump 请求 测试
	public static void mt_getcomments() {
		try {		
			String requestUrl  = "http://wmapi.meituan.com/api/v6/comment/poi?"
					+ "utm_medium=android&"
					+ "utm_content=867981023009148&"
					+ "utm_term=60607&"
					+ "utm_source=1040&"
					+ "ci=30&"
					+ "utm_campaign=AwaimaiBwaimaiGhomepage&"
					+ "uuid=4A246A75A4E27F91C6F526C90A1691FC5422ED28653C89E2BB69685D9C8663FE&"
					+ "__skck=6a375bce8c66a0dc293860dfa83833ef&"
					+ "__skts=1557047683442&"
					+ "__skua=d41d8cd98f00b204e9800998ecf8427e&"
					+ "__skno=1b63712f-b688-408d-b870-686441d2850c&"
					+ "__skcy=6VBkTn00U9d0rQs8St4ZzrzzBbE%3D";
			
			String requestBody ="wmpoiid=2991821&"
					+ "page_offset=0&"
					+ "page_size=20&"
					+ "comment_score_type=0&"
					+ "label_id=0&"
					+ "wm_latitude=22540640&"
					+ "wm_logintoken=&"
					+ "wm_mac=02%3A00%3A00%3A00%3A00%3A00&"
					+ "request_id=F9BF5DEB-31A6-4EB2-849B-486466C13744&"
					+ "poilist_mt_cityid=30&"
					+ "uuid=4A246A75A4E27F91C6F526C90A1691FC5422ED28653C89E2BB69685D9C8663FE&"
					+ "wm_actual_longitude=113940004&"
					+ "wm_actual_latitude=22539913&"
					+ "wm_ctype=android&"
					+ "app=4&wm_visitid=10585585-a832-451a-970e-68c7b4d962da&"
					+ "wm_did=867981023009148&"
					+ "userid=0&"
					+ "platform=4&"
					+ "seq_id=1649&"
					+ "wm_dversion=23_6.0&"
					+ "wm_longitude=113939945&"
					+ "wm_channel=1040&"
					+ "wm_uuid=4A246A75A4E27F91C6F526C90A1691FC5422ED28653C89E2BB69685D9C8663FE&"
					+ "wm_dtype=Nexus+6P&"
					+ "poilist_wm_cityid=440300&"
					+ "version=6.6.7&"
					+ "push_token=dpshad82ca16853387c8caf8b2db308941e2atpu&"
					+ "partner=4&"
					+ "wm_appversion=6.6.7&"
					+ "wm_seq=97&"
					+ "req_time=1557047683427&"
					+ "waimai_sign=PXpxDc0Dqp3UQbjnkWC02jUNtBnN%2BjV6oYsXSst8lYR1mNIO5NVbpz6zS2fDDAhbvF4sV1bAqDtWUrqI01CuAd4vo1bT%2Bg6PlEMrPO8BznEjEVqlOhvm5j5xpZb5MR6Y5mkpO8E%2FU5lvkQ5wJxX8nKvE8pXmMplTEbwR04greDY%3D";		
			OkHttpClient okHttpClient = new OkHttpClient();
			final Request request = new Request.Builder().url(requestUrl)
					.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), requestBody))
					.build();
			Call call = okHttpClient.newCall(request);
			Response response = call.execute();
			System.out.println("" + response.body().string());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/** 
	* @Title: ${getPoiComment} 
	* @Description: (根据请求参数生成一个PoiComment合法请求) 
	* @param ${PoiMenuParam} PoiComment请求的参数
	* @return ${RequestBean)合法PoiComment请求
	* @throws 
	*/
	public static RequestBean getPoiComment(PoiCommentParam params) {
		String api = "wmapi.meituan.com/api/v6/comment/poi";
		String url = "http://"+api;
		List<KeyValue> body = new ArrayList<KeyValue>();
		body.add(new KeyValue("wmpoiid", params.wmpoiid));	
		body.add(new KeyValue("page_offset", params.page_offset));
		body.add(new KeyValue("page_size", params.page_size));
		body.add(new KeyValue("comment_score_type", params.comment_score_type));
		body.add(new KeyValue("label_id", params.label_id));	
		body.add(new KeyValue("wm_latitude", params.wm_latitude));
		body.add(new KeyValue("wm_logintoken", params.wm_logintoken));
		body.add(new KeyValue("wm_mac", params.wm_mac));
		body.add(new KeyValue("request_id", params.request_id));
		body.add(new KeyValue("poilist_mt_cityid", params.poilist_mt_cityid));
		body.add(new KeyValue("uuid", params.uuid));
		body.add(new KeyValue("wm_actual_longitude", params.wm_actual_longitude));
		body.add(new KeyValue("wm_actual_latitude", params.wm_actual_latitude));
		body.add(new KeyValue("wm_ctype", params.wm_ctype));
		body.add(new KeyValue("app", params.app));
		body.add(new KeyValue("wm_visitid", params.wm_visitid));
		body.add(new KeyValue("wm_did", params.wm_did));
		body.add(new KeyValue("userid", params.userid));
		body.add(new KeyValue("platform", params.platform));
		body.add(new KeyValue("seq_id", params.seq_id));
		body.add(new KeyValue("wm_dversion", params.wm_dversion));
		body.add(new KeyValue("wm_longitude", params.wm_longitude));
		body.add(new KeyValue("wm_channel", params.wm_channel));
		body.add(new KeyValue("wm_uuid", params.wm_uuid));
		body.add(new KeyValue("wm_dtype", params.wm_dtype));
		body.add(new KeyValue("poilist_wm_cityid", params.poilist_wm_cityid));
		body.add(new KeyValue("version", params.version));
		body.add(new KeyValue("push_token", params.push_token));
		body.add(new KeyValue("partner", params.partner));
		body.add(new KeyValue("wm_appversion", params.wm_appversion));
		body.add(new KeyValue("wm_seq", params.wm_seq));
		body.add(new KeyValue("req_time", ""+System.currentTimeMillis()));
		String waimai_sign = MeituanModule.calc_sign(api, body);
		body.add(new KeyValue("waimai_sign", waimai_sign));
		
		List<KeyValue> query = new ArrayList<KeyValue>();
		query.add(new KeyValue("utm_medium", params.utm_medium));
		query.add(new KeyValue("utm_content", params.utm_content));
		query.add(new KeyValue("utm_term", params.utm_term));
		query.add(new KeyValue("utm_source", params.utm_source));
		query.add(new KeyValue("ci", params.ci));
		query.add(new KeyValue("utm_campaign", params.utm_campaign));
		query.add(new KeyValue("uuid", params.uuid));
		query.add(new KeyValue("__skck", "6a375bce8c66a0dc293860dfa83833ef"));
		query.add(new KeyValue("__skts","" + System.currentTimeMillis() ));
		query.add(new KeyValue("__skua", "d41d8cd98f00b204e9800998ecf8427e"));
		query.add(new KeyValue("__skno",UUID.randomUUID().toString()));
		String __skcy = MeituanModule.calc_skcy(url, query, body);
		__skcy =  URLEncoder.encode(__skcy);
		query.add(new KeyValue("__skcy",__skcy));
		
	
		RequestBean poiRequest = new RequestBean();
		poiRequest.requestUrl = url + "?" + CommUtil.list2String(query);
		poiRequest.requestBody = CommUtil.list2String(body);
		return poiRequest;
	}

}
