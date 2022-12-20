package com.example.mongochapter1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")


public class StudentController
{

    @Autowired
    private StudentRepo studentRepo;

    @PostMapping("/add")

    public Student addStudent(@RequestBody Student student){
       return studentRepo.save(student);
    }




}
