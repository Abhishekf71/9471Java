package com.demo.JPAInheritance;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.demo.JPAInheritance.entity.ActiveEmployee;
import com.demo.JPAInheritance.entity.RetiredEmployee;

public class EmployeePersistence {  
    
    public static void main(String[] args) {  
          
      
  
    EntityManagerFactory emf=Persistence.createEntityManagerFactory("Employee_details");  
    EntityManager em=emf.createEntityManager();  
      
    em.getTransaction().begin();  
      
      
	ActiveEmployee ae1=new ActiveEmployee(101,"Karun",10000,5);  
	ActiveEmployee ae2=new ActiveEmployee(102,"Rishab",12000,7);  
	  
	RetiredEmployee re1=new RetiredEmployee(103,"Ramesh",5000);  
	RetiredEmployee re2=new RetiredEmployee(104,"Raj",4000);  
  
    em.persist(ae1);  
    em.persist(ae2);  
      
    em.persist(re1);  
    em.persist(re2);  
      
    em.getTransaction().commit();  
      
    em.close();  
    emf.close();  
      
}}  