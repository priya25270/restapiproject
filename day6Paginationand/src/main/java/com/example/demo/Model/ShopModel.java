package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class ShopModel {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
private int ShopId;
private String shopName;
private String city;
public int getShopId() {
	return ShopId;
}
public void setShopId(int shopId) {
	ShopId = shopId;
}
public String getShopName() {
	return shopName;
}
public void setShopName(String shopName) {
	this.shopName = shopName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
