package com.headspin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.headspin.demo.entity.Todo;
import com.headspin.demo.repository.TodoRepository;

@Service
public class TodoServiceImpl implements TodoService {
	
	@Autowired
	private TodoRepository todoRepository;
	
	@Override
	public List<Todo> getTodos() {
		return todoRepository.findAll();
	}

	@Override
	public Todo saveTodo(Todo todo) {
		return todoRepository.save(todo);
	}

	@Override
	public void deleteTodo(int id) {
		todoRepository.deleteById(id);
	}

	@Override
	public Todo updateTodoStatus(int id, int status) {
		Todo todo = todoRepository.findById(id).get();
		
		todo.setStatus(status);
		return todoRepository.save(todo);
	}
}
