package com.example.demo.repository;

import com.example.demo.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepository {
    private final List<Course> courses = new ArrayList<>();

    public CourseRepository() {
        courses.add(new Course(1L, "Spring Boot Framework", "ACTIVE", 1L));
        courses.add(new Course(2L, "ReactJS Core", "ACTIVE", 2L));
    }

    public List<Course> findAll() {
        return courses;
    }
}
