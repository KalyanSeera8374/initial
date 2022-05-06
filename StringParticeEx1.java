package strings;
import java.util.*;
public class StringParticeEx1 {

	public static void main(String[] args) {
		
//		String[] name =new String [10];
//		String[] name = {"kalyan","venu","ganesh"};
//		name[0]="wiki";
//		 List<String> list = Arrays.asList(name);
//		 System.out.println(list);
//		 list.add(0,"hi");
//		 System.out.println(list);
		 LinkedList<String> al=new LinkedList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");   
		  System.out.println(al);
		  al.add(2,"wiki");
		  System.out.println(al);
	}

}
