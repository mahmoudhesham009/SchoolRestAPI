package com.mahmoudh.students_restapi.controller;


import com.mahmoudh.students_restapi.model.Student;
import com.mahmoudh.students_restapi.service.StudentsService;
import net.bytebuddy.implementation.bind.annotation.Default;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class StudentsController {
    @Autowired
    StudentsService studentsService;

    @GetMapping("/api/students")
    public ResponseEntity getStudents(@RequestParam(name = "id", required = false) Integer id){
        if(id!=null)
            return new ResponseEntity<Student>(studentsService.getStudentById(id),HttpStatus.OK);
        return new ResponseEntity<List<Student>>(studentsService.getAllStudents(), HttpStatus.OK);
    }
}
