package com.swapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swapi.models.Planeta;

public interface SwapiRepository extends JpaRepository<Planeta, Long> {
	
	Planeta findById(long id);


}
