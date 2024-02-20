package com.briz.SequenceGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Main {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="product_gen")
	@SequenceGenerator(name="product_gen",sequenceName="product_seq",allocationSize=10)
	int id;
	String productname;
	String price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
