package com.brehon.course_seller.repository;

import com.brehon.course_seller.model.Course;
import com.brehon.course_seller.model.impl.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
    List<Course> findByName(String name);
    List<Course> findByLanguage_Language(String language);

    List<Course> findByLevel(Level level);
}
