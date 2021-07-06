package com.abc.simplehouse.controller;


import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger LOGGER =LoggerFactory.getLogger(FoodItemController.class);
	
	@PostMapping("/additem")
	public ResponseEntity<?> addItem(@RequestBody FoodItemModel item)
	{
		LOGGER.info("Path:/fooditems/additem");
		LOGGER.info("Save Item method is started");
		foodItemsService.save(item);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Item saved Successfully",HttpStatus.CREATED);
		LOGGER.info("Save Item method is started");
		return responseEntity;		
	}
	
	@GetMapping("/{id}")
	public FoodItemModel fetchById(@PathVariable("id") int foodId)
	{
		LOGGER.info("Path:/fooditems/{id}");
		LOGGER.info("GetById method is started");
		FoodItemModel foodItems= foodItemsService.getById(foodId);
		LOGGER.info("GetById method is successfully completed");
		return foodItems;
	}
	
	@GetMapping("/allitems")
	public List<FoodItemModel> fetchAll()
	{
		LOGGER.info("Path:/fooditems/allitems");
		LOGGER.info("getAllItems method is started");
		List<FoodItemModel> list=new ArrayList<>();
		list=foodItemsService.getAllItems();
		LOGGER.info("GetAllItems method is successfully completed");
		return list;
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
		LOGGER.info("Path:/fooditems/deleteitem/{id}");
		LOGGER.info("deleteItem method is started");
		foodItemsService.deleteItem(itemId);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Item deleted Successfully",HttpStatus.OK);
		LOGGER.info("deleted the item is successfully");
		return responseEntity;
	}
	
	@PutMapping("/updateitem/{id}")
	public ResponseEntity<?> updateItem(@PathVariable("id") int itemId)
	{
		LOGGER.info("Path:/fooditems/updateitem/{id}");
		LOGGER.info("updateItem method is started");
		foodItemsService.updateItem(itemId);
		ResponseEntity<String> responseEntity = new ResponseEntity<>("Item updated Successfully",HttpStatus.OK);
		LOGGER.info("Item Updated successfully");
		return responseEntity;
	}
	
	
}
