package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Princiapal {

	public static void main(String[] args) {

//		Pessoa p = new Pessoa(null,"davan", "dalvan.schmitz@gmail.com");
//		Pessoa p1 = new Pessoa(null,"davan2", "dalvan.schmitz@gmail.com");
//		Pessoa p2 = new Pessoa(null,"davan3", "dalvan.schmitz@gmail.com");

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
//		em.persist(p);
//		em.persist(p2);
//		em.persist(p1);

		Pessoa p = em.find(Pessoa.class, 2);
		System.out.println(p.getNome());

		// em.remove(p);

		em.getTransaction().commit();
		em.close();
		emf.close();
	}

}
