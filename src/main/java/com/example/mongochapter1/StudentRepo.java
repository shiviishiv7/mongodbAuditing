package com.example.mongochapter1;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface StudentRepo extends MongoRepository<Student,String> {
}
