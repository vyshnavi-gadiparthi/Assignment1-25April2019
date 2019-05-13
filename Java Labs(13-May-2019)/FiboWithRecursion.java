import java.util.Scanner;

class Demo {
	int fib(int n) {
		if(n==1)
			return (1);
		else if(n==2)
			return (1);
		else
			return (fib(n-1)+fib(n-2));
	}
}
class FiboWithRecursion {
	public static void main(String args[]) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter last number");
		n = s.nextInt();		
		int res=0;
		Demo obj = new Demo();
		for(int i = 1;i <= n; i++) {
			res = obj.fib(i);
			
		}
		System.out.println(n+"th value of the series is "+res);
	}
}