package com.gnana.backend.controller;


import com.gnana.backend.model.CourseModules;
import com.gnana.backend.service.CourseModulesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
@CrossOrigin(origins = "http://localhost:3000")
public class CourseModulesController {

    @Autowired
    private CourseModulesService courseModulesService;

    @GetMapping("/{course_id}/modules")
    public List<CourseModules> courseModules(@PathVariable int course_id){
        return courseModulesService.getModulsByCourseId(course_id);
    }
}
