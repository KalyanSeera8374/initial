package fileHandling;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
class User{
	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	
	FileWriter fr = null;
	public void readU() throws IOException {
		System.out.println("Enter the File Name:");
		String loc="E:/Java_Matarial/";
		String fname=br.readLine();
		fname= loc.concat(fname);
		fname=fname.concat(".txt");
		fr = new FileWriter(fname,true);
		System.out.println();
		System.out.println("Enter the data:");
		BufferedWriter bw = new BufferedWriter(fr);
		System.out.println(fr);
		String data =br.readLine();
		for (int i = 0; i <data.length(); i++) {
			bw.write(data.charAt(i));
			System.out.print(data.charAt(i));
		}
		System.out.println("Data was Written.");
		
		bw.close();
	}
}
public class UserFile {
	public static void main(String[] args) throws IOException,Exception {
		System.out.println("Main Method:");
		User ur = new User();
		ur.readU();
	}
}