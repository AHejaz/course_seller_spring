package com.brehon.course_seller.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Test {

    @EmbeddedId
    private TestKey testKey;

    @ManyToOne
    @MapsId(value = "studentId")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @MapsId(value = "examId")
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @Column(name = "mark")
    private Double mark;
}
