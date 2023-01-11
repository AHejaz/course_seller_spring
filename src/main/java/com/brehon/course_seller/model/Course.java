package com.brehon.course_seller.model;

import com.brehon.course_seller.model.impl.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "course")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",nullable = false,length = 20)
    private String name;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "language_id",referencedColumnName = "id",nullable = false)
    private Language language;

    @Enumerated(EnumType.STRING)
    private Level level;

    @OneToMany(mappedBy = "course")
    private List<CourseUser> courseUsers;

}
