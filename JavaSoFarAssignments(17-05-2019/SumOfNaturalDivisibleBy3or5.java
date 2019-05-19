import java.util.Scanner;

class SumOfNaturalDivisibleBy3or5{
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number  : ");
		num = s.nextInt();
		System.out.println("The sum of number divisible 3 or 5 are : " +new SumOfNaturalDivisibleBy3or5().calculateSum(num));
	}

	public int calculateSum(int num){
		int sum = 0;
		for(int i = 0; i <= num; i++){

			if(i/3 == 0 || i/5 == 0){
				sum = sum + i;
			}
		}
		return sum;
	}
}				