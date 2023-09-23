package com.joel.aviation.model;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightLogRepository extends JpaRepository<FlightLog, Long>{
	FlightLog getById(Long id);	
	List<FlightLog> findByAircraftid(long aircraftid);
//	List<FlightLog> getList();
}
 	