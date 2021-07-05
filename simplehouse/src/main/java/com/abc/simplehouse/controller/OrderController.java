package com.abc.simplehouse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.simplehouse.entity.Order;
import com.abc.simplehouse.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@PostMapping("/addorder")
	public void createOrder(@RequestBody Order order)
	{
		orderService.createOrder(order);
	}
	
	@GetMapping("/allorders")
	public List<Order> findAllOrders()
	{
		List<Order> orderList=orderService.fetchAllOrders();
		return orderList;
	}
	
	@GetMapping("/{id}")
	public Optional<Order> getById(@PathVariable("id") int orderId)
	{
		Optional<Order> order=orderService.findById(orderId);
		return order;
	}

}
