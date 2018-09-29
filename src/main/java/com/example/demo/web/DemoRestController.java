package com.example.demo.web;

import java.util.Date;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.vo.DemoVo;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RestController
public class DemoRestController {

	@PreAuthorize("hasAuthority('test')")
	@GetMapping(value = "/test")
	public DemoVo test() {
		DemoVo demoVo = new DemoVo();
		demoVo.setDete(new Date());
		return demoVo;
	}

	@PreAuthorize("hasAuthority('test1')")
	@GetMapping(value = "/test1")
	public DemoVo test1() {
		DemoVo demoVo = new DemoVo();
		demoVo.setDete(new Date());
		return demoVo;
	}
}
