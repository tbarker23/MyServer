package com.example.demo.controller;

import java.io.File;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.ALL_VALUE)
	public ResponseEntity<File> test() {		
		File file = new File("test.jpg");	
		return ResponseEntity.ok().contentType(MediaType.IMAGE_PNG).body(file);
	}
	
	
}
