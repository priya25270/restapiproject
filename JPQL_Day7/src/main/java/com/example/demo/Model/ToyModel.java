package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Toys")
public class ToyModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private int toyId;
private String toyName;
private String brand;
private String size;
public int getToyId() {
	return toyId;
}
public void setToyId(int toyId) {
	this.toyId = toyId;
}
public String getToyName() {
	return toyName;
}
public void setToyName(String toyName) {
	this.toyName = toyName;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getSize() {
	return size;
}
public void setSize(String size) {
	this.size = size;
}

}
