package com.example.lbk.MyDesignPattren.proxy;

import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lbk.MyDesignPattren.proxy.staticproxy.Bird;
import com.example.lbk.MyDesignPattren.proxy.staticproxy.Flyable;

//import com.example.lbk.MyDesignPattren.proxy.staticproxy.Bird;
//import com.example.lbk.MyDesignPattren.proxy.staticproxy.Bird2;
//import com.example.lbk.MyDesignPattren.proxy.staticproxy.BirdLogProxy;
//import com.example.lbk.MyDesignPattren.proxy.staticproxy.BirdTimeProxy;

@RestController
@RequestMapping("/proxy")
public class ProxyController {
	
	private String sourcePath = "C:/Users/zwj/Desktop";
	
	@RequestMapping("/dynamicProxy")
	public void getFlyTime() throws Exception {

	}

}
