package com.demo.beans;

import java.util.Date;

public class Student {
	private int id;
	private String name;
	private float marks;
	private Date bdate;
	public Student() {
		super();
	}
	public Student(int id, String name, float marks, Date bdate) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.bdate = bdate;
	}
	public Student(int i, String string, int j, int k, int l) {
		// TODO Auto-generated constructor stub
	}
	public Student(int id) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", bdate=" + bdate + "]";
	}
	

}
