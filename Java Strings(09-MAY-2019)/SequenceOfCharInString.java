import java.util.Scanner;

class SequenceOfCharInString{
	public static void main(String[] args) {
		String str1, str2;
		boolean result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str1 = s.nextLine();
		System.out.println("Enter a sequence char");
		str2 = s.nextLine();
		result = str1.contains(str2);
		if(result == true){
			System.out.println("String Contains specified sequence of char");
		}
		else{
			System.out.println("String doesnot contains specified sequence of char");
		}
	}
}		
	