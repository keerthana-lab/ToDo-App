package com.sample.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.todo.model.ListToDo;
import com.sample.todo.repository.ListToDoRepository;

@Service
public class ListToDoService {

	@Autowired
	private ListToDoRepository listToDoRepository;
	
	public List<ListToDo> getListOfToDo() {
		return listToDoRepository.findAll();
	}
	
	public void addNewToDo(ListToDo newToDo) {
		listToDoRepository.save(newToDo);
	}
	
	public void editToDo(int id, ListToDo editedToDo) {
		ListToDo toDo = listToDoRepository.findById(id).get();
		toDo.setTask(editedToDo.getTask());
		toDo.setComments(editedToDo.getComments());
		toDo.setCompletionDate(editedToDo.getCompletionDate());
		listToDoRepository.save(toDo);
	}
	
	public void deleteToDo(int id) {
		listToDoRepository.deleteById(id);
	}
}
