package com.exersice.mapping.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int categoryid;
private String categoryname;

//one to many
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="fk_id")
private List<Product>product;

public int getCategoryid() {
	return categoryid;
}

public void setCategoryid(int categoryid) {
	this.categoryid = categoryid;
}

public String getCategoryname() {
	return categoryname;
}

public void setCategoryname(String categoryname) {
	this.categoryname = categoryname;
}

public List<Product> getProduct() {
	return product;
}

public void setProduct(List<Product> product) {
	this.product = product;
}

public Category(int categoryid, String categoryname, List<Product> product) {
	super();
	this.categoryid = categoryid;
	this.categoryname = categoryname;
	this.product = product;
}

public Category() {
	super();
}



}
