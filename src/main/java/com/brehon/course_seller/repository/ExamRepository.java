package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {
}
