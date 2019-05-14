package com.module.taobao;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InnerNetworkConverter{
    private static final String TAG = "mtopsdk.InnerNetworkConverter";
    private static final Map<String, String> headerConversionMap;

    static {
        Map concurrentHashMap = new ConcurrentHashMap(32);
        headerConversionMap = concurrentHashMap;
        concurrentHashMap.put(HttpHeaderConstant.X_SID, "sid");
        headerConversionMap.put(HttpHeaderConstant.X_T, "t");
        headerConversionMap.put(HttpHeaderConstant.X_APPKEY, "appKey");
        headerConversionMap.put(HttpHeaderConstant.X_TTID, "ttid");
        headerConversionMap.put(HttpHeaderConstant.X_DEVID, "deviceId");
        headerConversionMap.put(HttpHeaderConstant.X_UTDID, "utdid");
        headerConversionMap.put(HttpHeaderConstant.X_SIGN, "sign");
        headerConversionMap.put(HttpHeaderConstant.X_NQ, "nq");
        headerConversionMap.put(HttpHeaderConstant.X_NETTYPE, "netType");
        headerConversionMap.put(HttpHeaderConstant.X_PV, "pv");
        headerConversionMap.put(HttpHeaderConstant.X_UID, "uid");
        headerConversionMap.put(HttpHeaderConstant.X_UMID_TOKEN, "umt");
        headerConversionMap.put(HttpHeaderConstant.X_REQBIZ_EXT, "reqbiz-ext");
        headerConversionMap.put(HttpHeaderConstant.X_MINI_WUA, HttpHeaderConstant.X_MINI_WUA);
        headerConversionMap.put(HttpHeaderConstant.X_APP_CONF_V, HttpHeaderConstant.X_APP_CONF_V);
        headerConversionMap.put(HttpHeaderConstant.X_EXTTYPE, HttpHeaderConstant.KEY_EXTTYPE);
        headerConversionMap.put(HttpHeaderConstant.X_EXTDATA, HttpHeaderConstant.KEY_EXTDATA);
        headerConversionMap.put(HttpHeaderConstant.X_FEATURES, HttpHeaderConstant.X_FEATURES);
        headerConversionMap.put(HttpHeaderConstant.X_PAGE_NAME, HttpHeaderConstant.X_PAGE_NAME);
        headerConversionMap.put(HttpHeaderConstant.X_PAGE_URL, HttpHeaderConstant.X_PAGE_URL);
        headerConversionMap.put(HttpHeaderConstant.X_PAGE_MAB, HttpHeaderConstant.X_PAGE_MAB);
        headerConversionMap.put(HttpHeaderConstant.X_APP_VER, HttpHeaderConstant.X_APP_VER);
        headerConversionMap.put(HttpHeaderConstant.X_ORANGE_Q, HttpHeaderConstant.X_ORANGE_Q);
        headerConversionMap.put("user-agent", "user-agent");
        headerConversionMap.put(HttpHeaderConstant.CLIENT_TRACE_ID, HttpHeaderConstant.CLIENT_TRACE_ID);
        headerConversionMap.put(HttpHeaderConstant.F_REFER, HttpHeaderConstant.F_REFER);
        headerConversionMap.put(HttpHeaderConstant.X_NETINFO, HttpHeaderConstant.X_NETINFO);
        headerConversionMap.put(HttpHeaderConstant.X_ROUTER_ID, HttpHeaderConstant.X_ROUTER_ID);
        headerConversionMap.put(HttpHeaderConstant.X_PLACE_ID, HttpHeaderConstant.X_PLACE_ID);
    }

    protected Map<String, String> getHeaderConversionMap() {
        return headerConversionMap;
    }
    
	private static HashMap converteMap(HashMap<String, String> hashMap) {
		
		return null;
	}
}