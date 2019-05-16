import java.io.*;
class DiplayNoofLinesInFile{
	public static void main(String[] args) throws IOException{
						
		
			int lines = 0;
			//FileReader fr = new FileReader(file);
			BufferedReader reader = new BufferedReader(new FileReader("new.txt"));
			String str = "";
			while ((str = reader.readLine())!= null){ 
			lines++;
			System.out.println(lines + str);
			//System.out.println(str);
			}
			
			reader.close();
			

			
	}	
}