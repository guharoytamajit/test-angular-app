package com.example.tasksapp;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.example.tasksapp.domain.Order;
import com.example.tasksapp.domain.Task;
import com.example.tasksapp.service.IOrderService;
import com.example.tasksapp.service.ITaskService;



@SpringBootApplication
@EnableWebMvc
public class TasksAppApplication extends WebMvcAutoConfiguration{

	public static void main(String[] args) {
		SpringApplication.run(TasksAppApplication.class, args);
	}
	 private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
	            "classpath:/META-INF/resources/", "classpath:/resources/static",
	            "classpath:/static/", "classpath:/public/" };

	    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	        registry.addResourceHandler("/**")
	            .addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
	    }
	
	@Bean
	CommandLineRunner runner(ITaskService taskService,IOrderService orderService){
		return args->{
//			taskService.save(new Task(1l, "task1", LocalDate.now(), true));
//			taskService.save(new Task(2l, "task2", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
//			taskService.save(new Task(3l, "task3", LocalDate.now().plus(1,ChronoUnit.DAYS), true));
//			taskService.save(new Task(4l, "task4", LocalDate.now().plus(3,ChronoUnit.DAYS), false));
//			taskService.save(new Task(5l, "task5", LocalDate.now().plus(1,ChronoUnit.DAYS), false));
//			
//			
//			Order order = orderService.save(new Order( 4, "cust1", "customer1", "addresss1", "city1", "pin1", "country1"));
//			System.out.println(orderService.get(order.getId()).get());
		};
	}
}
