import java.util.*;
class HashMapSort
{
	public static void main(String[] args) 
	{
		List<String> list = new HashMapSort().getValues();
		System.out.println("Sorted values of hashmap :");
		for(String ref : list)
            System.out.println(ref);
	}

	public List getValues()
	{
		Map hm = new HashMap();
		System.out.println("Enter number of key value pairs you want to add");
		java.util.Scanner sc =  new java.util.Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		String key; int value;
		for(int i = 0; i <= num; i++)
		{
			System.out.println("Enter key :");
			key = sc.nextLine();
			System.out.println("Enter value :");
			value = sc.nextInt();
			sc.nextLine();
			hm.put(key,value);
		}
 		ArrayList<String> list = new ArrayList();
		Set set = hm.entrySet();
		for(Object me : set) 
		{
    		Map.Entry m = (Map.Entry) me;
    		list.add(m.getValue().toString());
		}
		Collections.sort(list);
		return list;
	}
}