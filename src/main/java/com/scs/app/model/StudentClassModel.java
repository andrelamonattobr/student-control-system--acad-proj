package com.scs.app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentClassModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fk_studentClass")
    List<StudentClassAttendanceModel> studentClass_side;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_student")
    StudentModel fk_student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_class")
    ClassModel fk_class;

}
