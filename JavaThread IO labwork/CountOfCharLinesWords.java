import java.io.*;
class CountOfCharLinesWords{
	public static void main(String[] args) {
		try{
			String str ="";
		int	charCount = 0, count = 0, countWord = 0, countlines = 0;
			
		FileReader fr = new FileReader("new.txt");
		BufferedReader br = new BufferedReader(fr);
		 
		while( (str = br.readLine()) != null){
			//String v = br.readLine();
			countlines++;
                
                 if(!(str.equals(""))) 
            	{  
	                charCount += str.length(); 
	                String[] word = str.split(" "); 
	                  
	                countWord += word.length; 
                }
        }
        System.out.println("No of Character in the file is "+ charCount);
        System.out.println("No of words in the file" + countWord);
        System.out.println("No of lines in the file" + countlines);

	}
	catch(IOException e ){
		System.out.println(e);

	}

	}
}