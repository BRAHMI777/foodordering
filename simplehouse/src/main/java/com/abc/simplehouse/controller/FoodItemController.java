package com.abc.simplehouse.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.simplehouse.model.FoodItemModel;
import com.abc.simplehouse.service.FoodItemsService;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {
	
	@Autowired
	private FoodItemsService foodItemsService;
	
	@PostMapping("/additem")
	public ResponseEntity<?> addItem(@RequestBody FoodItemModel item)
	{
		foodItemsService.save(item);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Item saved Successfully",HttpStatus.CREATED);
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public FoodItemModel fetchById(@PathVariable("id") int foodId)
	{
		FoodItemModel foodItems= foodItemsService.getById(foodId);
		return foodItems;
	}
//	
//	@GetMapping("/{name}")
//	public FoodItemModel fetchByName(@PathVariable("name") String foodItemName)
//	{
//		FoodItemModel foodItems= foodItemsService.getByName(foodItemName);
//		return foodItems;
//	}
//	
	
	@DeleteMapping("/deleteitem/{id}")
	public ResponseEntity<?> deleteItem(@PathVariable("id") int itemId)
	{
		foodItemsService.deleteItem(itemId);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Item deleted Successfully",HttpStatus.OK);
		return responseEntity;
	}
	
	@PutMapping("/updateitem/{id}")
	public ResponseEntity<?> updateItem(@PathVariable("id") int itemId)
	{
		foodItemsService.updateItem(itemId);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Item updated Successfully",HttpStatus.OK);
		return responseEntity;
	}
	
	
}
