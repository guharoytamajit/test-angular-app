package com.example.tasksapp.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.tasksapp.domain.Order;
import com.example.tasksapp.repository.IOrderRepo;


@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

	IOrderRepo orderRepo;

	public OrderServiceImpl(IOrderRepo orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}

	public Iterable<Order> list() {
		return orderRepo.findAll();
	}

	@Override
	public Order save(Order order) {
		return orderRepo.save(order);
	}

	@Override
	public Optional<Order> get(Long id) {
		return orderRepo.findById(id);
	}

}
