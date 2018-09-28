package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Slf4j
@Controller
public class DemoController {

	@GetMapping("/manage/hello")
	public String hello() {
		return "demo";
	}

	@GetMapping("/manage/login")
	public String login() {
		log.debug("login");
		return "demo";
	}

}
