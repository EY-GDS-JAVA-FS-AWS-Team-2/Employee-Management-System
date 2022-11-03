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

import com.example.springbootbackend.model.WorkingHistory;
import com.example.springbootbackend.repository.WorkingHistoryRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class WorkingHistoryController {
	
	@Autowired
	private WorkingHistoryRepository workingHistoryRepository;
	
	//get all working history
	@GetMapping("/workinghistory")
	public List<WorkingHistory> getWorkingHistory() {
		return workingHistoryRepository.findAll();
	}
	
	//create working history
		@PostMapping("/workinghistory")
		public WorkingHistory save(@RequestBody WorkingHistory workingHistory) {
			return workingHistoryRepository.save(workingHistory);
		}
	
		// get working history
		@GetMapping("/workinghistory/{id}")
		public ResponseEntity<WorkingHistory> getWorkingHistoryById(@PathVariable Long id) {
			WorkingHistory workingHistory = workingHistoryRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Holiday not exist with id :" + id));
			return ResponseEntity.ok(workingHistory);
		}
		
		// update working history	
		
		@PutMapping("/workinghistory/{id}")
			public ResponseEntity<WorkingHistory> updateWorkingHistory(@PathVariable Long id, @RequestBody WorkingHistory workingHistoryDetails){
			WorkingHistory workingHistory = workingHistoryRepository.findById(id)
						.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
				
			workingHistory.setCompanyName(workingHistoryDetails.getCompanyName());
			workingHistory.setEmployerName(workingHistoryDetails.getEmployerName());
			workingHistory.setCompanyEmployerAddress(workingHistoryDetails.getCompanyEmployerAddress());
			workingHistory.setCompanyEmployerCellularPhone(workingHistoryDetails.getCompanyEmployerCellularPhone());
			workingHistory.setCompanyEmployerOfficePhone(workingHistoryDetails.getCompanyEmployerOfficePhone());
			workingHistory.setPreviousQualification(workingHistoryDetails.getPreviousQualification());
			workingHistory.setPreviousExperience(workingHistoryDetails.getPreviousExperience());
			workingHistory.setStartDate(workingHistoryDetails.getStartDate());
			workingHistory.setEndDate(workingHistoryDetails.getEndDate());
				
				WorkingHistory updatedWorkingHistory = workingHistoryRepository.save(workingHistory);
				return ResponseEntity.ok(updatedWorkingHistory);
			}
		
		//delete working history
		@DeleteMapping("/workinghistory/{id}")
		public ResponseEntity<Map<String, Boolean>> deleteHoliday(@PathVariable Long id){
			WorkingHistory workingHistory = workingHistoryRepository.findById(id)
					.orElseThrow(() -> new ResourceNotFoundException("Holiday not exist with id :" + id));
			
			workingHistoryRepository.delete(workingHistory);
			Map<String, Boolean> response = new HashMap<>();
			response.put("deleted", Boolean.TRUE);
			return ResponseEntity.ok(response);
		}
}	