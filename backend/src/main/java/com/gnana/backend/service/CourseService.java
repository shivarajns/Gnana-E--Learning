package com.gnana.backend.service;

import com.gnana.backend.model.Course;
import com.gnana.backend.repository.CourseReopsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseReopsitory courseReopsitory;


    public List<Course> getCourse(){
        return courseReopsitory.findAll();
    }

    public Course addCourse(Course course){
        return courseReopsitory.save(course);
    }

    public Optional<Course> getCourseByCategory(String category){
        return courseReopsitory.findBycategory(category);
    }

    public void deleteById(int id){
        courseReopsitory.deleteById(id);
    }
}
