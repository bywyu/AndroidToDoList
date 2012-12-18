package org.dieschnittstelle.mobile.android.todolist.model;

public class Todo {

	private String name;

	public Todo() {

	}

	public Todo(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return "{" + super.toString() + " " + this.name + "}";
	}

}
