import java.util.Scanner;

class UserException extends Exception{
	UserException(String str){
	super(str);
	}
}
class EmptyStringException{
	public static void main(String[] args) throws UserException{
		String str1, str2;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Name");
		str1 = s.nextLine();
	
		System.out.println("Enter Second Name");
		str2 = s.nextLine();
	
		
			if(str1.equals("") || str2.equals("")){
				//System.out.println("Exception caught " +es);
				throw new UserException("Please enter First and Second name It should not be empty");
			}
		}
	}
