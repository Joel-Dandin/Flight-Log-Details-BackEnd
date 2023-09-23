package com.joel.aviation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.aviation.model.Aircraft;
import com.joel.aviation.model.AircraftRepository;

@Service
public class AircraftService {
	private final AircraftRepository aircraftRepository;
	
	@Autowired
    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    public boolean addAircraft(Aircraft aircraft) {
        try {
        	aircraftRepository.save(aircraft);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public Aircraft showAircrafts(long aircraft_id) {
     	 try {
     		 
     		 return aircraftRepository.getById(aircraft_id);

          } catch (Exception e) {
              e.printStackTrace();
              return null; // Error occurred during the update
          }
     }
    public List<Aircraft> showAllAircrafts() {
    	 try {
    		 
    		 return aircraftRepository.findAll();

         } catch (Exception e) {
             e.printStackTrace();
             return null; // Error occurred during the update
         }
    }
    
}
