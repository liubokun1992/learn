package com.example.lbk.MyDesignPattren.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myTest")
public class Controller {
	
	@Value("${lbk.name}")
	private String myName;
	
	@RequestMapping("/hello")
	public String hello() throws Exception {
		String myCnName = new String(myName.getBytes("ISO-8859-1"), "utf-8");
		return myCnName + ":Hello World!";
	}
}
