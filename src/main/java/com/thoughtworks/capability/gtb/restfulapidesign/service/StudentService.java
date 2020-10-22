package com.thoughtworks.capability.gtb.restfulapidesign.service;

import com.thoughtworks.capability.gtb.restfulapidesign.dao.Dataprovider;
import com.thoughtworks.capability.gtb.restfulapidesign.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    public void create(Student student) {
        Dataprovider.students.add(student);
    }

    public void delete(Student student) {
        Dataprovider.students.remove(student);
    }
}
