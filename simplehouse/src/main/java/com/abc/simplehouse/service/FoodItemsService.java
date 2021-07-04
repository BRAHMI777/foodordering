package com.abc.simplehouse.service;

import java.util.Optional;

import com.abc.simplehouse.entity.FoodItem;

public interface FoodItemsService {

	public void save(FoodItem item);

	public Optional<FoodItem> getById(int foodItemId);

}
