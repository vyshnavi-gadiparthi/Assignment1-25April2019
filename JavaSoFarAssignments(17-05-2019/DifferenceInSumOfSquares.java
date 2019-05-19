import java.util.Scanner;

class DifferenceInSumOfSquares{ 

    public static void main(String s[]) 
    { 
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find difference between sum of squares and squares of num : ");
        n = sc.nextInt(); 
        System.out.println("The difference is : " + new DifferenceInSumOfSquares().calculateDifference(n));      
          
    } 

  
    public int calculateDifference(int n){ 
  
    int l, k, m; 
    
    l = (n * (n + 1) * (2 * n + 1)) / 6;       
    k = (n * (n + 1)) / 2;   
    k = k * k; 
    m = Math.abs(l - k); 
      
    return m; 
    }
  
} 
   

