package com.brehon.course_seller.model;

import com.brehon.course_seller.model.impl.Level;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "exam")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false,length = 50)
    private String name;

    @Column(name = "location_file",nullable = false,length = 90)
    private String locationFile;

    @OneToOne
    @JoinColumn(name = "language_id",referencedColumnName = "id",nullable = false)
    private Language language;

    @Enumerated(EnumType.STRING)
    private Level level;
}
