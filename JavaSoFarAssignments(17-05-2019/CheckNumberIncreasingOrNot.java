import java.util.Scanner;

class CheckNumberIncreasingOrNot{
	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		number = s.nextInt();
		if(new CheckNumberIncreasingOrNot().checkNumber(number)){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}

	public boolean checkNumber(int number){
		boolean flag = false;
		int currentDigit = number % 10;
        number = number/10;
        
        while(number>0){
           
           	if(currentDigit <= number % 10){
               flag = true;
               break;
           	}
           	currentDigit = number % 10;
           	number = number/10;
        }   	
           	if(flag){
           		return false;
           	}
           	else{
           		return true;
           	}
    }
}
