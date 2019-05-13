import java.util.Scanner;
class FiboWithoutRecursion {
	public static void main(String args[ ]) {
		Scanner s = new Scanner(System.in);
		int i,a=1,b=1,c=0,n;
		System.out.println("Enter value of n:");
		n = s.nextInt();
		
		for(i = 0; i < n-2; i++) {
			c=a+b;
			a=b;
			b=c;
			
		}
		
		System.out.print(n + "th Fibonacci value of the series is: "+c);
	}
}