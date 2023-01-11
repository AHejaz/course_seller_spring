package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Student;
import com.brehon.course_seller.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher,Long> {
    Optional<Teacher> findByEmployeeNumber(String employeeNumber);
}
