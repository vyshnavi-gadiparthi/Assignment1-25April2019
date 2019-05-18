import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;
 
class  AddingIntegersUsingStringTokenizer{
    public static void main(String args[]) {
        int sum = 0, number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integers with gap to display and sum : ");
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        try{
        while (st.hasMoreTokens()) {
            String temp = st.nextToken();
            number = Integer.parseInt(temp);
            System.out.println(number);
            sum = sum + number;
        }
        System.out.println("sum of the integers is: " + sum);
        }
        catch(IOException ie){
            System.out.println("Enter only integers" +ie);
        }
    }
}