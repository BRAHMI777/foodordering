package com.abc.simplehouse.model;

public class OrderItemModel {
	

	private int id;
	private int quantity;
	
	
	private FoodItemModel foodItemModel;
	
	
	private OrderModel orderModel;

	
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

	public FoodItemModel getFoodItemModel() {
		return foodItemModel;
	}

	public void setFoodItemModel(FoodItemModel foodItemModel) {
		this.foodItemModel = foodItemModel;
	}

	public OrderModel getOrderModel() {
		return orderModel;
	}

	public void setOrderModel(OrderModel orderModel) {
		this.orderModel = orderModel;
	}

	
	

}
