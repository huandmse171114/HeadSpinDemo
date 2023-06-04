package com.headspin.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.headspin.demo.entity.Todo;
import com.headspin.demo.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	@GetMapping("/api/todos")
	public List<Todo> getTodos() {
		return todoService.getTodos();
	}
	
	@PostMapping("/api/todos")
	public Todo saveTodo(@RequestBody Todo todo) {
		return todoService.saveTodo(todo);
	}
	
	@DeleteMapping("/api/todos/{id}")
	public void deleteTodo(@PathVariable("id") int id) {
		todoService.deleteTodo(id);
	}
	
	@PutMapping("/api/todos/status/{id}/{status}")
	public Todo updateTodoStatus(@PathVariable("id") int id,@PathVariable("status") int status) {
		return todoService.updateTodoStatus(id, status);
	}
	
}
