package com.abc.simplehouse.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderItem_tbl")
public class OrderItemModel {
	
	@Id
	private int id;
	private int quantity;
	
	@OneToOne
	private FoodItemsModel items;
	
	@ManyToOne
	private OrderModel order;

	
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

	public FoodItemsModel getItems() {
		return items;
	}

	public void setItems(FoodItemsModel items) {
		this.items = items;
	}

	public OrderModel getOrder() {
		return order;
	}

	public void setOrder(OrderModel order) {
		this.order = order;
	}
	

}
