package com.exersice.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.exersice.mapping.model.Category;
import com.exersice.mapping.service.CategoryService;

@RestController
public class CategoryController {
@Autowired
private CategoryService inventoryservice;

@PostMapping("add")
public Category savecategory(@RequestBody Category category)
{
	return inventoryservice.savecategory(category);
}
@PostMapping("addnitems")
public List<Category> addndetails(@RequestBody List<Category> category){
	return inventoryservice.savedetails(category);
}
@GetMapping("showdetails")
public List<Category> show(){
	return inventoryservice.showinfo();
	
}
@GetMapping("showdetbyid/{id}")
	public Optional<Category> showbyid(@PathVariable int id){
		return inventoryservice.showbyid(id);
	}
@PutMapping("update")
public Category modify(@RequestBody Category category ) {
	return inventoryservice.changeinfo(category);
}	
@PutMapping("updatebyid/{id}")
public String modifybyid(@PathVariable int id, @RequestBody Category category) {
	return inventoryservice.changebyid(id,category);
}
@DeleteMapping("deletedetail")
	public String del(@RequestBody Category category) {
		inventoryservice.deleteinfo(category);
		return "Deleted successfully";
	}

}
