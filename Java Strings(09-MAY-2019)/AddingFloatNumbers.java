import java.util.Scanner;

class AddingFloatNumbers{
	 public static void main(String[] args) {
    	
        float sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Float.parseFloat(args[i]);
        }
        if(args.length > 1){
        System.out.println("The sum of the float point numbers is " + sum);
    	}
    	else{
    		System.out.println("Cannot perform addition on single digit");
    		
    	}
    }
}    
