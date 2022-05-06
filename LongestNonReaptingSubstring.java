package strings;

import java.util.ArrayList;
import java.util.List;

class LNRS{
	String str="ABDEFGHABEF";
	int l=str.length();
	String s="";
	String comp="";
	public void readL() {
		  List<String> list= new ArrayList<String>();
		  int biggest =0;
		for (int i = 0; i <l; i++) {
			for (int j = i; j <l-1; j++) {
				s +=str.charAt(j);
				comp =Character.toString(str.charAt(j+1));
				if (s.contains(comp)) {
					list.add(s);
					s="";
					break;
				}
			}
		}
		  for (int i=0; i<list.size(); i++) {
		        if (list.get(biggest).length()< list.get(i).length()) {
		        biggest=i;
		        }
		    }

		       System.out.println(list);    
		       System.out.println(list.get(biggest));           
		    }	
	}
public class LongestNonReaptingSubstring {

	public static void main(String[] args) {
	System.out.println("Main Method:");
	LNRS ll = new LNRS();
	ll.readL();
	
	}

}





//public class LongestNonReaptingSubstring {
//
//	public static void main(String[] args) {
//	String str="ABDEFGHABEF";
//	String temp=null;
//	for (int i = 0; i <str.length(); i++) {
//		for (int j = i+1; j <str.length(); j++) {
//			if (str.charAt(i)==str.charAt(j)) {
////				System.out.println(j);
//				for (int j2 = i; j2 <=j; j2++) {
//					System.out.print(str.charAt(j2));
//					temp=temp+(str.charAt(j2));
//				}
//			}
//		}
//		System.out.println();
//	}
//	}
//
//}