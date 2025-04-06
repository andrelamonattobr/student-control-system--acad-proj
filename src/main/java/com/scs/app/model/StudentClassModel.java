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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<StudentClassAttendanceModel> getStudentClass_side() {
        return studentClass_side;
    }

    public void setStudentClass_side(List<StudentClassAttendanceModel> studentClass_side) {
        this.studentClass_side = studentClass_side;
    }

    public StudentModel getFk_student() {
        return fk_student;
    }

    public void setFk_student(StudentModel fk_student) {
        this.fk_student = fk_student;
    }

    public ClassModel getFk_class() {
        return fk_class;
    }

    public void setFk_class(ClassModel fk_class) {
        this.fk_class = fk_class;
    }
}
