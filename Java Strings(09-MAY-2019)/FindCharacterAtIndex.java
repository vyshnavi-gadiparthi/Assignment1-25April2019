import java.util.Scanner;

class FindCharacterAtIndex{
	public static void main(String[] args){
		String str="vyshnavigadiparthi";
		System.out.println("The string is: "+str);
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the index: ");
		int index=in.nextInt();
		if(index <= 26){
			System.out.println("The character at the index "+index+" is: "+str.charAt(index));
		}
		// else{
		// 	System.out.println("Character is not found for the given index");
		// }
	}
}