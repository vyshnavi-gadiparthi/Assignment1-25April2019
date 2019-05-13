class Anagram
{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		str1 = str1.replaceAll("\\s","");
		str2 = str2.replaceAll("\\s","");
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		int flag = 0;

		if(str1.length() == str2.length())
		{
			for(int i = 0; i < arr1.length ; i++)

			{
				for(int j = 0; j < arr2.length ; j++)

				{
					if(arr1[i] == arr2[j])
					{
						flag = 1;
						break;
					}
				}		
			}		
		}

		if(flag == 1)
			System.out.println("Is Anagram");
		else
			System.out.println("Is Not Anagram");


	}
}