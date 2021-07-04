package com.abc.simplehouse.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.simplehouse.entity.FoodItem;
import com.abc.simplehouse.service.FoodItemsService;

@RestController
@RequestMapping("/fooditems")
public class FoodItemController {
	
	@Autowired
	private FoodItemsService foodItemsService;
	
	@PostMapping("/additem")
	public void addItem(@RequestBody FoodItem item)
	{
		foodItemsService.save(item);
	}
	
	@GetMapping("/{id}")
	public Optional<FoodItem> fetchById(@PathVariable("id") int foodId)
	{
		Optional<FoodItem> foodItems= foodItemsService.getById(foodId);
		return foodItems;
	}
}
