package com.example.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Email;

public interface EmailRepository extends MongoRepository<Email, Integer>{

}
 