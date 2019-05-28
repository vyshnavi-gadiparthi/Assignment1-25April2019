package com.ibm.project.jdbc.service;

import java.util.ArrayList;

import com.ibm.project.jdbc.dao.Dao;

public class ServiceClass {
    Dao dao = new Dao();

	public void storeInto(String userName, String passWord, int accountNumber, Integer balance) {
		dao.storeInto(userName, passWord, accountNumber, balance);
		
	}

	public int generateAccountNo() 
	{
		String number="";
		int len = 0, total;
		while(len < 5)
		{
			total = (int)(Math.random() * 9);
			number = number + total;
			len ++;
		}
		
		int accountNumber = Integer.parseUnsignedInt(number);
		
		if(dao.validateAccountNumber(accountNumber))
			return accountNumber;
		else
			generateAccountNo();
		
		return 0;
	}

	public boolean validateLogin(int acnumber, String pword) {
		
			return dao.validateLogin(acnumber, pword);
		
	}

	public boolean DepositAmount(int acnumber, int amount) {
		
		return dao.DepositAmount(acnumber,amount); 
	}

	public boolean withdrawBalance(int acnumber, int amount) {
		return dao.withdrawBalance(acnumber, amount);
		
	}

	public boolean validateAccountNumber(int accountTransfer) {
		return dao.validateAccountNumber(accountTransfer);
	}

	public boolean TransferAmount(int acnumber, int accountTransfer, int amount) {
		return dao.TransferAmount(acnumber, accountTransfer, amount);
	}

	
	

	public int checkBalance(int acnumberCheck) {
		
		return dao.checkBalance(acnumberCheck);
	}

	public ArrayList<String> viewTransactionDetails(int acnumberPrint) {
		return dao.viewTransactionDetails(acnumberPrint);
	}

		
}
