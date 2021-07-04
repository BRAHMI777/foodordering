package com.abc.simplehouse.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="order_tbl")
public class OrderModel {
	@Id
	private int Id;
	private LocalDate OrderDate;
	private double totalCost;
	
	@OneToMany(mappedBy="order",cascade=CascadeType.ALL)
	private List<OrderItemModel> orderItems=new ArrayList<>();
	
	
	 @ManyToOne
	 @JoinColumn(name="customerId")
     private CustomerModel customer;
	
	@OneToOne
	private PaymentModel payment;
	
	@ManyToOne
	private FoodCartModel foodCart;
	
	
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
	public List<OrderItemModel> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(List<OrderItemModel> orderItems) {
		this.orderItems = orderItems;
	}
	public CustomerModel getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerModel customer) {
		this.customer = customer;
	}
	public PaymentModel getPayment() {
		return payment;
	}
	public void setPayment(PaymentModel payment) {
		this.payment = payment;
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
