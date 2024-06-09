package com.mini_data_hub.mini_data_hub.controller;

import com.mini_data_hub.mini_data_hub.entity.Student;
import com.mini_data_hub.mini_data_hub.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentController {

    @Autowired
    StudentRepository repo;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        List<Student> allStudents=repo.findAll();
        return allStudents;
    }

    @GetMapping("/students/{rollNo}")
    public Student getStudent(@PathVariable int rollNo){
        Student student = repo.findById(rollNo).get();
        return student;
    }

    @PostMapping("student/add")
    @ResponseStatus(HttpStatus.CREATED)
    public void createStudent(@RequestBody Student student){
        repo.save(student);
    }

    @PutMapping("student/update/{rollNo}")
    public void updateStudent(@RequestBody Student student,@PathVariable int rollNo){
        Student intended_student= repo.findById(rollNo).get();
        System.out.println(intended_student);
        System.out.println("-----------------------------");
        intended_student.setName(student.getName());
        intended_student.setPercentage(student.getPercentage());
        intended_student.setBranch(student.getBranch());
        repo.save(intended_student);
    }

}
