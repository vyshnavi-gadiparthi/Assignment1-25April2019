import java.util.*;
import java.util.Scanner;
class CheckingForPositive { 
    static boolean PositiveOrNot(String str) { 
        int n = str.length(); 
  
        for (int i = 1; i < n; i++) {   
            if (str.charAt(i) < str.charAt(i - 1)) { 
                return false; 
            } 
        } 
  
        return true; 
    } 
  
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String to check for positivity : ");
        String str = sc.nextLine();
        if (PositiveOrNot(str)) { 
            System.out.println("String is positive"); 
        } else { 
            System.out.println("String is not positive"); 
        } 
    } 
} 