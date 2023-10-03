package com.BinaryLoic.CourseManagementApplication.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id;
	String title;
	String descriprion ;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int id, String title, String descriprion) {
		super();
		this.id = id;
		this.title = title;
		this.descriprion = descriprion;
	}
	public long getId() {
		return id;
	}
	public void setId(long id2) {
		this.id = id2;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescriprion() {
		return descriprion;
	}
	public void setDescriprion(String descriprion) {
		this.descriprion = descriprion;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", descriprion=" + descriprion + "]";
	}	
	
}
