package com.sample.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sample.todo.model.ListToDo;

@Repository
public interface ListToDoRepository extends JpaRepository<ListToDo, Integer>{

}
