package com.demo.JPACrudExample;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.ParameterExpression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import com.demo.JPACrudExample.entity.Player;

public class JpaCrud 
{
    public static void main( String[] args ) throws Exception
    {
        //JpaCrud.createRecord();
        //JpaCrud.retrieveRecord();
        //JpaCrud.updateRecord();
        //JpaCrud.deleteRecord();
    	//JpaCrud.queryRecord();
    	//JpaCrud.findByNamedQuery();
    	//JpaCrud.findByFuzzyNamedQuery();
    	//JpaCrud.criteriaQuery();
    	//JpaCrud.criteriaCountQuery();
    	//JpaCrud.criteriaVerifiedUsersQuery();
    	//JpaCrud.criteriaLoginNameAndPassword();
    	//JpaCrud.criteriaFindByCommonPassword();
    	//JpaCrud.criteriaFuzzyEmail();
    	//JpaCrud.criteriaBetweenDates();
    }

	
	  private static void criteriaBetweenDates() throws ParseException {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
			
			Root<Player> root = cQuery.from(Player.class);     
			
			ParameterExpression<String> email = builder.parameter(String.class);
			//Predicate predicate = builder.like(root.get("emailAddress"), "%scja%");
			java.text.SimpleDateFormat textFormat = 
				    new java.text.SimpleDateFormat("yyyy-MM-dd");
			Date startDate = new Date();
			startDate = textFormat.parse("1998-1-1");
			
			Date endDate = new Date();
			startDate = textFormat.parse("2018-6-1");
			
			Predicate predicate =  builder.between(root.get("lastAccessTime"), startDate, endDate);
			    //predicate.add(date);

			cQuery.select(root).where(predicate);
			
			TypedQuery<Player> query = em.createQuery(cQuery);
			//query.setParameter(email, true);
			List<Player> players = query.getResultList();
			players.forEach(player -> System.out.println(player.getLastAccessTime())); 
			
			List<Player> users = new java.util.ArrayList();
			//users.add(player);
			
			em.getTransaction().commit();
		
	}


	private static void criteriaFuzzyEmail() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
			
			Root<Player> root = cQuery.from(Player.class);     
			Predicate predicate = builder.like(root.get("emailAddress"), "%is%");
			
			cQuery.select(root).where(predicate);
			
			TypedQuery<Player> query = em.createQuery(cQuery);
			//query.setParameter(email, true);
			List<Player> players = query.getResultList();
			players.forEach(player -> System.out.println(player.getEmailAddress()));
			
			em.getTransaction().commit();
		
	}


	private static void criteriaFindByCommonPassword() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
			
			Root<Player> root = cQuery.from(Player.class);     
			
			ParameterExpression<String> password = builder.parameter(String.class);
			Expression<Boolean> passwordExpression = builder.equal(root.get("password"), password);
			cQuery.select(root).where(passwordExpression);
			
			TypedQuery<Player> query = em.createQuery(cQuery);
			query.setParameter(password, "abc@12345");
			List<Player> players = query.getResultList();
			players.forEach(player -> System.out.println(player.getLoginName()));
			
			em.getTransaction().commit();
		
	}


	private static void criteriaLoginNameAndPassword() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
			
			Root<Player> root = cQuery.from(Player.class);     
			
			ParameterExpression<String> password = builder.parameter(String.class);
			Expression<Boolean> passwordExpression = builder.equal(root.get("password"), password);
			
			ParameterExpression<String> loginName = builder.parameter(String.class);
			Expression<Boolean> loginExpression = builder.equal(root.get("loginName"), loginName);
			
			
			Predicate loginAndPassword = builder.and(loginExpression, passwordExpression);
			
			cQuery.select(root).where(loginAndPassword);
			
			TypedQuery<Player> query = em.createQuery(cQuery);
			query.setParameter(loginName, "Abhishek");
			query.setParameter(password, "abc@12345");
			Player player = query.getSingleResult();
			System.out.println(player);
			
			em.getTransaction().commit();
		
	}


	private static void criteriaVerifiedUsersQuery() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
			
			Root<Player> root = cQuery.from(Player.class);     
			
			ParameterExpression<Boolean> flag = builder.parameter(Boolean.class);
			Predicate expression = builder.equal(root.get("verified"), flag);
			
			cQuery.select(root).where(expression);
			
			TypedQuery<Player> query = em.createQuery(cQuery);
			query.setParameter(flag, true);
			List<Player> players = query.getResultList();
			players.forEach(player -> System.out.println(player.getVerified()));
			
			em.getTransaction().commit();
		
	}


	private static void criteriaCountQuery() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Long> cQuery = builder.createQuery(Long.class);
			cQuery.select(builder.count(cQuery.from(Player.class)));
			
			TypedQuery<Long> query = em.createQuery(cQuery);
			System.out.println(query.getSingleResult());
			em.getTransaction().commit();
		
	}


	private static void criteriaQuery() {
		  EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			CriteriaBuilder builder = em.getCriteriaBuilder();
			CriteriaQuery<Player> cQuery = builder.createQuery(Player.class);
			
			
			Root<Player> from = cQuery.from(Player.class);  
			cQuery.orderBy(builder.asc(from.get("id")));
			
			TypedQuery<Player> query = em.createQuery(cQuery);
			List<Player> players = query.getResultList();
			players.forEach(player -> System.out.println(player));
			
			em.getTransaction().commit();
		
	}


	private static void findByFuzzyNamedQuery() {
		  	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin();

			Query query=  entityManager.createNamedQuery("Player.findByFuzzyEmail");
			query.setParameter("email", "a%");
			@SuppressWarnings("unchecked")
			List<Player> players = query.getResultList();

			for (Player playa : players) {
				System.out.println("FIND BY FUZZY EMAIL");
				System.out.println(playa);
			}

			for (int i = 0; i < players.size(); i++) {
				Player player = players.get(i);
				System.out.println(player.getLoginName());
			}
			entityManager.getTransaction().commit();
		
	}


	private static void findByNamedQuery() {
		  	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin();

			Query query=  entityManager.createNamedQuery("Player.findByEmail");
			query.setParameter("email", "abhishek.fopse@gmail.com");
			@SuppressWarnings("unchecked")
			List<Player> players = query.getResultList();

			for (Player playa : players) {
				System.out.println("FIND BY EMAIL: ");
				System.out.println(playa);
			}

			for (int i = 0; i < players.size(); i++) {
				Player player = players.get(i);
				System.out.println(player.getLoginName());
			}
			
			entityManager.getTransaction().commit();
		}
		
	


	private static void queryRecord() {
		  	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin();

			Query query = entityManager.createQuery("select distinct p from Player as p", Player.class);
			

			@SuppressWarnings("unchecked")
			List<Player> players = query.getResultList();

			for (Player playa : players) {
				System.out.println("The password is :" + playa.getPassword());
			}

			for (int i = 0; i < players.size(); i++) {
				Player player = players.get(i);
				System.out.println(player.getLoginName());
			}
			entityManager.flush();
			//entityManager.detach(arg0);h();
			entityManager.getTransaction().commit();
		
	}


	private static void deleteRecord() {
		
		  	EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin();

			Long key = Long.valueOf(1);
			Player p = entityManager.find(Player.class, key);
			entityManager.remove(p); // record is deleted
			System.out.println("RECORD IS DELETED");
			entityManager.getTransaction().commit();
	}


	  private static void updateRecord() {
		    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA_CRUD");
			EntityManager entityManager = emf.createEntityManager();
			entityManager.getTransaction().begin(); 
			
			
			Long key = Long.valueOf(1);
			Player p = entityManager.find(Player.class, Long.valueOf(1));
			System.out.println("OLD RECORD: "+p.getLoginName()+" "+p.getPassword());
			p.setPassword("kowabunga");
			System.out.println("UPDATED RECORD: "+p.getLoginName()+" "+p.getPassword());

			entityManager.getTransaction().commit();
		
	}


	private static void retrieveRecord() { EntityManagerFactory emf =
		  Persistence.createEntityManagerFactory("JPA_CRUD"); 
		  EntityManager entityManager = emf.createEntityManager();
		  entityManager.getTransaction().begin();
		  
		  Long key = Long.valueOf(5); Player p = entityManager.find(Player.class, key);
		  System.out.println("RETRIEVED RECORD:: ");
		  System.out.println(p.getPassword()+" "+p.getLoginName());
		  
		  entityManager.getTransaction().commit();
	  
	  
	 }
	

	private static void createRecord() {
		try {
			  EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPA_CRUD");  
			  EntityManager em=emf.createEntityManager();  
			      
			  em.getTransaction().begin();   
			  
			  Player p = new Player();
			  p.setLoginName("Abhishek");
			  p.setPassword("abc@12345");
			  p.setEmailAddress("abhishek.fopse@gmail.com");
			  p.setRegistrationDate(new java.util.GregorianCalendar(2022,02,11));
			  p.setLastAccessTime(new java.util.Date());
			  p.setVerified(true);
			  
			  Player p1 = new Player();
			  p1.setLoginName("Aditya");
			  p1.setPassword("xyz@4321");
			  p1.setEmailAddress("xyz@gmail.com");
			  p1.setRegistrationDate(new java.util.GregorianCalendar(2022,02,11));
			  p1.setLastAccessTime(new java.util.Date());
			  p1.setVerified(true);
			  
			   Player p2 = new Player();
			  p2.setLoginName("Mayuresh");
			  p2.setPassword("may@98886");
			  p2.setEmailAddress("mayuresh@gmail.com");
			  p2.setRegistrationDate(new java.util.GregorianCalendar(2022,02,11));
			  p2.setLastAccessTime(new java.util.Date());
			  p2.setVerified(true);
			  
			  Player p3 = new Player();
			  p3.setLoginName("yash");
			  p3.setPassword("Q3234@55");
			  p3.setEmailAddress("yash@gmail.com");
			  p3.setRegistrationDate(new java.util.GregorianCalendar(2022,02,11));
			  p3.setLastAccessTime(new java.util.Date());
			  p3.setVerified(true); 
			  
			  em.persist(p);
			  em.persist(p1);
			  em.persist(p2);
			  em.persist(p3);
			  
			  em.getTransaction().commit();
			  
				
				  Query query = em.createQuery("Select p from Player p");
				  
				  @SuppressWarnings("unchecked") List<Player> list = query.getResultList();
				  System.out.println("player details : "); 
				  for(Player s:list) 
				  {
				  System.out.println(s); 
				  }
				 
			  
			  
			  em.close();
			  emf.close();
			
		} catch (Exception e) {
			
		}
		 
		  
		
	}
}
