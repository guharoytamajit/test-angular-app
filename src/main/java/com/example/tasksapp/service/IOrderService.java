package com.example.tasksapp.service;

import java.util.Optional;

import com.example.tasksapp.domain.Order;

public interface IOrderService {
	Iterable<Order> list();
	Order save(Order order);
	Optional<Order> get(Long id);

}
