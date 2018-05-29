package model;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//TODO connect teachers and students to the course. 

public class Course {
	// generate a new value with each insert operation without additional sql
	// statements
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String courseCode;

	private int credit;
	private String name;
	private Date startTIME;
	private Teacher teacher;

	public Course() {
	}

	public Course(String code, int credit, String name, Teacher teacher,Date startTIME) {
		super();
		this.courseCode = code;
		this.credit = credit;
		this.name = name;
		this.startTIME = startTIME;
		this.teacher = teacher;
	}

	public String getCode() {
		return courseCode;
	}

	public int getCredit() {
		return credit;
	}

	public String getName() {
		return name;
	}

	public Date getStartTIME() {
		return startTIME;
	}

	public Teacher getTeacher() {
		return teacher;
	}
	
	

}
