package com.example.temp.controller;

import javax.servlet.http.HttpServletRequest;

public class BaseController {
	 public static final String PARAM_BASE_URL = "baseURL";
     
	    //get base URL
	    public String getBaseURL(HttpServletRequest request){
	    	String path = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath();
	    	System.out.println("Path: "+path);
	        return path;
	    }
}
