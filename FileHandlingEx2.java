package fileHandling;
import java.io.File;
import java.io.IOException;
class CreateFile{
	public void create()throws IOException {
		File cf = new File("E:/Java_Matarial/ABC.txt");
		
		if(cf.exists()) {
			System.out.println("With this name file is Exist.");
		}
		else {
			cf.createNewFile();
			System.out.println("File was Created.");
		}
	}
}
public class FileHandlingEx2 {
	public static void main(String[] args) throws IOException{
		System.out.println("Main Method:");
		CreateFile cc = new CreateFile();
		cc.create();
	}
}