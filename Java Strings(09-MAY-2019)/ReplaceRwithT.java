import java.util.Scanner;

class ReplaceRwithT{
	public static void main(String[] args) {
		String str1, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str1 = s.nextLine();
		result = str1.replace('r' , 't');

		System.out.println("String after replacing of r with t is: " +result);
	}
}
