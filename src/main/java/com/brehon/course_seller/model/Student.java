package com.brehon.course_seller.model;

import com.brehon.course_seller.model.impl.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class Student extends User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "student_number",nullable = false,unique = true,length = 16)
    private String studentNumber;


    private Level level;


    @OneToMany(mappedBy = "student")
    private List<CourseUser> courseUsers;
}
