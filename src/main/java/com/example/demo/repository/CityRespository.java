package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.City;

/**
 * @author guoyu.huang
 * @version 1.0.0
 */
@Repository
public interface CityRespository extends JpaRepository<City, String> {

	@Modifying
	@Query("update City set name = :name where id = :id")
	int updateNameById(@Param("name") String name, @Param("id") String id);

	@Modifying
	@Query("update City set name = :name where id in :ids")
	int updateNameByIds(@Param("name") String name, @Param("ids") List<String> ids);

}
