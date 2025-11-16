package com.gnana.backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "course_module")
public class CourseModules {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "module_id")
    private int moduleId;

    @Column(name = "course_id", nullable = false)
    private int courseId;

    @Column(name = "module_number", nullable = false)
    private int moduleNumber;

    @Column(name = "module_title", nullable = false)
    private String moduleTitle;
}
