class SecondMostFrequent
{
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.nextLine();
		char []temp = str.toCharArray();
		int count = 0; int max1 = 0; int max2 = 0;
		char cmax1 = 0; char cmax2 = 0;
		for (int i = 0; i < temp.length ; i++ ) 
		{
			count = 0;
			for (int j = 0; j < temp.length ; j++ ) 
			{
				if(temp[i] == temp[j])
					count++;
			}

			if(count > max1)
			{
				max2 = max1;
				cmax2 = cmax1;
				max1 = count;
				cmax1 = temp[i];
			}
			else if(count < max1 && count > max2)
			{
				max2 = count;
				cmax2 = temp[i];
			}

			System.out.println("cmax1: "+cmax1+" cmax2 : "+cmax2);
		}

		System.out.println("Max 2 is: "+cmax2);
	}
}