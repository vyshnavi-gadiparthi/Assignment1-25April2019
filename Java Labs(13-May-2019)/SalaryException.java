import com.cg.eis.exception.EmployeeException;
import java.util.Scanner;

public class SalaryException{
	public static void main(String[] args) throws EmployeeException {
		int salary;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter salary");
		salary = s.nextInt();
		try{
			new SalaryException();
		}catch(EmployeeException e){
			System.out.println(e);
		}
		if(salary < 15){
			throw new EmployeeException("Salary should be greater than 3000");
		}
		else{
			System.out.println("It is valid");
		}	
	}
}		

// public void check(int salary) throws EmployeeException{
// 		if(salary < 15){
// 			throw new EmployeeException("Salary should be greater than 3000");
// 		}
// 		else{
// 			System.out.println("It is valid");
// 		}
// 	}
// }