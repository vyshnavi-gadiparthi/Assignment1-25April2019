import java.io.*;
import java.util.Scanner;
class CheckingFileFromRuntime{
	public static void main(String[] args) {
		String filename;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter file name");
		filename = s.nextLine();
		File file = new File(filename);
		if(file.exists()){
			System.out.println("The file exist");
			System.out.println(" The file can be read: " +file.canRead());
			System.out.println(" The file can be write: " +file.canWrite());
			System.out.println("The length of the file is: " +file.length());
			String name = file.getName();
			int ex = name.indexOf(".");
			System.out.println("The extension is " + name.substring(ex+1));
		}
		else{
			System.out.println("File not found");
		}
	}
}