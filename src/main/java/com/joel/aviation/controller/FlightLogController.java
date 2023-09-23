package com.joel.aviation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joel.aviation.model.Aircraft;
import com.joel.aviation.model.FlightLog;
import com.joel.aviation.service.FlightLogService;

@RestController
@CrossOrigin(origins = "*")
public class FlightLogController {
	private final FlightLogService flightLogService;
	@Autowired
    public FlightLogController(FlightLogService flightLogService) {
        this.flightLogService = flightLogService;
    }
	
//	http://localhost:8080/Aircraft/add
	/*Data should be linke
	 * {"id":"3",
    	"name":"Delta",
    	"serial_number":"1"}
	 */
	@PostMapping("/FlightLog/add")
	public boolean newInbound(@RequestBody FlightLog newFlightLog) {
		System.out.println("Adding " + newFlightLog.toString());
		return flightLogService.addFlightLog(newFlightLog);
	}
//	http://localhost:8080//FlightLog/allflightLog
	@GetMapping(value = "/FlightLog/allflightLog")
	public List<FlightLog> allflightLog() {

		return flightLogService.showAllFlightLogs();
	}
//	http://localhost:8080/FlightLog/flightLog/1
	@GetMapping(value = "/FlightLog/flightLog/{flightLog_id}")
	public List<FlightLog> flightLog(@PathVariable("flightLog_id") long flightLog_id ) {

		return flightLogService.showFlightLogs(flightLog_id);
	}
}
