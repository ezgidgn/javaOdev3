package Entities;



import java.util.Date;

import Abstract.Entity;

public class Customer implements Entity{
	
	public int id;
	public String name;
	public String lastName;
	public Date dateOfBirth;
	public String nationalId;
	
	
	
     public Customer() {
		
	}
	
	
	
     public Customer(int id, String name, String lastName, Date dateOfBirth, String nationalId) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalId = nationalId;
	}


	
	
	


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getNationalId() {
		return nationalId;
	}


	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}
	

	
	
	

}
