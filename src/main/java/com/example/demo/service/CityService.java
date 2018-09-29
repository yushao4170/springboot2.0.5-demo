package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRespository;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Service
public class CityService {

	@Autowired
	private CityRespository cityRespository;

	public List<City> getCitys() {
		List<City> cities = cityRespository.findAll();
		return cities;
	}

	@Transactional
	public City save(City city) {
		city = cityRespository.save(city);
		return city;
	}
}
