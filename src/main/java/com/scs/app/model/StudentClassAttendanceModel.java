package com.scs.app.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class StudentClassAttendanceModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_studentClass")
    StudentClassModel fk_studentClass;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public StudentClassModel getFk_studentClass() {
        return fk_studentClass;
    }

    public void setFk_studentClass(StudentClassModel fk_studentClass) {
        this.fk_studentClass = fk_studentClass;
    }
}
