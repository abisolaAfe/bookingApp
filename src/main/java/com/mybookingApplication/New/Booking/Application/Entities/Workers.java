package com.mybookingApplication.New.Booking.Application.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Workers  {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long workersId ;
	private String firstName ;
	private String lastName;
	
	private String role;
	@Column(unique=true)
	private String loginName;
	
	private String password;
	
//	@OneToOne(mappedBy= "worker")
//	private Cleaning cleaning;

	public Workers() {}
	public Workers( String firstName, String lastName,String loginName,String password, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.loginName =loginName;
		this.password = password;
		this.role = role;
		
	}
	
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
	public String getLastName() {
		return lastName;
	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
	public String getRole() {
		return role;
	}
	public long getWokersId() {
		return workersId;
	}
//	public void setRole(String role) {
//		this.role = role;
//	}
//	public String getUsername() {
//		return userName;
//	}
//	public void setUsername(String username) {
//		this.userName = username;
//	}
	public String getPassword() {
		return password;
	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
	

	

	


}
