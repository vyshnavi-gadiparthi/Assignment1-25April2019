import java.util.Scanner;

class PrimeNumbersInRange{
	public static void main(String[] args) {
		int number;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your number");
		number = s.nextInt();
		for(int i=2;i<=number;i++)
        {
            int flag=0;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
                System.out.print(i+" ");
        }
        System.out.println();
	 		
   
   }
}