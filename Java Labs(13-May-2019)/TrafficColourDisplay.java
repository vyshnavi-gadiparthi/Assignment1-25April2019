import java.util.Scanner;

class Trafficlights{
  public void displayColors(){
  	System.out.println("Red");
  	System.out.println("Yellow");
  	System.out.println("green");

 }
 public void selectInput(){
 	Scanner sc  = new Scanner(System.in);
 	System.out.println("Select a color from the above");
 	String col = sc.nextLine();
 	if(col.contains("red")){
 		System.out.println("red refers to STOP");
 	}
 	else if(col.contains("green")){
 		System.out.println("green refers to GO");
 	}
 	else if(col.contains("yellow")){
 		System.out.println("yellow refers to Ready");
 	}
 	else{
 		System.out.println("No colour was selected from given list");
 	}
 	
 }
 
}

class TrafficColourDisplay{
	public static void main(String[] args) {
		Trafficlights tl = new Trafficlights();
		tl.displayColors();
		tl.selectInput();
		 // tl.display();
	}
}