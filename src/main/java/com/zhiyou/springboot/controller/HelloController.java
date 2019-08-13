package com.zhiyou.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //相当于在本类中所有的@RequestMapping上加上@reponseBody注解
public class HelloController {
	@RequestMapping("hello")
	public String method() {
		System.out.println("你好，孙航");
		return null;
	}
}
