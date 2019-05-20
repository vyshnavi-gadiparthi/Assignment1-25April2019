import java.util.*;

class CountNumberOfItems
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Characters");
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		String input = sc.nextLine();
		char []arr = input.toCharArray();
		HashMap<Character,Integer> hm = new Count().countCharacter(arr);
		Set set = hm.entrySet();
		for(Object me : set) 
		{
    		Map.Entry m = (Map.Entry) me;
    		System.out.println(m.getKey() +" : "+m.getValue());
		}
		
	}

	public HashMap countCharacter(char []arr)
	{
		HashMap<Character,Integer> hm = new HashMap();
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
		Integer val;
		for(int i =0; i < arr.length; i++)
		{
			val = hm.get(arr[i]);
			hm.put(arr[i],++val);
		}

		return hm;
	}
}