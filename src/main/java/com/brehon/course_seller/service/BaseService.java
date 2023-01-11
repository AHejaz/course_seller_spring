package com.brehon.course_seller.service;

import jakarta.validation.Valid;

import java.util.List;

public interface BaseService <DTO,ID>{
    List<DTO> findAll();

    DTO findById(ID id);

    DTO saveOrUpdate(@Valid DTO dto);

    void delete(@Valid DTO dto);


    void deleteById(ID id);
}
