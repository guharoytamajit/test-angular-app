package com.example.tasksapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.tasksapp.domain.Task;

public interface ITaskRepo extends CrudRepository<Task, Long> {

}
