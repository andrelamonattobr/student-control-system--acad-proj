package com.scs.app.repository;

import com.scs.app.model.StudentClassAttendanceModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentClassAttendanceRepository extends JpaRepository<StudentClassAttendanceModel, Long> {
}
