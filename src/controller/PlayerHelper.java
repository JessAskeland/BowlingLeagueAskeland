package controller;

<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
=======

>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
<<<<<<< HEAD
<<<<<<< HEAD
=======
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87


import model.Player;


<<<<<<< HEAD
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87

import model.Player;
import model.Team;

public class PlayerHelper {
<<<<<<< HEAD
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueHanneman");

=======
	EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("BowlingLeagueAskeland");
	

	
<<<<<<< HEAD
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
	public void insertPlayer(Player toAdd) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(toAdd);
		em.getTransaction().commit();
		em.close();
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public void deleteAllPlayersOnTeam(Team team) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Player> deletePlayers = em.createQuery("delete from Player p where p.team = :selectedTeam", Player.class);
		deletePlayers.setParameter("selectedTeam", team);
		int deleteCount = deletePlayers.executeUpdate();
		if(deleteCount>0) {
			System.out.println("Players Removed");
		}
		em.getTransaction().commit();
		em.close();
		
	}
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87

	public List<Player> showAllPlayers() {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
<<<<<<< HEAD
<<<<<<< HEAD
		TypedQuery<Player> allResults = em.createQuery("select p from Player p", Player.class);
		List<Player> allPlayers = allResults.getResultList();
		em.close();
		return allPlayers;
	}

	public Player searchForPlayerById(int playerId) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		Player foundPlayer = em.find(Player.class, playerId);
		em.close();
		return foundPlayer;
	}

	public void deletePlayer(Player player) {
		// TODO Auto-generated method stub
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		TypedQuery<Player> deletePlayer = em.createQuery("select p from Player p where p.playerId = :selectedId", Player.class);
		deletePlayer.setParameter("selectedId", player.getPlayerId());
		deletePlayer.setMaxResults(1);
		Player toDelete = deletePlayer.getSingleResult();
		em.remove(toDelete);
		em.getTransaction().commit();
		em.close();
	}

}
=======
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
		// creates the query but does not execute it.
		TypedQuery<Player> allResults = em.createQuery("Select list_item from Player list_item", Player.class);
		// Selects the info
		List<Player> allPlayers = allResults.getResultList();
		// need to close the entity manager
		em.close();

		return allPlayers;
	}


}


<<<<<<< HEAD
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
=======
>>>>>>> e608e2b0b2f151cb950cb6baa5101e6f9139ea87
