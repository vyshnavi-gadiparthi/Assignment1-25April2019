import java.util.Scanner;

class StringEndsWith{
	public static void main(String[] args) {
		String str1, str2;
		boolean result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string: ");
		str1 = s.nextLine();
		System.out.println("Enter other string");
		str2 = s.nextLine();
		boolean endstr = str1.endsWith(str2);
		if(endstr == true){
			System.out.println("Given string ends with the content of another string");
		}
		else{
			System.out.println("Given string does not ends with the content of other string");
		}
	}
	
}