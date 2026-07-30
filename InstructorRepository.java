package com.example.demo.repository;

import com.example.demo.model.Instructor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InstructorRepository {
    private final List<Instructor> instructors = new ArrayList<>();

    public InstructorRepository() {
        instructors.add(new Instructor(1L, "Nguyen Van A", "anguyen@gmail.com"));
        instructors.add(new Instructor(2L, "Tran Thi B", "btran@gmail.com"));
    }

    public List<Instructor> findAll() {
        return instructors;
    }
}
