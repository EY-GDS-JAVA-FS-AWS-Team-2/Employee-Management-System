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
import com.example.springbootbackend.model.Contact;
import com.example.springbootbackend.repository.ContactRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class ContactController {
	
	@Autowired
	private ContactRepository contactRepository;
	
	@GetMapping("/contacts")
	public List<Contact> getAllContacts()
	{
		return contactRepository.findAll();
	}
	
	@PostMapping("/contacts")
	public Contact createContact(@RequestBody Contact contact)
	{
		return contactRepository.save(contact);
	}
	
	@GetMapping("/contacts/{id}")
	public ResponseEntity<Contact> getContactById(@PathVariable Long id)
	{
		Contact contact = contactRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Contact does not exist with id :" + id));
		
		return ResponseEntity.ok(contact);
	}
	
	@PutMapping("/contacts/{id}")
	public ResponseEntity<Contact> updateContact(@PathVariable Long id,@RequestBody Contact contactDetails)
	{
		Contact contact = contactRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Contact does not exist with id :" + id));
		
		contact.setcAddress(contact.getcAddress());
		contact.setcCellularPhone(contact.getcCellularPhone());
		contact.setcCity(contact.getcCity());
		contact.setcFirstName(contact.getcFirstName());
		contact.setcLastName(contact.getcLastName());
		contact.setcMiddleName(contact.getcMiddleName());
		contact.setcHomePhone(contact.getcHomePhone());
		
		Contact updatedContact = contactRepository.save(contact);
		return ResponseEntity.ok(updatedContact);
	}
	
	@DeleteMapping("/contacts/{id}")
	public ResponseEntity<Map<String, Boolean>> deleteHoliday(@PathVariable Long id){
		Contact contact = contactRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Contact does not exist with id :" + id));
		
		contactRepository.delete(contact);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
