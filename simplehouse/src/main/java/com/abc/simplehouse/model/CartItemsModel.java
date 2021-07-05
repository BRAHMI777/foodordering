package com.abc.simplehouse.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="cartItems_tbl")
public class CartItemsModel {
	
	@Id
	private int id;
	private int quantity;
	
	@ManyToOne
	@JoinColumn(name="cartId")
	private FoodCartModel foodCart;
	
	@OneToMany 
	private List<FoodItemModel> foodItems= new ArrayList<>();

	
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

	public List<FoodItemModel> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItemModel> foodItems) {
		this.foodItems = foodItems;
	}


}
