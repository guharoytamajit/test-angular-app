package com.example.tasksapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.tasksapp.domain.Order;
import com.example.tasksapp.domain.Task;

public interface IOrderRepo extends CrudRepository<Order, Long> {

}
