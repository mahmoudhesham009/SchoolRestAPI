package com.mahmoudh.students_restapi.service;

import com.mahmoudh.students_restapi.model.Student;
import com.mahmoudh.students_restapi.repository.StudentsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    StudentsRepo studentsRepo;

    public List<Student> getAllStudents(){
        return (List<Student>) studentsRepo.findAll();
    }

    public Student getStudentById(int id){
        return studentsRepo.findById(id).get();
    }

}
