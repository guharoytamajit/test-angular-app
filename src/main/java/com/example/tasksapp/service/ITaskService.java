package com.example.tasksapp.service;

import com.example.tasksapp.domain.Task;

public interface ITaskService {
	Iterable<Task> list();
	Task save(Task task);

}
