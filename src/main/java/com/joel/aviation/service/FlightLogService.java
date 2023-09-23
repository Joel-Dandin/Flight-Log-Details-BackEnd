package com.joel.aviation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joel.aviation.model.FlightLog;
import com.joel.aviation.model.FlightLogRepository;

@Service
public class FlightLogService {
	private final FlightLogRepository flightLogRepository;
	
	@Autowired
    public FlightLogService(FlightLogRepository flightLogRepository) {
        this.flightLogRepository = flightLogRepository;
    }

    public boolean addFlightLog(FlightLog flightLog) {
        try {
        	flightLogRepository.save(flightLog);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public List<FlightLog> showFlightLogs(long flightLog_id) {
     	 try {
     		 
     		 return flightLogRepository.findByAircraftid(flightLog_id);

          } catch (Exception e) {
              e.printStackTrace();
              return null; // Error occurred during the update
          }
     }
    public List<FlightLog> showAllFlightLogs() {
    	 try {
    		 
    		 return flightLogRepository.findAll();

         } catch (Exception e) {
             e.printStackTrace();
             return null; // Error occurred during the update
         }
    }
}
