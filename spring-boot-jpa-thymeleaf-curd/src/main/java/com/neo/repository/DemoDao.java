package com.neo.repository;

import org.springframework.data.repository.CrudRepository;

import com.neo.entity.Demo;

public interface DemoDao extends CrudRepository<Demo, Long>{
	Demo findByName(String name);
}
