package com.abc.simplehouse.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="foodCart_tbl")
public class FoodCartModel {
	
	@Id
	private int cartId;
	private double totalPrice;
	
	@OneToOne
	private CustomerModel customer;
	
	@OneToMany(mappedBy="foodCart",cascade=CascadeType.ALL)
	private List<CartItemsModel> cartItems=new ArrayList<>();
	
	@OneToMany(mappedBy="foodCart",cascade=CascadeType.ALL)
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

	public CustomerModel getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
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
