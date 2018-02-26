package controller;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;


import model.Player;



import model.Team;

public class PlayerHelper {
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueAskeland");
	

	
	public void insertPlayer(Player toAdd) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}


	public List<Player> showAllPlayers() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		// creates the query but does not execute it.
		TypedQuery<Player> allResults = em.createQuery("Select list_item from Player list_item", Player.class);
		// Selects the info
		List<Player> allPlayers = allResults.getResultList();
		// need to close the entity manager
		em.close();

		return allPlayers;
	}


}


