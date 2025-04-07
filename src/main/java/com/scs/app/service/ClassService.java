package com.scs.app.service;

import com.scs.app.model.ClassModel;
import com.scs.app.model.StudentModel;
import com.scs.app.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    ClassRepository classRepository;

    public List<ClassModel> listClasses(){
        return classRepository.findAll();
    }

    public ClassModel searchClasById(Long id){
        return classRepository.findById(id).orElse(null);
    }

    public boolean createClass(String name){
        try {
            ClassModel classModel = new ClassModel();
            classModel.setName(name);
            classRepository.saveAndFlush(classModel);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
