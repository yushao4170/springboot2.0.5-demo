package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.City;
import com.example.demo.service.RestTemplateSerivce;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RestController
public class RestRestController {

	@Autowired
	private RestTemplateSerivce restClientSerivce;

	@GetMapping("/rest/test")
	public List<City> getCityTest() {
		List<City> cityList = restClientSerivce.getCity();
		return cityList;
	}
}
