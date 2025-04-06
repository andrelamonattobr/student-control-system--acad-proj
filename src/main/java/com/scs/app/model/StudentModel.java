package com.scs.app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fk_student")
    List<StudentClassModel> student_side;

}
