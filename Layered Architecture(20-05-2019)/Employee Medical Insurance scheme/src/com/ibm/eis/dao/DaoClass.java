package com.ibm.eis.dao;

import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employe;


public class DaoClass implements DaoInterface{

	private HashMap<Integer,String> employees = new HashMap<Integer,String>();
	HashMap<Employe,String> employeMap = new HashMap<Employe,String>(); 
	
	{
		Employe employe1 = new Employe();    
	    employe1.setId(1);    
	    employe1.setName("Vyshnavi");    
	    employe1.setSalary(10000);  
	    employeMap.put(employe1,"Associate System"); 
	    
	    Employe employe2 = new Employe();    
	    employe2.setId(2);    
	    employe2.setName("Bhavana");    
	    employe2.setSalary(25000);  
	    employeMap.put(employe2, "Programmer"); 
	    
	    Employe employe3 = new Employe();    
	    employe3.setId(3);    
	    employe3.setName("Shivani");    
	    employe3.setSalary(43000);  
	    employeMap.put(employe3, "Manager"); 
	    
	    Employe employe4 = new Employe();    
	    employe4.setId(4);    
	    employe4.setName("Sreekanth");    
	    employe4.setSalary(2500);  
	    employeMap.put(employe4,"Clerk"); 
	}
	
	public HashMap<Employe,String> getFromMap(Employe employe, String designation) {
	
		// employeMap = new HashMap<Employe,String>();  
		    
		    
		    employeMap.put(employe, designation);
		    //System.out.println(employeMap);
			return employeMap; 
		
	}
	
	
	public int validating(int salary, String designation) {
		return 0;
	}
	public Map<Integer, String> display() {
		// TODO Auto-generated method stub
		return null;
	}
	
//	public void storeIntoMap(Employe employe, String designation ) {
//		employeMap.put(employe, designation);
//	}
	

}
