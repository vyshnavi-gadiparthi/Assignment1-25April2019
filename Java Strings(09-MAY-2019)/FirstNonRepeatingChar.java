import java.util.Scanner;
class FirstNonRepeatingChar{
	public static void main(String[] args) {
		String str;
		//int flag = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		str = s.nextLine();

		for(Character ch :str.toCharArray()){
			if(str.indexOf(ch) == str.lastIndexOf(ch)){
				System.out.println("The first non-repeating character in a given string is " +ch);
				break;
			}
		}
		// for(int i = 0; i < str.length(); i++){
		// 	for(j = i; j<= str.length()-1; j++)
			
			

		}
	}
	