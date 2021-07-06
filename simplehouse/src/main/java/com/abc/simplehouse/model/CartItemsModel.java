package com.abc.simplehouse.model;

import java.util.ArrayList;
import java.util.List;



public class CartItemsModel {
	

	private int id;
	private int quantity;
	
	
	private FoodCartModel foodCartModel;
	

	private List<FoodItemModel> foodItemModel= new ArrayList<>();

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public FoodCartModel getFoodCartModel() {
		return foodCartModel;
	}

	public void setFoodCartModel(FoodCartModel foodCartModel) {
		this.foodCartModel = foodCartModel;
	}

	public List<FoodItemModel> getFoodItemModel() {
		return foodItemModel;
	}

	public void setFoodItemModel(List<FoodItemModel> foodItemModel) {
		this.foodItemModel = foodItemModel;
	}




}
