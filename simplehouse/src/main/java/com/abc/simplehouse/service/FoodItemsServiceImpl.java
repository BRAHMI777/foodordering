package com.abc.simplehouse.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.simplehouse.entity.FoodItem;
import com.abc.simplehouse.repository.FoodItemsRepository;

@Service
public class FoodItemsServiceImpl implements FoodItemsService {

	@Autowired
	private FoodItemsRepository foodItemsRepository;
	
	@Override
	public void save(FoodItem item) {
		foodItemsRepository.save(item);
	}

	@Override
	public Optional<FoodItem> getById(int foodItemId) {
		Optional<FoodItem> foodItems= foodItemsRepository.findById(foodItemId);
		return foodItems;
	}

}
