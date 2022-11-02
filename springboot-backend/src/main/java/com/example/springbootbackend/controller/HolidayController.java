package com.example.springbootbackend.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.exception.ResourceNotFoundException;

import com.example.springbootbackend.model.Holiday;
import com.example.springbootbackend.repository.HolidayRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class HolidayController {

	@Autowired
	private HolidayRepository holidayRepository;
	
	//get all holidays
	@GetMapping("/holidays")
	public List<Holiday> getHolidays() {
		return holidayRepository.findAll();
	}
	
	//count no.of holidays
	@PostMapping("/holidays/count")
	public long getCount() {
		return holidayRepository.count();
	}

	//create holiday
	@PostMapping("/holidays")
	public Holiday save(@RequestBody Holiday holiday) {
		return holidayRepository.save(holiday);
	}
	
	
	// get holiday
	@GetMapping("/holidays/{id}")
	public ResponseEntity<Holiday> getHolidayById(@PathVariable Long id) {
		Holiday holiday = holidayRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Holiday not exist with id :" + id));
		return ResponseEntity.ok(holiday);
	}
	
	// update holiday	
	
	@PutMapping("/holidays/{id}")
		public ResponseEntity<Holiday> updateHoliday(@PathVariable Long id, @RequestBody Holiday holidayDetails){
			Holiday holiday = holidayRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
			
			holiday.setHoliday(holidayDetails.getHoliday());
			holiday.setHolidayFromDate(holidayDetails.getHolidayFromDate());
			holiday.setHolidayToDate(holidayDetails.getHolidayToDate());
			
			Holiday updatedHoliday = holidayRepository.save(holiday);
			return ResponseEntity.ok(updatedHoliday);
		}
	
	//delete holiday
	@DeleteMapping("/holidays/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteHoliday(@PathVariable Long id){
		Holiday holiday = holidayRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Holiday not exist with id :" + id));
		
		holidayRepository.delete(holiday);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
