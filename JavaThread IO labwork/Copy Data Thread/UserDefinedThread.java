import java.io.*;

class UserDefinedThread{
	public static void main(String[] args) {
		File sourcefile = new File("source.txt");
		File targetfile = new File("target.txt");
		CopyDataThread cdt = new CopyDataThread(sourcefile, targetfile);
		cdt.start();
	}
}

class CopyDataThread extends Thread{

	File sourcefile, targetfile;
	CopyDataThread(File sourcefile, File targetfile){
		this.sourcefile = sourcefile;
		this.targetfile = targetfile;
	}

	public void run() {

		try{
		int ch, count = 0;
		String con = "";
		FileInputStream fis = new FileInputStream(sourcefile);

		while((ch = fis.read()) != -1){
			con += (char)ch;
			count++;
			if(count == 10){
				System.out.println("Copied 10 characters");
				count = 0;
				Thread.sleep(5000);
			}
		}

		BufferedWriter bw = new BufferedWriter(new FileWriter(targetfile));
		bw.write(con);
		bw.flush();
		bw.close();
		}
		catch(IOException | InterruptedException ie){
			System.out.println(ie);
		}

	}
}