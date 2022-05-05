package fileHandling;
import java.io.File;
import java.io.IOException;
public class FileHandlingEx1 {
	public static void main(String[] args) throws IOException{
		System.out.println("Main Method:");
		File f = new File("E:/Java_Matarial/file.txt");
		f.createNewFile();
		System.out.println("File was created.");
		System.out.println("is the File exist "+f.exists());
		System.out.println("Is it is a file "+f.isFile());
		System.out.println("Is it is a Directory "+f.isDirectory());
		System.out.println("what is the name of the file: "+f.getName());
		System.out.println("What is the lenght of the file: "+f.length());
		System.out.println("Can we write the data in the file: "+f.canWrite());
		System.out.println("Can we read the data from the file: "+f.canRead());
		System.out.println("Is the file is hidden: "+f.isHidden());
		System.out.println("What is the path of the file: "+f.getPath());
		System.out.println("Rename the file name: "+f.renameTo(new File("E:/Java_Matarial/File.txt")));
		System.out.println("Delete the file: "+f.delete());
	}
}