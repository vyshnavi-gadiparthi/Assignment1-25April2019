package com.ibm.training.users;

public class User {
	String userName, userAddress;
	Integer userId;
	
	public User(String userName, String userAddress, Integer userId) {
		
		this.userName = userName;
		this.userAddress = userAddress;
		this.userId = userId;
		
	}
		
	public User() {
		
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
