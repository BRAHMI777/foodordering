package com.abc.simplehouse.service;


import com.abc.simplehouse.model.FoodItemModel;


/**
 * This Service interface contains all the methods of food item.
 * @author brahmareddy
 * @date 05,july,2021
 */
public interface FoodItemsService {

	
	
	/**
	 * save-This method is used to add food item. 
	 * @param item-The food item object
	 * 
	 */
	public void save(FoodItemModel item);

	/**
	 * getById- This method is used to get item by id.
	 * @param foodItemId
	 * @return FoodItemModel 
	 */
	public FoodItemModel getById(int foodItemId);
	
	/**
	 * getByName- This method is used to get item by name.
	 * @param foodItemName
	 * @return FoodItemModel 
	 */
	//public FoodItemModel getByName(String foodItemName);

	
	/**
	 * getByName- This method is used to delete the item by id.
	 * @param id
	 * @return void 
	 */
	public void deleteItem(int itemId);

	public void updateItem(int itemId);

}
