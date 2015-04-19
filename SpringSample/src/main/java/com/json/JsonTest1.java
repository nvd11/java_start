package com.json;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class JsonTest1 {
	
    public static JSONObject createJSONObject(){  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("username","huangwuyi");  
        jsonObject.put("sex", "男");  
        jsonObject.put("QQ", "999999999");  
        jsonObject.put("Min.score", new Integer(99));  
        jsonObject.put("nickname", "梦中心境");  
        return jsonObject;  
    }   

}
