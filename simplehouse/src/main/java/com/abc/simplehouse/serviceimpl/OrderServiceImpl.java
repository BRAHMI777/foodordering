package com.abc.simplehouse.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.simplehouse.entity.Order;
import com.abc.simplehouse.model.OrderModel;
import com.abc.simplehouse.repository.OrderRepository;
import com.abc.simplehouse.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public void createOrder(OrderModel orderModel) {
		Order order=new Order();
		order.setId(orderModel.getId());
		order.setOrderDate(orderModel.getOrderDate());
		
		orderRepository.save(order);
		
	}

	@Override
	public List<Order> fetchAllOrders() {
		List<Order> orderList=orderRepository.findAll();
		return orderList;
	}

	@Override
	public Optional<Order> findById(int orderId) {
		Optional<Order> order=orderRepository.findById(orderId);
		return order;
	}

}
