package com.scs.app.service;

import com.scs.app.model.StudentClassModel;
import com.scs.app.model.StudentModel;
import com.scs.app.repository.ClassRepository;
import com.scs.app.repository.StudentClassRepository;
import com.scs.app.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentClassService {

    @Autowired
    StudentClassRepository studentClassRepository;

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    ClassRepository classRepository;

    public boolean assignStudentToClass(Long classId, Long studentId){
        try {
            StudentClassModel studentClassModel = new StudentClassModel();
            studentClassModel.setFk_class(classRepository.findById(classId).orElseThrow());
            studentClassModel.setFk_student(studentRepository.findById(studentId).orElseThrow());
            studentClassRepository.saveAndFlush(studentClassModel);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    public List<StudentClassModel> listAll(){
        return studentClassRepository.findAll();
    }


}
