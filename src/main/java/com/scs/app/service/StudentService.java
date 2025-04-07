package com.scs.app.service;

import com.scs.app.model.StudentModel;
import com.scs.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<StudentModel> listStudents(){
        return studentRepository.findAll();
    }

    public StudentModel searchStudentById(Long id){
        return studentRepository.findById(id).orElse(null);
    }

    public boolean createStudent(String name){
        try {
            StudentModel studentModel = new StudentModel();
            studentModel.setName(name);
            studentRepository.saveAndFlush(studentModel);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
