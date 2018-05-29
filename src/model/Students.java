package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {

	// generate a new value with each insert operation without additional sql
	// statements
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String studentsCode;

	private String password;
	private String name;
	private String email;

	public Students() {
	}

	public Students(String password, String name, String email) {
		// TODO Find a way to safely store passwords
		this.password = password;
		this.name = name;
		this.email = email;

	}

	public void takeCourse(Course c) {

	}

	public void leaveCourse(Course c) {

	}

	public String getCode() {
		return studentsCode;
	}

	public String getPassword() {
		return password;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
