package com.scs.app.repository;

import com.scs.app.model.StudentClassModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentClassRepository extends JpaRepository<StudentClassModel,Long> {
}
