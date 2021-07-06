package com.pharmacy.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.pharmacy.dao.UserRepository;

@Entity
public class ChemicalComposition {
 
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    
   
	public String chemicalComposition;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JsonBackReference
	private MedicineStock medicineStock;
	
	
	public String getChemicalComposition() {
		return chemicalComposition;
	}
	public void setChemicalComposition(String chemicalComposition) {
		this.chemicalComposition = chemicalComposition;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public MedicineStock getMedicineStock() {
		return medicineStock;
	}
	public void setMedicineStock(MedicineStock medicineStock) {
		this.medicineStock = medicineStock;
	}
	 
	
	
    
}
