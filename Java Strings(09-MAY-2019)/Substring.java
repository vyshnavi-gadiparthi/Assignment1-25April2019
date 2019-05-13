class Substring
{
	String str;
	public String getSubstring(int i)
	{
		String result = "";
		for(int j = i; j < str.length(); j++)
		{
			result += str.charAt(j);
		}
		
		return result;
	}

	public String getSubstring(int i, int k)
	{
		String result = "";
		for(int j = i; j < k; j++)
		{
			result += str.charAt(j);
		}
		
		return result;
	}

	public static void main(String[] args) 
	{

		Substring sub = new Substring();
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		sub.str = sc.nextLine();
		System.out.println("Enter Number");
		int i = sc.nextInt();
		String result = sub.getSubstring(i);
		System.out.println("Substring is: "+result);
		System.out.println("Enter Two Numbers");
		int first = sc.nextInt();
		int second = sc.nextInt();
		String result2 = sub.getSubstring(first,second);
		System.out.println("Substring is: "+result2);
	}
}