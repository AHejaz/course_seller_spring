package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
    Optional<Test>findByStudent_NationalCode(String nationalCode);
}
