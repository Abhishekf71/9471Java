package com.demo.JpaFetchStatic;

import javax.persistence.*;

import com.demo.JpaFetchStatic.entity.StudentEntity;

import java.util.*;  
public class FetchColumn {  
      
     public static void main( String args[]) {  
             
          EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Student_details" );  
          EntityManager em = emf.createEntityManager();  
          em.getTransaction().begin( );  
                    
          Query query = em.createNamedQuery("find name");  
          @SuppressWarnings("unchecked")  
          List<StudentEntity> list =query.getResultList();  
            
          for(StudentEntity s:list) {  
                
             System.out.println("Student Name:"+s.getS_name()+" Id:"+ s.getS_id()+" Age:"+s.getS_age());
             
          
               
          }  
            
        
          em.close();  
          emf.close();    
     }  
      
  
}  