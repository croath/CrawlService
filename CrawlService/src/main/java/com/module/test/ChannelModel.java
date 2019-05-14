package com.module.test;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.module.meituan.MeituanModule;
import com.utils.CommUtil;
import com.utils.KeyValue;
import com.utils.OkHttpUtils;
import com.utils.RequestBean;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class ChannelModel {

	private static void testPostChannel() throws Exception {
		// RegisterResult rr = RegisterModel.register();
		// Thread.sleep(5000);
		// ChannelParam cp = ChannelParam.generateParam(rr);
		// RequestParams poiRequest = getPoiChannepageRequest(cp);
//			String url = "http://wmapi.meituan.com/api/v7/poi/channelpage?ci=30&utm_content=359125052338383&utm_medium=android&uuid=321F9A1AE676D5794BB5D70326F4E3259F1B961CD2A8EFBDFBA2684018BF4766&utm_term=60607&utm_campaign=AwaimaiBwaimaiGhomepage&utm_source=1040&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1552463382908&__skua=d41d8cd98f00b204e9800998ecf8427e&__skno=e9d2754e-fd55-4f33-a090-4f46148d7143&__skcy=v6TOhrEBfNI00%2BnIRKd%2FCcoFNy8%3D";
//			String body = "latitude=22540330&longitude=113940052&page_index=0&page_size=20&sort_type=0&category_type=910&filter_type=0&second_category_type=0&navigate_type=910&activity_filter_codes=&slider_select_data=&load_type=1&preload=0&trace_tag=&rank_trace_id=&session_id=23c11cca-9d42-4be0-aab8-99052b8ea0e61552463345840886&union_id=36754aa8a05042599b9e9f5b90d84a0ea154707980884615831&app=4&platform=4&push_token=dpsh79e842dcbfa67bdca59609710934b989atpu&wm_latitude=22540330&userid=0&wm_logintoken=&wm_mac=f8%3Aa9%3Ad0%3A1c%3Abd%3A87&wm_uuid=321F9A1AE676D5794BB5D70326F4E3259F1B961CD2A8EFBDFBA2684018BF4766&version=6.6.7&wm_actual_longitude=113940052&wm_dtype=AOSP+on+HammerHead&request_id=ACDB77E6-9C83-4689-9211-8B7C9F75A0C4&wm_actual_latitude=22540330&wm_did=359125052338383&wm_ctype=android&wm_visitid=1340232b-2046-4706-b3fe-59c7d7b3a8cd&seq_id=62&partner=4&uuid=321F9A1AE676D5794BB5D70326F4E3259F1B961CD2A8EFBDFBA2684018BF4766&wm_appversion=6.6.7&wm_dversion=19_4.4.4&wm_longitude=113940052&wm_channel=1040&wm_seq=29&req_time=1552463396758&waimai_sign=XX0xX9EBbDOcgWcB8weKkUy6pUBNgSq3M0ObP4M%2B4PkCYEq4lWLHNz5PqiuV6VyhvCYpQ%2F%2FcJA7g64dY1O0t6QD2zvFcAONipgCQqV9Am1vvJ3uCkDhnAp8kZXoLFpewyDY5M17osk4KIOtJe%2B5%2F39dd8pdA4LQx%2FLtg99p%2BzOQ%3D";
//			
//			System.out.println(body);
		// System.out.println(poiRequest.requestUrl);
		// System.out.println(poiRequest.requestBody);
		// System.out.println(url);
		// sendRequest(poiRequest);
	}

	private static void sendRequest(RequestBean poiRequest) {

		OkHttpClient okHttpClient = new OkHttpClient();
		final Request request = new Request.Builder().url(poiRequest.requestUrl)
				.post(RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), poiRequest.requestBody))
				.build();
		Response resp = OkHttpUtils.postSync(request);
		try {
			System.out.print(resp.body().string());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static RequestBean getPoiChannepageRequest(ChannelParam params) throws Exception {
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

		query.add(new KeyValue("region_id", params.region_id));
		query.add(new KeyValue("region_version", params.region_version));

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
		body.add(new KeyValue("req_time", "" + System.currentTimeMillis()));

		String waimai_sign = MeituanModule.calc_sign("wmapi.meituan.com/api/v7/poi/channelpage", body);
		body.add(new KeyValue("waimai_sign", waimai_sign));

		query.add(new KeyValue("__skck", "6a375bce8c66a0dc293860dfa83833ef"));
		query.add(new KeyValue("__skts", "" + System.currentTimeMillis()));
		query.add(new KeyValue("__skua", "d41d8cd98f00b204e9800998ecf8427e"));
		query.add(new KeyValue("__skno", UUID.randomUUID().toString()));
		String __skcy = MeituanModule.calc_skcy(url, query, body);
		query.add(new KeyValue("__skcy", URLEncoder.encode(__skcy)));
		RequestBean poiRequest = new RequestBean();
		poiRequest.requestUrl = url + "?" + CommUtil.list2String(query);
		poiRequest.requestBody = CommUtil.list2String(body);
		return poiRequest;

	}

	public static void main(String args[]) {
		try {

			testPostChannel();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

//http://wmapi.meituan.com/api/v7/poi/channelpage?ci=30&utm_content=3359125052348383&utm_medium=android&uuid=BAF675E6BD2C391D015FCE511B24E6FCBA667CBD85E90B4C365777EDD0269008&utm_term=60607&utm_campaign=AwaimaiBwaimaiGhomepage&utm_source=1040&region_id=1000440300&region_version=1552462898442&__skck=6a375bce8c66a0dc293860dfa83833ef&__skts=1552462898493&__skua=d41d8cd98f00b204e9800998ecf8427e&__skno=96ffc667-9939-4c22-9daa-7efd80462e1a&__skcy=aqs40nWkrwir4zLfo00d7UV7kXg%3D
//latitude=22540331&longitude=113940064&page_index=0&page_size=20&sort_type=0&category_type=910&filter_type=0&second_category_type=0&navigate_type=910&activity_filter_codes=&slider_select_data=&load_type=1&preload=0&trace_tag=&rank_trace_id=&session_id=95b28840-7c8e-4839-9c8d-c81df96721f81552462898442861&union_id=dd3cc05995ef42d8b9c405ab0e78b952a155248882215280811&app=4&platform=4&push_token=dpsh6d0a833bfc681fe224e2f17e399e5291atpu&wm_latitude=22540331&userid=0&wm_logintoken=&wm_mac=f8:a9:d0:1c:bd:87&wm_uuid=BAF675E6BD2C391D015FCE511B24E6FCBA667CBD85E90B4C365777EDD0269008&version=6.6.7&wm_actual_longitude=113940064&wm_dtype=AOSP%20on%20HammerHead&request_id=80C1F677-E83B-4003-86CE-16E6AC9BC794&wm_actual_latitude=22540331&wm_did=3359125052348383&wm_ctype=android&wm_visitid=3df06fbd-7c79-4cde-8d77-61ba2540a2c9&seq_id=140&partner=4&uuid=BAF675E6BD2C391D015FCE511B24E6FCBA667CBD85E90B4C365777EDD0269008&wm_appversion=6.6.7&wm_dversion=19_4.4.4&wm_longitude=113940064&wm_channel=1040&wm_seq=66&req_time=1552462898442&waimai_sign=TUZwWUB8df7SAcnFSaQY%2BXUFMVkmb5oe1qi3Qdl7lf2v0SzX9sFUPvJnXGkh1Tl3Yh9BAz62UsfLz%2FmirGSoE5%2FyBqcPu7a3ShOFaabi10fN3aKqS8vUS1SMKE%2BDluFIuiD7nKwF4wIBfuLs4H7gHZdpvknQwiMtHWLhJG5lG0M%3D
