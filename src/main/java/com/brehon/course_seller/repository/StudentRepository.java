package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Optional<Student>findByStudentNumber(String studentNumber);

}
