package com.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import com.pharmacy.Entity.MedicineStock;
import com.pharmacy.service.PharmacySupply;


@Controller
@CrossOrigin
public class StockController {
	@Autowired
	private PharmacySupply pharmacySupply;

	@GetMapping(value = "/MedicineStockInformation")
	public ResponseEntity<List<MedicineStock>> getMedicineStocks() {
		List<MedicineStock> list = this.pharmacySupply.getAllMedicineStock();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}
}
