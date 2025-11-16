package com.gnana.backend.service;

import com.gnana.backend.model.CourseModules;
import com.gnana.backend.repository.CourseModulesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class CourseModulesService {

    @Autowired
    private CourseModulesRepository courseModulesRepository;


    public List<CourseModules> getModulsByCourseId(int course_id){
        return courseModulesRepository.findByCourseId(course_id);
    }
}
