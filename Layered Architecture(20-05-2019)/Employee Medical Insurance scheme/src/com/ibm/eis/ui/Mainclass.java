package com.ibm.eis.ui;

import com.ibm.eis.bean.Employe;
//import com.ibm.eis.bean.Employe;
//import com.ibm.eis.dao.DaoClass;
import com.ibm.eis.service.ServiceClass;

import java.util.*;
//import java.util.HashMap;
//import java.util.Map.Entry;
//import java.util.Set;

public class Mainclass {
	
	//private static final Employe Employe = null;

	public static void main(String[] args) {
		ServiceClass service=  new ServiceClass();
		//DaoClass d = new DaoClass();
		int flag = 0;
		
   
        System.out.println("Enter your choice to perform operations:");
        System.out.println(" 1. Get employee details from user \n 2. Find the insurance scheme for an employee based on salary and designation \n 3. Display all the details of an employee \n 4.  Exit");
        Scanner sc = new Scanner(System.in);
        
        while(flag == 0){    
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: 
            		Employe employe = new Employe();
            		System.out.println("Enter id");
            		int id = sc.nextInt();
            		sc.nextLine();
            		employe.setId(id);
            		System.out.println("Enter Employee name");
            		String name = sc.nextLine();
            		employe.setName(name);
            		System.out.println("Enter designation");
            		String designation = sc.nextLine();
            		employe.setDesignation(designation);
            		System.out.println("Enter Salary");
            		int salary = sc.nextInt();
            		employe.setSalary(salary);
            		service.getFromMap(employe, designation);
            	    break;
            case 2: 
            	
            		System.out.println("Enter salary");
            		int sal = sc.nextInt();
            		sc.nextLine();
            		System.out.println("Enter designation");
            		String design = sc.nextLine();
                    System.out.println(service.validating(sal, design));
                    break;
            case 3:
            		System.out.print(service.getFromMap());
                    break; 
            case 4:
            		flag = 1;
        }   		
	}
}
}