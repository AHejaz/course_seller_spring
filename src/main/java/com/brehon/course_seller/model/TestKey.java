package com.brehon.course_seller.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestKey implements Serializable {

    @Column(name = "student_id",nullable = false,unique = true)
    private Long studentId;

    @Column(name = "exam_id",nullable = false,unique = true)
    private Long examId;
}
