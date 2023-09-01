package com.exersice.mapping.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int productId;
private String productName;
private String productDescription;
private double productPrice;
private long productquantity;
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDescription() {
	return productDescription;
}
public void setProductDescription(String productDescription) {
	this.productDescription = productDescription;
}
public double getProductPrice() {
	return productPrice;
}
public void setProductPrice(double productPrice) {
	this.productPrice = productPrice;
}
public long getProductquantity() {
	return productquantity;
}
public void setProductquantity(long productquantity) {
	this.productquantity = productquantity;
}
public Product(int productId, String productName, String productDescription, double productPrice,
		long productquantity) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.productDescription = productDescription;
	this.productPrice = productPrice;
	this.productquantity = productquantity;
}
public Product() {
	super();
}


}
