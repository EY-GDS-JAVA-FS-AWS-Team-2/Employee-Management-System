package com.example.springbootbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootbackend.exception.ResourceNotFoundException;
import com.example.springbootbackend.model.Salary;
import com.example.springbootbackend.repository.SalaryRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class SalaryController {

	@Autowired
	private SalaryRepository salaryRepository;
	
	//get salary info
	@GetMapping("/salary")
	public List<Salary> getSalary()
	{
		return salaryRepository.findAll();
	}
	
	//get salary
	@GetMapping("/salary/{id}")
	public ResponseEntity<Salary> getSalaryById(@PathVariable Long id){
		Salary salary=salaryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Salary does not exist for id:"+id));
		return ResponseEntity.ok(salary);
	}
	
	//update salary
	@PutMapping("/salary/{id}")
	public ResponseEntity<Salary> updateSalary(@PathVariable Long id, @RequestBody Salary salaryDetails){
		Salary salary = salaryRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
		
		salary.setSalary(salaryDetails.getSalary());
		salary.setCurrency(salaryDetails.getCurrency());
		salary.setDeductions(salaryDetails.getDeductions());
		salary.setFromDate(salaryDetails.getFromDate());
		salary.setInsurance(salaryDetails.getInsurance());
		salary.setSalary(salaryDetails.getSalary());
		salary.setTax(salaryDetails.getTax());
		salary.setToDate(salaryDetails.getToDate());
				
		Salary updatedSalary=salaryRepository.save(salary);
		return ResponseEntity.ok(updatedSalary);
	}
	
}