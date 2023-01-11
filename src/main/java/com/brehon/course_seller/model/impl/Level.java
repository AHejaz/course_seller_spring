package com.brehon.course_seller.model.impl;

import com.brehon.course_seller.exception.NotFoundException;
import lombok.Getter;

@Getter
public enum Level {

    A1(1),
    A2(2),
    B1(3),
    B2(4),
    C1(5),
    C2(6);

    private Integer value;

    Level(Integer value) {
        this.value = value;
    }
    public static Level getLevel(Integer level){
        for (Level value :
                values()) {
            if (value.getValue().equals(level))
                return value;
        }
        throw new NotFoundException("level not found");
    }

}
