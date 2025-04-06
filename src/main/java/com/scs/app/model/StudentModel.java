package com.scs.app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class StudentModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fk_student")
    List<StudentClassModel> student_side;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<StudentClassModel> getStudent_side() {
        return student_side;
    }

    public void setStudent_side(List<StudentClassModel> student_side) {
        this.student_side = student_side;
    }
}
