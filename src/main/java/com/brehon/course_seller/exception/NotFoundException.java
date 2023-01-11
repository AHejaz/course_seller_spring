package com.brehon.course_seller.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends BaseException{

    public NotFoundException(String message) {
        super(message);
    }

    @Override
    protected HttpStatus httpStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
