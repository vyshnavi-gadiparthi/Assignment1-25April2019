import java.util.*;

class NumberOfTheirSquares
{
	public static void main(String[] args) 
	{
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		System.out.println("Enter number of integers you want to enter");
		int num = sc.nextInt();
		sc.nextLine();
		Integer []arr = new Integer[num];
		for(int i = 0; i < num; i++)
		{
			System.out.println("Enter number");
			arr[i] = sc.nextInt();
		}

		HashMap<Integer,Integer> hm = new Square().getSquares(arr);
		Set set = hm.entrySet();
		for(Object me : set) 
		{
    		Map.Entry m = (Map.Entry) me;
    		System.out.println(m.getKey() +" : "+m.getValue());
		}
		
	}

	public HashMap getSquares(Integer []arr)
	{
		HashMap<Integer,Integer> hm = new HashMap();
		for(int i =0; i < arr.length; i++)
		{
			hm.put(arr[i],0);
		}

		Set set = hm.entrySet();
		for(Object me : set) 
		{
    		Map.Entry m = (Map.Entry) me;
    		System.out.println(m.getKey());
		}
		Integer val; Integer square;
		for(int i =0; i < arr.length; i++)
		{
			square = arr[i]*arr[i];
			hm.put(arr[i],square);
		}

		return hm;
	}
}