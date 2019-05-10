import java.util.Scanner;

class StringPalindrome{
	public static void main(String[] args) {
		String str, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to check: ");
		str = s.nextLine();
		
		for(int i = str.length() - 1;i >= 0; i--){
			reverse = reverse + str.charAt(i);
		}
		
		if(str == reverse){
			System.out.println("The string is a palindrome");
		}
		else{
			System.out.println("The string is not a palindrome");
		}
	}
}