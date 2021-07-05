package com.abc.simplehouse.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="FOODITEM_TBL")
public class FoodItem {
	
	@Id
	@NotNull(message="Item Id is missing")
	private int itemId;
	@NotNull(message="Item name is missing")
	private String itemName;
	@NotNull(message="Item type is missing")
	private String itemType;
	@NotNull(message="Item price is missing")
	private double itemPrice;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemType() {
		return itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}	
}