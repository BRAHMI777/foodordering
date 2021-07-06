package com.abc.simplehouse.model;

import java.time.LocalDate;
import java.util.List;


public class OrderModel {

	private int Id;
	private LocalDate OrderDate;
	private double totalCost;
	
	private CustomerModel customerModel;
	
	private List<OrderItemModel> orderItemModel;
	
	private PaymentModel paymentModel;
	
	private FoodCartModel foodCartModel;
	

	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	public CustomerModel getCustomerModel() {
		return customerModel;
	}
	public void setCustomerModel(CustomerModel customerModel) {
		this.customerModel = customerModel;
	}
	public List<OrderItemModel> getOrderItemModel() {
		return orderItemModel;
	}
	public void setOrderItemModel(List<OrderItemModel> orderItemModel) {
		this.orderItemModel = orderItemModel;
	}
	public PaymentModel getPaymentModel() {
		return paymentModel;
	}
	public void setPaymentModel(PaymentModel paymentModel) {
		this.paymentModel = paymentModel;
	}
	public FoodCartModel getFoodCartModel() {
		return foodCartModel;
	}
	public void setFoodCartModel(FoodCartModel foodCartModel) {
		this.foodCartModel = foodCartModel;
	}
	public int getOrderId() {
		return Id;
	}
	public void setOrderId(int Id) {
		 this.Id = Id;
	}
	public LocalDate getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}
	
	
	

}
