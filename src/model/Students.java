package model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Students {

	// Identity is used generate a new value with each insert operation without additional sql statements
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String studentsCode;

	private String password;
	private String name;
	private String email;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Course> courses = new HashSet<>();
	public Students() {
	}

	public Students(String password, String name, String email) {
		// TODO Find a way to safely store passwords
		this.password = password;
		this.name = name;
		this.email = email;

	}

	public void takeCourse(Course c) {
		Manager.entityManager.getTransaction().begin();
		courses.add(c);
		Manager.entityManager.getTransaction().commit();
	}

	public void leaveCourse(Course c) {
		Manager.entityManager.getTransaction().begin();
		courses.remove(c);
		Manager.entityManager.getTransaction().commit();
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

	public Set<Course> getCourses() {
		return courses;
	}
	

}
