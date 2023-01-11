package com.brehon.course_seller.service;

import jakarta.validation.Valid;

import java.util.List;

public interface BaseService <D,N>{
    List<D> findAll();

    D findById(N id);

    D saveOrUpdate(@Valid D dto);

    void delete(@Valid D dto);


    void deleteById(N id);
}
