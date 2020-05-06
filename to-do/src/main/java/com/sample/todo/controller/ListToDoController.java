package com.sample.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.todo.model.ListToDo;
import com.sample.todo.service.ListToDoService;

@RestController
@RequestMapping("/to-do")
public class ListToDoController {

	@Autowired
	private ListToDoService listToDoService;
	
	@GetMapping("/all")
	public List<ListToDo> getAll() {
		return listToDoService.getListOfToDo();
	}
	
	@PostMapping("/new")
	public void addNew(@RequestBody ListToDo newToDo) {
		listToDoService.addNewToDo(newToDo);
	}
	
	@PutMapping("/edit/{id}")
	public void editExisting(@PathVariable int id, @RequestBody ListToDo toDo) {
		listToDoService.editToDo(id, toDo);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteTask(@PathVariable int id) {
		listToDoService.deleteToDo(id);
	}
}
