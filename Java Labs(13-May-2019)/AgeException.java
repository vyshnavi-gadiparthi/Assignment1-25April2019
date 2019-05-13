import java.util.Scanner;

class UserException extends Exception{
	UserException(String str){
		super(str);
	}
}

class AgeException{
	public static void main(String[] args) throws UserException{
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter age");
		age = s.nextInt();
		if(age < 15){
			throw new UserException("Age should be greater than 15");
		}
		else{
			System.out.println("It is valid");
		}
	}
}