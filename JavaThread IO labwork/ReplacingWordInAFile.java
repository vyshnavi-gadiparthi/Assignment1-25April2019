import java.io.*;
import java.util.Scanner;
class ReplacingWordInAFile{
	public static void main(String[] args) throws Exception
	{
		String word, replaceword;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word from file to replace");
		word = s.nextLine();
		System.out.println("Enter a word to be replaced");
		replaceword = s.nextLine();

		
		File file = new File("new.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str, samplecontent = "", afterreplace;
		while((str = br.readLine()) != null){

			afterreplace = str.replace(word,replaceword);
			System.out.println(afterreplace);
			samplecontent = samplecontent + afterreplace + "\n";

		}
		br.close();

		BufferedWriter bw = new BufferedWriter(new FileWriter(file));
		bw.write(samplecontent);
		bw.close();
		
	}
}