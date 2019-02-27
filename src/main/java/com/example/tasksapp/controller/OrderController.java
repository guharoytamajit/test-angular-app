package com.example.tasksapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.tasksapp.domain.Order;
import com.example.tasksapp.domain.Task;
import com.example.tasksapp.service.IOrderService;
import com.example.tasksapp.service.ITaskService;

@RestController
@RequestMapping("/api/order")
@CrossOrigin(origins = "http://localhost:4200")

public class OrderController {
	
	IOrderService orderService;

	public OrderController(IOrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping(value={"","/"})
	public Iterable<Order> list(){
		return orderService.list();
	}

	@PostMapping("/save")
	public Order save(@RequestBody Order order){
		return orderService.save(order);
	}
}
