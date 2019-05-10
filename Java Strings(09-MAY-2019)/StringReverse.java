import java.util.Scanner;

class StringReverse{
	public static void main(String[] args) {
		String str, reverse = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string to reverse");
		str = s.nextLine();
		for(int i = str.length() -1; i >= 0; i--){
			reverse = reverse + str.charAt(i);
		}
		System.out.println("The reverse of a string is :" +reverse);
	}
}