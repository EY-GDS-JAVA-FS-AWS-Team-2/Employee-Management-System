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
import com.example.springbootbackend.model.Time;
import com.example.springbootbackend.repository.TimeRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class TimeController {

	@Autowired
	private TimeRepository timeRepository;
	
	@GetMapping("/times")
	public List<Time> getTimes()
	{
		return timeRepository.findAll();
	}
	
	@PostMapping("/times")
	public Time createTime(@RequestBody Time time)
	{
		return timeRepository.save(time);
		
	}
	
	@GetMapping("/times/{id}")
	public ResponseEntity<Time> getTimeById(@PathVariable Long id) {
		Time time = timeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Timing information does not exist with id :" + id));
		return ResponseEntity.ok(time);
	}
	
	@PutMapping("/times/{id}")
	public ResponseEntity<Time> updateTime(@PathVariable Long id, @RequestBody Time timeDetails){
		Time time = timeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Timing information does not exist with id :" + id));
		
		time.setDaysoff(time.getDaysoff());
		time.setExtradays(time.getExtradays());
		time.setFromdate(time.getFromdate());
		time.setOffhours(time.getOffhours());
		time.setOvertime(time.getOvertime());
		time.setTodate(time.getTodate());
		time.setWorkedhours(time.getWorkedhours());
		
		Time updatedTime = timeRepository.save(time);
		return ResponseEntity.ok(updatedTime);
	}
	
	@DeleteMapping("/times/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteTime(@PathVariable Long id){
		Time time = timeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Timing information does not exist with id :" + id));
		
		timeRepository.delete(time);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
	
}

