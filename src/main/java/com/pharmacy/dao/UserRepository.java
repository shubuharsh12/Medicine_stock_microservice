package com.pharmacy.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pharmacy.Entity.MedicineStock;

public interface UserRepository extends JpaRepository<MedicineStock, Long>{

}
