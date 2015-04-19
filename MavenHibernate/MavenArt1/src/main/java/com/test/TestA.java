package com.test;

import com.bean.*;
import com.model.*;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class TestA {
	public static void f(){
		UserBean ub=new UserBean();  
        User user = new User();  
        user.setName("Jason");  
        user.setPassword("123456");  
        user.setEmail("ok@ujs.edu.cn");  
        ub.addUser(user); 
	}
	
    public static JSONObject createJSONObject(){  
        JSONObject jsonObject = new JSONObject();  
        jsonObject.put("username","huangwuyi");  
        jsonObject.put("sex", "男");  
        jsonObject.put("QQ", "999999999");  
        jsonObject.put("Min.score", new Integer(99));  
        jsonObject.put("nickname", "梦中心境");  
        jsonObject.element("address", "福建省厦门市");
        return jsonObject;  
    }   
    
    public static void g(){
    	JSONObject jsonObject = new JSONObject();  
        jsonObject.put("username","huangwuyi");  
        jsonObject.put("sex", "男");  
        jsonObject.put("QQ", "999999999");  
        jsonObject.put("Min.score", new Integer(99));  
        jsonObject.put("nickname", "梦中心境");  
        jsonObject.element("address", "福建省厦门市");
     
        JSONObject jsonObject2 = new JSONObject();  
        jsonObject2.put("username","bbbb");  
        jsonObject2.put("sex", "男");  
        jsonObject2.put("QQ", "999999999");  
        jsonObject2.put("Min.score", new Integer(99));  
        jsonObject2.put("nickname", "bbbb");  
        jsonObject2.element("address", "canton");
        
        JSONArray jsonArray = new JSONArray();  
        jsonArray.add(jsonObject);   
        jsonArray.add(jsonObject2);   
        
        System.out.println(jsonArray);
    }
    
}
