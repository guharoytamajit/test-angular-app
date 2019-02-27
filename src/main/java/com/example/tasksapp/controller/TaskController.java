package com.example.tasksapp.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.example.tasksapp.domain.Task;
import com.example.tasksapp.service.ITaskService;

@RestController
@RequestMapping("/api/task")
@CrossOrigin(origins = "http://localhost:4200")

public class TaskController {
	
	ITaskService taskService;

	public TaskController(ITaskService taskService) {
		super();
		this.taskService = taskService;
	}
	
	@GetMapping(value={"","/"})
	public Iterable<Task> list(){
		return taskService.list();
	}

	@PostMapping("/save")
	public Task save(@RequestBody Task task){
		return taskService.save(task);
	}
}
