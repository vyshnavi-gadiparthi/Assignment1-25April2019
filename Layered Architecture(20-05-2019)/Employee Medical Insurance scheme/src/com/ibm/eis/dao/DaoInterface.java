package com.ibm.eis.dao;


import java.util.HashMap;
import java.util.Map;

import com.ibm.eis.bean.Employe;

//import com.ibm.eis.bean.Employe;


public interface DaoInterface {
	
	 
	 public int validating(int salary, String designation);
	
	// Map<Integer,String> display();

	 HashMap<Employe,String> getFromMap(Employe employe, String designation);
}