package com.mikedosce.ads.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int UserId;
	private int EmployeeId;
	private String Email;
	private String Password;
	private String Username;
	private Date creationDate;
	private boolean multiSession;
	private int state;
	private boolean isActive;
		
	public User() { }	
	
	
	public User(int userId, int employeeId, String email, String password, String username, Date creationDate,
			boolean multiSession, int state, boolean isActive) {
	
		UserId = userId;
		EmployeeId = employeeId;
		Email = email;
		Password = password;
		Username = username;
		this.creationDate = creationDate;
		this.multiSession = multiSession;
		this.state = state;
		this.isActive = isActive;
	}

	public int getUserId() {
		return UserId;
	}
	
	public void setUserId(int userId) {
		UserId = userId;
	}
	
	public int getEmployeeId() {
		return EmployeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String email) {
		Email = email;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String password) {
		Password = password;
	}
	
	public String getUsername() {
		return Username;
	}
	
	public void setUsername(String username) {
		Username = username;
	}
	
	public Date getCreationDate() {
		return creationDate;
	}
	
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	
	public boolean isMultiSession() {
		return multiSession;
	}
	
	public void setMultiSession(boolean multiSession) {
		this.multiSession = multiSession;
	}
	
	public int getState() {
		return state;
	}
	
	public void setState(int state) {
		this.state = state;
	}
	
	public boolean isActive() {
		return isActive;
	}
	
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}	
}
