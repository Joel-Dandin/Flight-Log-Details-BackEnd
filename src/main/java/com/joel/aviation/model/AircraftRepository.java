package com.joel.aviation.model;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository<Aircraft, Long>{
	Aircraft getById(Long id);	
//	List<Aircraft> getList();
}
 	