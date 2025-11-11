package com.gnana.backend.controller;


import com.gnana.backend.model.Course;
import com.gnana.backend.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping
    public List<Course> getAllCourse() {
        return courseService.getCourse();
    }

    @GetMapping("/{category}")
    public Optional<Course> getCourseCategory(@PathVariable String category){
        return courseService.getCourseByCategory(category);
    }
}
