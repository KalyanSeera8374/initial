package fileHandling;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
class Reading{
	public void readR() throws IOException {
		FileReader fr= null;
		try {
			fr = new FileReader("E:/Java_Matarial/Data1.txt");
			BufferedReader br = new BufferedReader(fr);
			
			int n;
			while ((n=br.read())!=-1) {
				System.out.print((char)n);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found.");
			return;
		}
		finally {
			fr.close();
		}
	}
}
public class FileReading {
	public static void main(String[] args) throws IOException{
		System.out.println("Main Method:");
		Reading r = new Reading();
		r.readR();
	}
}