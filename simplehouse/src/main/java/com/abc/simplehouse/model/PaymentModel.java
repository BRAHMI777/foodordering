package com.abc.simplehouse.model;

import java.time.LocalDate;


public class PaymentModel {
	
	
	private int paymentId;
	private LocalDate paymentDate;
	private double paymentAmount;
	private String paymentStatus;
	private OrderModel Id;
	
	
	
	public OrderModel getId() {
		return Id;
	}
	public void setId(OrderModel id) {
		Id = id;
	}
	public int getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDate getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}
	public double getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(double paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	
	

}
