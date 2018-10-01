package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.City;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Service
public class RestTemplateSerivce {

	private final RestTemplate restTemplate;

	public RestTemplateSerivce(RestTemplateBuilder restTemplateBuilder) {
		this.restTemplate = restTemplateBuilder.build();
	}

	public List<City> getCity() {
		ResponseEntity<City[]> cities = this.restTemplate.exchange("http://127.0.0.1:8080/city/get", HttpMethod.GET,
				null, City[].class);
		return Arrays.asList(cities.getBody());
	}
}
