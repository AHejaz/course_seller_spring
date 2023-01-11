package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {
}
