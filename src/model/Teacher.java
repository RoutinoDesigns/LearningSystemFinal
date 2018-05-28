package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Teacher {

	  // generate a new value with each insert operation without additional sql statements
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)					
	  private String code;
	  
	  private String password;
	  private String name;
	  private String email;
	  // theory or practice teacher
	  private Role role;													

	public Teacher() {
	}

	   public Teacher(String password, String name, String email, Role role) {
		 //TODO Find a way to safely store passwords
	        this.password = password;						
	        this.name = name;
	        this.email = email;
	        this.role = role;
	    }
	 //TODO implement course class to be able to create modify and delete courses
	public void createCourse(String subjectCode, String subjectName,Teacher teacher, int subjectCredit) {
		
	}
	public void ModifyCourse(Course c) {
		
	}
	public void deleteCourse(Course c) {
		
	}
	//TODO implement Student class to be able to see which students joined a course and to give grades 
	public Students studentsJoinedInfo() {
		return null;
		
	
	}
	public void giveGrades(Students s) {
		
	}

	public String getCode() {
		return code;
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

	public Role getRole() {
		return role;
	}
	

}
