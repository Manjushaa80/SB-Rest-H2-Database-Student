package com.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private Integer rollno;
	private String name;
	private String marks;
	public Integer getRollno() {
		return rollno;
	}
	public void setRollno(Integer rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMarks() {
		return marks;
	}
	public void setMarks(String marks) {
		this.marks = marks;
	}
<<<<<<< Updated upstream
	
    public void login()
{
//Successfully login functionality
=======

        public gereatePassword()
{

//30 line code 
>>>>>>> Stashed changes
}
    




