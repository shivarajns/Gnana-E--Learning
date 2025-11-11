package com.gnana.backend.repository;

import com.gnana.backend.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseReopsitory extends JpaRepository<Course, Integer> {
    Optional<Course> findBycategory(String category);
}
