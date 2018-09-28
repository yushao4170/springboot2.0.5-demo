package com.example.demo.web;

import java.util.Date;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.DemoVo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author xmasq_feiyu
 * @version 1.0.0
 */
@Secured("1")
@Slf4j
@RestController
public class DemoRestController {

	@Secured("123")
	@GetMapping(value = "/test")
	public DemoVo test() {
		log.error("this is error");
		log.warn("this is warn");
		log.info("this is info");
		log.debug("this is debug");
		log.trace("this is trace");
		DemoVo demoVo = new DemoVo();
		demoVo.setDete(new Date());
		return demoVo;
	}

	@Secured("1234")
	@GetMapping(value = "/test1")
	public DemoVo test1() {
		DemoVo demoVo = new DemoVo();
		demoVo.setDete(new Date());
		return demoVo;
	}
}
