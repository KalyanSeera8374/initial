package fileHandling;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
class Write {
	public void writeD() throws IOException {
		FileWriter fw = new FileWriter("E:/Java_Matarial/Data10.txt",true);//Data1.txt for text formate.
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println("Enter the data into a file:");
		System.out.println(fw);
		String s =br.readLine();
		for (int i = 0; i < s.length(); i++) {
			bw.write(s.charAt(i));
		}
		System.out.println("Data was Written in the file.");
		bw.close();
		br.close();
		fw.close();
	}
}
public class FileWritingDataEx1 {
	public static void main(String[] args) throws IOException{
		System.out.println("Main Method:");
		Write wd = new Write();
		wd.writeD();
	}
}