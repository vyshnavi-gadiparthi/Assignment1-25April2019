import java.util.Scanner;

class ValidatingRegistration{
	public static void main(String[] args) {
		String userName;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username ");
		userName = sc.nextLine();
		if (new ValidatingRegistration().validation(userName)) { 
            System.out.println("true"); 
        } else { 
            System.out.println("false"); 
        } 

	}
	public boolean validation(String userName){
		if(userName.endsWith("_job"))
		{
			int i = userName.indexOf("_job");
			if(i != -1)
			{
				String beforejob = userName.substring(0,i);
				if(beforejob.length() >= 8)
				{
					return true;
				}
			}
		}
		return false;
		
	}
}