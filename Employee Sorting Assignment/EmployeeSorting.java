import java.util.Scanner;
import java.util.ArrayList;

class EmployeeDetails{
	private Integer id, age;
	private String []nameArr;
	private String name, firstname, lastname, address;

	EmployeeDetails(int id, String name, int age, String address){
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;


			nameArr = name.split(" ");
			firstname = nameArr[0];
			lastname = nameArr[1];
	}

	public String toString(){
		return  "Id : " + this.id + ", First Name : " + this.firstname + ", Last Name : " + this.lastname + ", age : " + this.age + ", Address : " + this.address;
	}

	//getters
	public String getfirstname(){
        return this.firstname;
    } 

    public String getlastname(){
        return this.lastname;
    }   
	
    public Integer getid(){
        return this.id;
    }  

    public Integer getage(){
        return this.age;  
    }

    public String getaddress(){
        return this.address;    
	}
}



class EmployeeSorting{
	static ArrayList list;
    
    public static void main(String[] args) {
        int flag = 0;
        String decision;
        list = new ArrayList();
        EmployeeSorting ob = new EmployeeSorting();
        ob.storeDetails();
        //EmployeeDetails l = new EmployeeDetails(1, "Vyshnavi ggg", 22, "Bangalore");
		
        
		    Scanner s = new Scanner(System.in);
		    System.out.println("Add More(y/n) : ");
		    decision = s.nextLine();

		    
		    switch(decision)
		    {
		        case "y":
		            ob.storeDetails();
		            break;

		        case "n":
		            ob.sortBy();
		            break;	
			}
			
	}		

	public void storeDetails(){
			int id, age;
			String name, address;
			Scanner s = new Scanner(System.in);
			System.out.println("Enter employee details: ");
			System.out.println("Enter Name");
			name = s.nextLine();
			//s.nextLine();
			System.out.println("Enter Id: ");
			id = s.nextInt();
			s.nextLine();
			System.out.println("Enter age: ");
			age = s.nextInt();
			s.nextLine();
			System.out.println("Enter Address");
			address = s.nextLine();
			list.add(new EmployeeDetails(id, name, age, address));
			//System.out.println(list);
	}

	public void sortBy(){
		int flag = 0;
		
        System.out.println("Sort By:");
        System.out.println(" 1. Id \n 2. Age \n 3. Address \n 4. FirstName \n 5. LastName \n 6.Exit ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch(choice)
        {
            case 1: 
                    java.util.Collections.sort(list, new SortById());
                    System.out.println("After sorting "  +list);
                    break;
            case 2: 
                    java.util.Collections.sort(list, new SortByAge());
                    System.out.println("After sorting "  +list);
                    break;
            case 3:
                    java.util.Collections.sort(list,new SortByAddress());
                    System.out.println("After sorting "  +list);
                    break;  
            case 4:
                    java.util.Collections.sort(list,new SortByFirstName());
                    System.out.println("After sorting "  +list);
                    break;
            case 5:
            		java.util.Collections.sort(list,new SortByLastName());
                    System.out.println("After sorting "  +list);
                    break;        
            case 6:
                    flag = 1;
    	}
    	
    }	
}

class SortById implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
	return ((EmployeeDetails)firstObject).getid().compareTo(((EmployeeDetails)secondObject).getid()); 
    }
}

class SortByAge implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
	return ((EmployeeDetails)firstObject).getage().compareTo(((EmployeeDetails)secondObject).getage()); 
    }
}

class SortByAddress implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
	return ((EmployeeDetails)firstObject).getaddress().compareTo(((EmployeeDetails)secondObject).getaddress()); 
    }
}

class SortByFirstName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
	return ((EmployeeDetails)firstObject).getfirstname().compareTo(((EmployeeDetails)secondObject).getfirstname()); 
    }
}

class SortByLastName implements java.util.Comparator{
    @Override
    public int compare(Object firstObject, Object secondObject){
	return ((EmployeeDetails)firstObject).getlastname().compareTo(((EmployeeDetails)secondObject).getlastname()); 
    }
}
