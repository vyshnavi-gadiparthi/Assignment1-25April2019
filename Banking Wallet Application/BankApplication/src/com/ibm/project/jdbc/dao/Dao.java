package com.ibm.project.jdbc.dao;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.text.SimpleDateFormat;

import java.util.Date;


public class Dao {
	Connection dbCon;
	
	
	public Dao(){
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
						
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapplication", "root", "");
		
			if(dbCon == null) {
				System.out.println("Sorry maintenance going on, please check back later...");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Driver can't be loaded..." + e);
		}
	}
	
	
	public void storeInto(String userName, String passWord, int accountNumber, Integer balance) {
		
		java.sql.PreparedStatement preparedStatement;

		String storedata = "INSERT INTO accountDetails"
				+ "(userName, passWord, accountNumber, balance) VALUES"
				+ "(?,?,?,?)";

		try {
			
			preparedStatement = dbCon.prepareStatement(storedata);

			preparedStatement.setString(1,userName);
			preparedStatement.setString(2, passWord);
			preparedStatement.setInt(3, accountNumber);
			preparedStatement.setInt(4, balance);
			
			
			preparedStatement.executeUpdate();	
			System.out.println("Account is created");

		} 	catch (SQLException e) {
				System.out.println("Issues while inserting " +e);
			}

		
	}

	public void depositAmount(int acnumber, String pword, int amount) {
		
		
	}
	
	public boolean validateAccountNumber(int accountNumber) 
	{
		java.sql.PreparedStatement preparedStatement;
		try {
			preparedStatement = dbCon.prepareStatement("select accountNumber from accountdetails");
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				if(rs.getInt("accountNumber") == accountNumber)
					return false;
				
			}
			
		} catch (SQLException e) {
			System.out.println("Issues while retriving account numbers "+e);
		}
		
		return true;
	}


	public boolean validateLogin(int acnumber, String pword) {
		java.sql.PreparedStatement preparedStatement;
			String passWord="";
			if(!validateAccountNumber(acnumber))
			{
				try {
					preparedStatement = dbCon.prepareStatement("select passWord from accountdetails where accountNumber = ?");
					
					preparedStatement.setInt(1, acnumber);
					ResultSet rs = preparedStatement.executeQuery();
					if(rs.next())
					{
						passWord = rs.getString("passWord");
						if(pword.equals(passWord))
							return true;
					}
						else
							{
								return false;
							}
				} catch (SQLException e) {
					System.out.println("Issues while retriving password "+e);
				}
			}
			else
			{
				System.out.println("Sorry! No such account number exists.");
				return false;
			}
			return false;
		
	}


	public boolean DepositAmount(int acnumber, int amount) {
		java.sql.PreparedStatement preparedStatement;
		int balance = getBalance(acnumber) + amount;
		try {
		preparedStatement = dbCon.prepareStatement("update accountdetails set balance = ? where accountNumber = ?");
		preparedStatement.setInt(1, balance);
		preparedStatement.setInt(2, acnumber);
		if(preparedStatement.executeUpdate() > 0)
		{
			storeMessages(acnumber, "Amount of Rs "+amount+" deposited into account");
			return true;
		}
		else 
			return false;

	} catch (SQLException e) {
		System.out.println("Some issue while depositing amount "+e);
	}
	return false;
	}


	private int getBalance(int accnumber) {
		java.sql.PreparedStatement preparedStatement;
		
			int bal = 0;
			String getBalance = "select * from accountdetails where accountNumber = ?";
			try {
				preparedStatement = dbCon.prepareStatement(getBalance);
				preparedStatement.setInt(1, accnumber);
				ResultSet rs = preparedStatement.executeQuery();
				if(rs.next())
					bal = rs.getInt("balance");
				
			}
			catch(Exception e)
			{
				System.out.println("");
			}
			return bal;
		}


	public boolean withdrawBalance(int acnumber, int amount) {
		java.sql.PreparedStatement preparedStatement;
		int balance = getBalance(acnumber) - amount;
		try {
		preparedStatement = dbCon.prepareStatement("update accountdetails set balance = ? where accountNumber = ?");
		preparedStatement.setInt(1, balance);
		preparedStatement.setInt(2, acnumber);
		if(preparedStatement.executeUpdate() > 0)
		{
			storeMessages(acnumber, "Amount of Rs "+amount+" withdrawn from account");
			
			return true;
		}
		else 
			return false;

	} catch (SQLException e) {
		System.out.println("Some issue while withdrawing amount "+e);
	}
		return false;
	}


	public boolean TransferAmount(int acnumber, int accountTransfer, int amount) {
		if(withdrawBalance(acnumber, amount))
		{
			if(DepositAmount(accountTransfer, amount))
			{
				storeMessages(acnumber, "Amount of Rs "+amount+" transfered to account "+accountTransfer);
				storeMessages(accountTransfer, "Amount of Rs "+amount+" received from account "+acnumber);
				return true;
			}
			else
				return false;
		}else
		return false;
	}


	public int checkBalance(int acnumberCheck) {
		java.sql.PreparedStatement preparedStatement;
		int balance = 0;
		try {
			preparedStatement = dbCon.prepareStatement("select balance from accountdetails where accountNumber = ?");
			preparedStatement.setInt(1, acnumberCheck);
			ResultSet rs = preparedStatement.executeQuery();
			if(rs.next())
			{
				balance = rs.getInt("balance");
			}
			
		} catch (SQLException e) {
			
			System.out.println("Issues while Checking balance "+e);
		}
		
		return balance;
	}


	public char[] printTransaction(int acnumberPrint) {
		
		return null;
	}
	
	
	public void storeMessages(int accountNumber, String message)
	{
		java.sql.PreparedStatement preparedStatement;
		java.util.Date date=new java.util.Date();
		
		java.sql.Date sqlDate=new java.sql.Date(date.getTime());
		java.sql.Timestamp sqlTime=new java.sql.Timestamp(date.getTime());
		
		try {
			preparedStatement = dbCon.prepareStatement("insert into transactiondetails values (?,?,?,?)");
			preparedStatement.setInt(1, accountNumber);
			preparedStatement.setString(2, message);
			preparedStatement.setDate(3, sqlDate);
			preparedStatement.setTimestamp(4, sqlTime);
			
			
			if(preparedStatement.executeUpdate() > 0)
			{
				//System.out.println("Transaction details entered Successfully");
			}
			
		} catch (SQLException e) 
		{
			System.out.println(e);
		}
	}


	public ArrayList<String> viewTransactionDetails(int acnumberPrint) {
		java.sql.PreparedStatement preparedStatement;
		String message = "";
		ArrayList<String> list = new ArrayList<String>();
		try 
		{
			preparedStatement = dbCon.prepareStatement("select * from transactiondetails where accountNumber = ?");
			preparedStatement.setInt(1, acnumberPrint);
			ResultSet rs = preparedStatement.executeQuery();
			
			while(rs.next())
			{
				message = rs.getString("transactionMessage") +" on " + rs.getDate("transactionDate") +" at "+rs.getTimestamp("transactionTime");
				list.add(message);
				message = "";
			}
		} 
		catch (SQLException e) 
		{
			
		}
		return list;

		
	}
	}
	
		
	

