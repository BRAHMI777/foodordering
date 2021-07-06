package com.abc.simplehouse.model;

import java.util.ArrayList;
import java.util.List;


public class CustomerModel {
	

	private int customerId;
	private String customerFirstName;
	private String customerLastName;
	private String address;
	private String customerEmail;
	private String phoneNumber;
	private String customerPassword;
	
	
	private FoodCartModel foodCartModel;
	

    private List<OrderModel> orderModel=new ArrayList<>();
	

	
	public FoodCartModel getFoodCartModel() {
		return foodCartModel;
	}
	public void setFoodCartModel(FoodCartModel foodCartModel) {
		this.foodCartModel = foodCartModel;
	}
	public List<OrderModel> getOrderModel() {
		return orderModel;
	}
	public void setOrderModel(List<OrderModel> orderModel) {
		this.orderModel = orderModel;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerFirstName() {
		return customerFirstName;
	}
	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}
	public String getCustomerLastName() {
		return customerLastName;
	}
	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
