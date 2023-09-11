package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_Details")
public class Student {
@Id
@Column(name="student_Id")
private int studentId;
@Column(name="student_Name")
private String  studentName;
@Column(name="student_City")
private String studentcity;

public Student() 
{
	super();
	
}

public Student(int studentId, String studentName, String studentcity) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.studentcity = studentcity;
}

public int getStudentId() {
	return studentId;
}

public void setStudentId(int studentId) {
	this.studentId = studentId;
}

public String getStudentName() {
	return studentName;
}

public void setStudentName(String studentName) {
	this.studentName = studentName;
}

public String getStudentcity() {
	return studentcity;
}

public void setStudentcity(String studentcity) {
	this.studentcity = studentcity;
}



}
