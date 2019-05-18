import java.util.Scanner;
import java.util.Arrays;

class SecondSmallestElement{
	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of integers to be entered : ");
		num = s.nextInt();
		int []numbers = new int[num];

		System.out.println("Enter numbers");
		for(int i = 0; i < numbers.length; i++){
			numbers[i] = s.nextInt();
		}
		System.out.println("The second smallest number is : " + new SecondSmallestElement().getSecondSmallest(numbers));
	}

	public int getSecondSmallest(int []numbers){
		Arrays.sort(numbers);
		int secondsmall = numbers[1];
		return secondsmall;
	}
}