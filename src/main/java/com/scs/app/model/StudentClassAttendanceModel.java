package com.scs.app.model;

import jakarta.persistence.*;

@Entity
public class StudentClassAttendanceModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_studentClass")
    StudentClassModel fk_studentClass;

}
