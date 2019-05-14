package com.entry;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Iterator;
import io.javalin.Javalin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create().start(7000);
        app.get("/", ctx -> ctx.json(sign(ctx.queryParamMap())));
    }

    public static Map<String, String> sign(Map<String, List<String>> m) {
        Iterator i = m.keySet().iterator();
        Map _m = new HashMap();
        while(i.hasNext()) {
            String k = (String)i.next();
            List v = m.get(k);
            _m.put(k, (String)v.get(0));
        }
        Map r = new HashMap();
       // r.put("sign", //Sign.generateSign(_m));
        return r;
    }
    
}
