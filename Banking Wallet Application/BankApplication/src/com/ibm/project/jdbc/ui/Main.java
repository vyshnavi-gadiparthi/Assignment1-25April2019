package com.ibm.project.jdbc.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ibm.project.jdbc.bean.Customer;
import com.ibm.project.jdbc.service.ServiceClass;

public class Main {
	public static void main(String[] args) {
		ServiceClass service = new ServiceClass();
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Banking Wallet......");
		System.out.println("1. New User, Create Account \n2. Already have account, Login ");
	while(flag == 0) {	
		System.out.println("Enter your choice");
		int yourchoice = scan.nextInt();
		scan.nextLine();
		if(yourchoice == 1) {
	
			Customer customer = new Customer();
			System.out.println("Enter your name");
			String userName = scan.nextLine();
			customer.setName(userName);
			int accountNumber = service.generateAccountNo();
									
			System.out.println("Enter your password");
			String passWord = scan.nextLine();
			customer.setPassword(passWord);
			
			System.out.println("Enter Balance");
			Integer  balance = scan.nextInt();
			scan.nextLine();
			customer.setBalance(balance);
			System.out.println("Account number generated for your account is : " +accountNumber);
			
			service.storeInto(userName, passWord, accountNumber, balance);
	
		}
	if(yourchoice == 2) {	
		System.out.println("Enter account number");
		int acnum = scan.nextInt();
		scan.nextLine();
		if(!service.validateAccountNumber(acnum)) {
	while(flag == 0) {	
			System.out.println(" 1. Deposit Amount \n 2. WithDraw Amount \n 3. Print Transaction \n 4. Fund Transfer \n 5. Check Balance \n 6. Exit \n");
			
		System.out.println("Enter your choice you want ");
		int choice = scan.nextInt();
		scan.nextLine();
	
		switch(choice) {
	
		case 1:
		while(true) {
			System.out.println("Enter account number");
			int acnumber = scan.nextInt();
			scan.nextLine();
			
			System.out.println("Enter your password");
			String pword = scan.nextLine();
			
			if(service.validateLogin(acnumber,pword))
			{
				System.out.println("Please enter amount you want to deposit : ");
				int amount = scan.nextInt();
				scan.nextLine();
				if(service.DepositAmount(acnumber,amount))
					System.out.println("Amount deposited");
				break;
			}
			else
				System.out.println("Wrong credentials, Try again");
				continue;
			}	
			
		break;
		
		case 2:
			while(true)
			{
				System.out.println("Please enter your account number : ");
				int acnumber = scan.nextInt();
				scan.nextLine();
				System.out.println("Please enter your password : ");
				String pword = scan.nextLine();
				if(service.validateLogin(acnumber,pword))
				{
					System.out.println("Please enter amount you want to withdraw : ");
					int amount = scan.nextInt();
					scan.nextLine();
					if(service.withdrawBalance(acnumber,amount))
						System.out.println("Amount withdrawn");
					break;
				}
				else
					System.out.println("Wrong credentials, Try again");
					continue;
			}
			break;
		
		case 3:
			System.out.println("Enter your account number");
			int acnumberPrint = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter password");
			String password = scan.nextLine();
			if(service.validateLogin(acnumberPrint,password)) {
				
				ArrayList<String> list = service.viewTransactionDetails(acnumberPrint);
				System.out.println("Your transaction history :");
				for(String s: list)
				{
					System.out.println(s);
				}
				break;
			}
			else {
				System.out.println("Please check your details");
				continue;
			}
			
			
		case 4:
			System.out.println("Please enter your account number ");
			int acnumber = scan.nextInt();
			scan.nextLine();
			System.out.println("Please enter your password ");
			String pword = scan.nextLine();
			if(service.validateLogin(acnumber, pword)) {
				System.out.println("Please enter Account number to whom you want to transfer :");
				int accountTransfer = scan.nextInt();
				scan.nextLine();
				if(!service.validateAccountNumber(accountTransfer)) {
					System.out.println("Enter amount to tranfer");
					int amount = scan.nextInt();
					scan.nextLine();
					if(service.TransferAmount(acnumber,accountTransfer,amount))
						System.out.println("Amount transfered to account number : " +accountTransfer);
				}else
				{
					System.out.println("Please check your details");
					continue;
				}	
					break;
			}
			
		case 5:
			
				System.out.println("Please enter your account number");
				int acnumberCheck = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter your password");
				String pwordCheck = scan.nextLine();
				password = pwordCheck.trim();
				if(service.validateLogin(acnumberCheck,password))
				{
					System.out.println("Your Account balance is: " +service.checkBalance(acnumberCheck));
					
				}
				else {
					System.out.println("Wrong credentials, Try again");
					continue;
				}
			break;	
				
		case 6:
			flag = 1;
			break;
		}
	}
	}else {
		System.out.println("account number you entered was wrong please create account");
	}
	}
	}
}
}