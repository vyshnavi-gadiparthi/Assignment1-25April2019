import java.util.Scanner;

class SumOfCubesOfDigits{
	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		number = s.nextInt();
		System.out.println("The sum of digits of a cube is : " +(new SumOfCubesOfDigits().cubesSum(number)));
	}

	public int cubesSum(int number){

		int sum = 0;
		while (number > 0) {
	    int digit = number % 10;
	    sum += digit * digit * digit;
	    number = number/10;
	    }
	    return sum;
	}
}