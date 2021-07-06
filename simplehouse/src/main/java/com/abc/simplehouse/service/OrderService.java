package com.abc.simplehouse.service;

import java.util.List;
import java.util.Optional;

import com.abc.simplehouse.entity.Order;
import com.abc.simplehouse.model.OrderModel;

public interface OrderService {

	public void createOrder(OrderModel orderModel);

	public List<Order> fetchAllOrders();

	public Optional<Order> findById(int orderId);

}
