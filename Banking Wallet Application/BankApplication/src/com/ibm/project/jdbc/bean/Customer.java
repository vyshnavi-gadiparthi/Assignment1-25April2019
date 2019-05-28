package com.ibm.project.jdbc.bean;

public class Customer {
	
		private String name, passWord;
		private Integer accountNumber, balance;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getPassword() {
			return passWord;
		}
		public void setPassword(String passWord) {
			this.passWord = passWord;
		}
		
		public Integer getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}
		
		public Integer getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
		
//		@Override
//		public String toString() {
//			return "Customer name : " + name + ", Password : " + passWord + " , AccountNumber : " + accountNumber + ", Balance : " +balance;
//		}
		
		
	}

