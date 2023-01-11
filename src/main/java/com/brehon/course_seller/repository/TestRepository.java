package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test,Long> {
}
