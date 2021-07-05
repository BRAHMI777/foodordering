package com.abc.simplehouse.service;

import java.util.List;
import java.util.Optional;

import com.abc.simplehouse.entity.Order;

public interface OrderService {

	public void createOrder(Order order);

	public List<Order> fetchAllOrders();

	public Optional<Order> findById(int orderId);

}
