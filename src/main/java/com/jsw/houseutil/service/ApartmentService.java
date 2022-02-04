package com.jsw.houseutil.service;

import javax.transaction.Transactional;

import com.jsw.houseutil.exception.ErrorCode;
import com.jsw.houseutil.exception.HouseUtilException;
import com.jsw.houseutil.repository.ApartmentRepository;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ApartmentService {
    private final ApartmentRepository apartmentRepository;

    @Transactional
    public Long getPriceLong (Long apartmentId) {
        return apartmentRepository.findById(apartmentId)
            .orElseThrow(() -> new HouseUtilException(ErrorCode.ENTITY_NOT_FOUND))
            .getPrice();
    }
}