package com.thoughtworks.capability.gtb.restfulapidesign.controller;

import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import com.thoughtworks.capability.gtb.restfulapidesign.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;;




@RestController("/")
@Validated
public class StudentController {
    // 抛出异常
    // @Valid
    // @Validated 用法巩固

    private StudentService studentService;

    public void StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public ResponseEntity createStudent(@RequestBody Student student) {
        studentService.create(student);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @DeleteMapping ("/delete")
    public ResponseEntity deleteStudent(@RequestBody Student student) {
        studentService.create(student);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    public ResponseEntity shuffle() {
        return null;
    }
}
