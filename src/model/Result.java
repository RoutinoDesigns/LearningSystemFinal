package model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.eclipse.persistence.sessions.Session;

@Entity
public class Result {
	@EmbeddedId
	private ResultCompositeID resultId;

	private int grade;
	/*
	 * Students session = EntityManager.unwrap(Students.class); Serializable id =
	 * session.getIdentifier(Students);
	 */
	public Result(){};
	public Result(ResultCompositeID rid, int grade) {
		this.resultId = resultId;
		this.grade = grade;
	}

	public ResultCompositeID getId() {
		return resultId;
	}

	public int getGrade() {
		return grade;
	}
}
