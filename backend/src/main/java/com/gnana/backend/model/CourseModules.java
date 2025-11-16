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
public class CourseDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int module_id;

    @Column(nullable = false)
    private int course_id;

    @Column(nullable = false)
    private int module_number;

    @Column(nullable = false)
    private String module_title;

}
