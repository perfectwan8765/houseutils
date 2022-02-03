package com.jsw.houseutil.repository;

import com.jsw.houseutil.entity.Apartment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
    
}
