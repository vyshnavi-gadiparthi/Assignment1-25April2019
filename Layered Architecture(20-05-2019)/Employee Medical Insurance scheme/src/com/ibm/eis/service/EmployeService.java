package com.ibm.eis.service;

import java.util.HashMap;

import com.ibm.eis.bean.Employe;

//import java.util.Map;


	public interface EmployeService {
		
		HashMap<Employe,String> getFromMap();
		
		String validating(int salary, String designation);
		
		//Map<Integer,String> displayEmploye();

		//void storeIntoMap1();
		
		
	}

