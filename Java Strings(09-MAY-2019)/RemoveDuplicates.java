import java.util.Scanner;
class RemoveDuplicates{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String strprint = "";
		for( int i=0; i<str.length(); i++){
			if(!strprint.contains(String.valueOf(str.charAt(i))))
				strprint+= String.valueOf(str.charAt(i));
		}
		System.out.println(strprint);
	}
}

