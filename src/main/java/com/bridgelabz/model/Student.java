package com.bridgelabz.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  
@Table(name ="student") 
public class Student {  
      
    @Id  
    @GeneratedValue  
    private Integer id;  
     @Column
    private String firstName;  
     @Column
    private Integer age;  
      
    public Student() {};  
      
    public Student(Integer id, String firstName, Integer age) {  
        this.id = id;  
        this.firstName = firstName;  
        this.age = age;  
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
    
    
}