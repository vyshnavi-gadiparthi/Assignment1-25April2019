import java.util.Scanner;

class VowelsInString{
	public static void main(String[] args) {
		String str;
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		str = s.nextLine();
		for(int i = 0; i < str.length(); i++){
		
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				count++;
			}
		}
		System.out.println("The number of vowels in a given string is: " +count);
		
	}	
}