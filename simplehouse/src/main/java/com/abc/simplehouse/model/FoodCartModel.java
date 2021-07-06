package com.abc.simplehouse.model;

import java.util.ArrayList;
import java.util.List;


public class FoodCartModel {
	

	private int cartId;
	private double totalPrice;
	
	
	private CustomerModel customerModel;
	
	
	private List<CartItemsModel> cartItems=new ArrayList<>();
	
	
	private List<OrderModel> order=new ArrayList<>();

	
	public void setOrder(List<OrderModel> order) {
		this.order = order;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	
	

	public CustomerModel getCustomerModel() {
		return customerModel;
	}

	public void setCustomerModel(CustomerModel customerModel) {
		this.customerModel = customerModel;
	}

	public List<CartItemsModel> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItemsModel> cartItems) {
		this.cartItems = cartItems;
	}

	public List<OrderModel> getOrder() {
		return order;
	}


	
	
	
}
