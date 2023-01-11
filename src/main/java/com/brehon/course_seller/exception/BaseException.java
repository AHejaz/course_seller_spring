package com.brehon.course_seller.exception;

import org.springframework.http.HttpStatus;

public abstract class BaseException extends RuntimeException{

    public BaseException(String message) {
        super(message);
    }

    protected abstract HttpStatus httpStatus();
}
