package model;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
//instance of the entity manager  is made static in order to be accessible globally.
public class Manager {
	public static final EntityManager entityManager = Persistence
			.createEntityManagerFactory("LearningSystem_PU")
			.createEntityManager();
}
