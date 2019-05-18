import java.util.Scanner;
import java.util.Arrays;

class AlphabeticOrderOfString{
	public static void main(String[] args) {
		String []arr = new String[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter strings to be sorted");
		String input = sc.nextLine();
		arr = input.split("\\s"); 
		Arrays.sort(arr);

		int len = arr.length;

			if((len % 2) == 0){
				for(int i = 0; i < len/2 ; i++)
				{
					System.out.println(arr[i].toUpperCase());
				}
				for(int i = len/2 ; i < len ;i++)
				{
					System.out.println(arr[i].toLowerCase());
				}
				

			}
			else{
				for(int i = 0; i < len/2 + 1 ; i++)
				{
					System.out.println(arr[i].toUpperCase());
				}
				for(int i = len/2 + 1 ; i < len ;i++)
				{
					System.out.println(arr[i].toLowerCase());
				}
			}
			

	}
}				
		// for(int i=0; i < arr.length; i++)
  //       {
  //           arr[i] = sc.nextLine();
        
  //           for(int j=1; j<arr.length; j++)
  //           {
  //               if(arr[j-1].compareTo(arr[j])>0)
  //               {
  //               	String temp;
  //                   temp=arr[j-1];
  //                   arr[j-1]=arr[j];
  //                   arr[j]=temp;
  //               }
  //           }
  //       }
  //       System.out.println("After sorting in alphabetical oredr was : ");
  //        for (int i = 0; i < arr.length - 1; i++) 
  //       {
  //           System.out.print(arr[i] + ",");
  //       }
  //       //System.out.print(arr[n - 1]);
