package com.scs.app.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class ClassModel {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fk_class")
    List<StudentClassModel> class_side;

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

    public List<StudentClassModel> getClass_side() {
        return class_side;
    }

    public void setClass_side(List<StudentClassModel> class_side) {
        this.class_side = class_side;
    }
}
