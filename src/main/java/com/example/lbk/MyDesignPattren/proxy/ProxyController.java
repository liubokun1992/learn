package com.example.lbk.MyDesignPattren.proxy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lbk.MyDesignPattren.proxy.staticproxy.Bird;
import com.example.lbk.MyDesignPattren.proxy.staticproxy.Bird2;
import com.example.lbk.MyDesignPattren.proxy.staticproxy.BirdLogProxy;
import com.example.lbk.MyDesignPattren.proxy.staticproxy.BirdTimeProxy;

@RestController
@RequestMapping("/proxy")
public class ProxyController {
	
	@RequestMapping("/staticProxy")
	public void getFlyTime() throws Exception {
		Bird bird = new Bird();
		BirdLogProxy p2 = new BirdLogProxy(bird);
		BirdTimeProxy p1 = new BirdTimeProxy(p2);
		
		p1.fly();
	}

}
