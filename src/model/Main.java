package model;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("LearningSystem_PU");
		 EntityManager entityManager= emfactory.createEntityManager();
		 entityManager.getTransaction().begin();
		 

	}

}
