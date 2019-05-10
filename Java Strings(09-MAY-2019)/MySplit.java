import java.util.Scanner;
class MySplit{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		System.out.println("Enter a delimiter:");
		String deli = sc.nextLine();
		SplitString obj = new SplitString();
		obj.mySplit(str,deli);
	}
}

class SplitString{
	void mySplit(String s, String delim)
	{		
		int len = s.length();
		String []arr = new String[len];
		int index;
		int d = delim.length();
		for(int i=0; i<len; i++)
		{	 
				index = s.indexOf(delim);
				
				if (index!=-1) {
					
				arr[i] = s.substring(0,index);

				s = s.replaceFirst(s.substring(0,index+d),"");
				System.out.println(s);
			}
			else
			{
				arr[i] = s;
				break;
			}
		}
		System.out.println("Splited array: ");

		for (int i = 0; i<len ;i++) 
		{
		if(arr[i]!=null)	
		System.out.println(arr[i]);
		}
	}
}