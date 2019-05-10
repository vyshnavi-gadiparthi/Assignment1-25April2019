class InitialsFromFullName{ 
      
   public static void main(String args[]) 
    { 
        String name = "vyshnavi gadiparthi"; 
        String str[] = name.split(" "); 
        for(String word : str) { 
            System.out.println(Character.toUpperCase(word.charAt(0))); 
        } 
    } 
  
}