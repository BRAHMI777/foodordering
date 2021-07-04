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
@Table(name="customer_tbl")
public class CustomerModel {
	
	@Id
	private int customerId;
	private String customerName;
	private String customerEmail;
	private String phoneNumber;
	private String customerPassword;
	
	@OneToOne
	private FoodCartModel cart;
	
	@OneToMany(mappedBy="customer",cascade=CascadeType.ALL)
    private List<OrderModel> order=new ArrayList<>();
	
	public FoodCartModel getCart() {
		return cart;
	}
	public void setCart(FoodCartModel cart) {
		this.cart = cart;
	}
	public List<OrderModel> getOrder() {
		return order;
	}
	public void setOrder(List<OrderModel> order) {
		this.order = order;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	
	

}
