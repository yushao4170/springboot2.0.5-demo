package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
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

	@Cacheable(cacheNames = "cache", key = "'all'")
	public List<City> getCitys() {
		List<City> cities = cityRespository.findAll();
		return cities;
	}

	@CacheEvict(cacheNames = "cache", key = "'all'")
	@Transactional
	public City save(City city) {
		city = cityRespository.save(city);
		return city;
	}

	@CacheEvict(cacheNames = "cache", key = "'all'")
	@Transactional
	public int updateNameById(String id, String name) {
		return cityRespository.updateNameById(name, id);
	}

	@CacheEvict(cacheNames = "cache", key = "'all'")
	@Transactional
	public int updateNameByIds(List<String> ids, String name) {
		return cityRespository.updateNameByIds(name, ids);
	}

	public Page<City> page(int offset, int pageSize) {
		return cityRespository.page(PageRequest.of(offset, pageSize).first());
	}
}
