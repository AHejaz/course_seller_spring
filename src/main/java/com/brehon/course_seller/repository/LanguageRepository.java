package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Long> {
    Optional<Language> findByLanguage(String language);
}
