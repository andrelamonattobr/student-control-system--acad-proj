package com.scs.app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClassModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fk_class")
    List<StudentClassModel> class_side;

}
