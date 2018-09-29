package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.City;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Repository
public interface CityRespository extends JpaRepository<City, String> {

}
