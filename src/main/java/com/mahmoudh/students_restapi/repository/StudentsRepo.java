package com.mahmoudh.students_restapi.repository;

import com.mahmoudh.students_restapi.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentsRepo extends CrudRepository<Student,Integer> {
}
