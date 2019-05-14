package com.module.test;


import com.utils.CommUtil;


public class ChannelParam {
	public String ci;
	public String utm_content;
	public String utm_medium;
	public String uuid;
	public String utm_term;
	public String utm_campaign;
	public String utm_source;
	
	public String latitude;
	public String longitude;
	public String page_index;
	public String page_size;
	public String sort_type;
	public String category_type;
	public String filter_type;
	public String second_category_type;
	public String navigate_type;
	public String activity_filter_codes;
	public String slider_select_data;
	public String load_type;
	public String preload;
	public String trace_tag;
	public String rank_trace_id;
	public String session_id;
	public String union_id;
	public String app;
	public String platform;
	public String push_token;
	public String wm_latitude;
	public String userid;
	public String wm_logintoken;
	public String wm_mac;
	public String wm_uuid;
	public String version;	
	public String wm_actual_longitude;
	public String wm_dtype;
    public String request_id;
	public String wm_actual_latitude;
	public String wm_did;
	public String wm_ctype;
	public String wm_visitid;
	public String seq_id;
	public String partner;
	public String wm_appversion;
	public String wm_dversion;
	public String wm_longitude;
	public String wm_channel;
	public String wm_seq;
	public String req_time;
	
	public String region_id;
	public String region_version;
	
	
	
	public static ChannelParam generateParam(RegisterResult rr) {
		ChannelParam cp = new ChannelParam();

		cp.ci="30";
		cp.utm_content="306146104722665";
		cp.utm_medium="android";
		cp.uuid="3473C2A9BC76737C4D54C13674C40F9BB4F02F6F4B47A9FEFABEBD00B9FAB473";
		cp.utm_term="60607";
		cp.utm_campaign="AwaimaiBwaimaiGhomepage";
		cp.utm_source="1040";
		cp.latitude="22540062";
		cp.longitude="113940052";
		cp.page_index="0";
		cp.page_size="0";
		cp.sort_type="5";
		cp.category_type="910";
		cp.filter_type="0";
		cp.second_category_type="0";
		cp.navigate_type="910";
		cp.activity_filter_codes="";
		cp.slider_select_data="";
		cp.load_type="3";
		cp.preload="0";
		cp.trace_tag="";
		cp.rank_trace_id="";
		cp.session_id="08f129ec-e2a0-4942-a8ac-8292260dac521552638526766647";
		cp.union_id="4976be2eb3004bf0b8cada9ba7571031a155267004504712169";
		cp.app="4";
		cp.platform="4";
		cp.push_token="dpshcf00fe28e89e0a4fbf3c42ee427c7c2batpu";
		cp.wm_latitude="22540062";
		cp.userid="0";
		cp.wm_logintoken="";
		cp.wm_mac="6C%3AC4%3A18%3ABC%3AB1%3A28";
		cp.wm_uuid="3473C2A9BC76737C4D54C13674C40F9BB4F02F6F4B47A9FEFABEBD00B9FAB473";
		cp.version="6.6.7";
		cp.wm_actual_longitude="113940052";
		cp.wm_dtype= CommUtil.urlEncode("Note+3");
		cp.request_id="EE50F21C-9EE3-4251-9C35-31A97229A9F6";
		cp.wm_actual_latitude="22540062";
		cp.wm_did="306146104722665";
		cp.wm_ctype="android";
		cp.wm_visitid="1e7b2cbf-d34a-4bb9-ad02-ab8aaa192847";
		cp.seq_id="86";
		cp.partner="4";
		cp.uuid="3473C2A9BC76737C4D54C13674C40F9BB4F02F6F4B47A9FEFABEBD00B9FAB473";
		cp.wm_appversion="6.6.7";
		cp.wm_dversion="19_4.4.4";
		cp.wm_longitude="113940052";
		cp.wm_channel="1040";
		cp.wm_seq="36";
		cp.req_time="1552638639988";
		
		cp.region_id = "1000440300";
		cp.region_version = ""+System.currentTimeMillis();
	
		return cp;
	}
	
}
