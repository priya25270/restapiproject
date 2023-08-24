package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
@Entity
@Table(name="sweets")
public class Transientmodel {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int sweetId;
private String sweetName;
private String sweetshop;
@Transient
private int quantity;
public int getSweetId() {
	return sweetId;
}
public void setSweetId(int sweetId) {
	this.sweetId = sweetId;
}
public String getSweetName() {
	return sweetName;
}
public void setSweetName(String sweetName) {
	this.sweetName = sweetName;
}
public String getSweetshop() {
	return sweetshop;
}
public void setSweetshop(String sweetshop) {
	this.sweetshop = sweetshop;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

}
