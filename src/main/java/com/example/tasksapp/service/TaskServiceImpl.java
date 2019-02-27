package com.example.tasksapp.service;

import org.springframework.stereotype.Service;

import com.example.tasksapp.domain.Task;
import com.example.tasksapp.repository.ITaskRepo;

@Service
public class TaskServiceImpl implements ITaskService {

	ITaskRepo taskRepo;

	public TaskServiceImpl(ITaskRepo taskRepo) {
		super();
		this.taskRepo = taskRepo;
	}

	public Iterable<Task> list() {
		return taskRepo.findAll();
	}

	@Override
	public Task save(Task task) {
		return taskRepo.save(task);
	}

}
