package com.example.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@RestController
@RequestMapping(value = "/city")
public class CityRestController {

	@Autowired
	private CityService cityService;

	@GetMapping(value = "/get")
	public List<City> getCity() {
		return cityService.getCitys();
	}

	@PostMapping(value = "/save")
	public City save(@RequestBody City city) {
		return cityService.save(city);
	}

	@PutMapping(value = "/update")
	public int update(@RequestBody City city) {
		return cityService.updateNameById(city.getId(), city.getName());
	}

	@PutMapping(value = "/update-more")
	public int updateMore(@RequestBody List<String> ids) {
		return cityService.updateNameByIds(ids, "new name");
	}
}
