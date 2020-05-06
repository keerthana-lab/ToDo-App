package com.sample.todo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ListToDo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String task;
	private String comments;
	private Date completionDate;
	
	public ListToDo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ListToDo(int id, String task, String comments, Date completionDate) {
		super();
		this.id = id;
		this.task = task;
		this.comments = comments;
		this.completionDate = completionDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	@Override
	public String toString() {
		return "ListToDo [id=" + id + ", task=" + task + ", comments=" + comments + ", completionDate=" + completionDate
				+ "]";
	}
	
	
}
