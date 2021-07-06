package com.abc.simplehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.simplehouse.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{

}
