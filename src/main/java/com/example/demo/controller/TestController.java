package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.MyTest;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET)
	public MyTest test() {		
		MyTest test = new MyTest();
		test.setName("tester mctestface");
		test.setTitle("tester guy");
		return test;
	}
	
	
}
