package com.pharmacy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pharmacy.Entity.MedicineStock;
import com.pharmacy.dao.UserRepository;


@Service
public class PharmacySupply {
	@Autowired
	private UserRepository userRepository;

	public List<MedicineStock> getAllMedicineStock() {
		List<MedicineStock> list = (List<MedicineStock>) this.userRepository.findAll();
		return list;
	}

}
