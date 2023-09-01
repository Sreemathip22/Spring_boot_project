package com.exersice.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.exersice.mapping.model.Category;

import com.exersice.mapping.repository.CategoryRepository;

@Service
public class CategoryService {
	@Autowired
	private CategoryRepository inventoryrepository;
	//post
	public Category savecategory(Category category)
	{
		return inventoryrepository.save(category);
	}
	public List<Category> savedetails(List<Category> category){
		return (List<Category>)inventoryrepository.saveAll(category);
	}
	//get
	public List<Category> showinfo(){
		return inventoryrepository.findAll();
	}
	public Optional<Category> showbyid(int id){
		return inventoryrepository.findById(id);
	}
	//update
	public Category changeinfo(Category category) {
		return inventoryrepository.saveAndFlush(category);
	}
	
	public String changebyid(int id,Category category) {
		inventoryrepository.saveAndFlush(category);
		if(inventoryrepository.existsById((int) id)) {
			return "UPDATED";
		}
		else {
			return "Enter valid id";
		}
	}
	//delete
	public void deleteinfo(Category category) {
		inventoryrepository.delete(category);
	}

}
