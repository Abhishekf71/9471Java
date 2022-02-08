package com.demo.JpaFetchStatic.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity  
@Table(name="student")  
@NamedQuery(name = "find name" , query = "Select s from StudentEntity s")  
public class StudentEntity {  

    @Id  
    private int s_id;  
    private String s_name;  
    private int s_age;  
      
    public StudentEntity(int s_id, String s_name, int s_age) {  
        super();  
        this.s_id = s_id;  
        this.s_name = s_name;  
        this.s_age = s_age;  
    }  

    public StudentEntity() {  
        super();  
    }  

    public int getS_id() {  
        return s_id;  
    }  

    public void setS_id(int s_id) {  
        this.s_id = s_id;  
    }  

    public String getS_name() {  
        return s_name;  
    }  

    public void setS_name(String s_name) {  
        this.s_name = s_name;  
    }  

    public int getS_age() {  
        return s_age;  
    }  

    public void setS_age(int s_age) {  
        this.s_age = s_age;  
    }  
      
}  
