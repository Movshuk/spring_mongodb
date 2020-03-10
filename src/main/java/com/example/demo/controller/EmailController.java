package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Email;
import com.example.demo.repository.EmailRepository;

@RestController
public class EmailController {
	@Autowired
	private EmailRepository emailRepository;
	
	@GetMapping("/")
	public String getIndex() {
		return "spring app run";
	}
			
	@PostMapping("/sendEmail")
	public String sendEmail(@RequestBody Email email) {
		emailRepository.save(email);
		return "email " + email.getId() + " sended"; 
	}
	
	@GetMapping("/getEmails")
	public List<Email> getAllEmails() {
		return emailRepository.findAll();
	}
	
	@GetMapping("/deleteall")
	public String deleteAll() {
		emailRepository.deleteAll();
		return "All emails is deleted";
	}

}
 