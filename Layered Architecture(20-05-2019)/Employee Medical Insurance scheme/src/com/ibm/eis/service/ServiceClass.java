package com.ibm.eis.service;

import java.util.HashMap;

import com.ibm.eis.bean.Employe;

import java.util.Map;

import com.ibm.eis.dao.DaoClass;

public class ServiceClass implements EmployeService{

		DaoClass dao = new DaoClass();
		private String designation;
		private Employe employe;
		
		
//		public HashMap<Employe,String> getFromMap(){
//			 return dao.getFromMap(Employe employe, String designation);
//		}
		
		public HashMap getFromMap(Employe employe, String designation ) {
			return dao.getFromMap(employe, designation);
		}


		public String validating(int salary, String designation) {
			if(salary < 5000 && designation.equals("Clerk")) {
				//System.out.println(" Insurance Scheme : No Scheme");
				return "No Scheme";
			} 
			
			else if(salary >= 40000 && designation.equals("Manager")){
				//System.out.println("Insurance Scheme : Scheme A");
				return "Scheme A";
			}
			
			else if(salary >=20000 && salary <40000 && designation.equals("Programmer")){
				//System.out.println("Insurance Scheme : Scheme B");
				return "Scheme B";

			}
			
			else if(salary >5000 && salary < 20000 && designation.equals("Associate System")){
				//System.out.println("Insurance Scheme : Scheme C");
				return "Scheme C";

			}
			return "Something is wrong ";
			
		}


		public HashMap<Employe, String> getFromMap(String designation, Employe employe) {
			
			return dao.getFromMap(employe, designation);
		}


		@Override
		public HashMap<Employe, String> getFromMap() {
			
			// TODO Auto-generated method stub
			return dao.getFromMap(employe, designation);
		}


//		//@Override
//		public HashMap<Employe, String> getFromMap1(Employe employe, String designation) {
//			return dao.getFromMap(employe, designation);;
//		}


		
//		public HashMap<Employe, String> getFromMap() {
//			// TODO Auto-generated method stub
//			return null;
//		}
		
		
	}


