package arrayList;
import java.util.ArrayList;
public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(45);
		al.add("Java");
		al.add(59.23f);
		al.add(true);
		System.out.println(al);
		al.add(2, 89);
		System.out.println(al);
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(66);
		al1.add(88);
		al1.add(46);
		al1.add(100);
		System.out.println(al1);
		al.addAll(al1);
		System.out.println(al);
		al.add(5, "Program");
		System.out.println(al);
		System.out.println(al.contains(220));
		System.out.println(al.get(3));
		System.out.println(al.indexOf(66));
		al.addAll(3, al1);
		System.out.println(al);
		System.out.println(al.indexOf(100));
		System.out.println(al.lastIndexOf(100));
		al.remove(2);
		System.out.println(al);
		al.removeAll(al1);
		System.out.println(al);
		// al.clear();
		System.out.println(al);
		al.set(2, 20);
		System.out.println(al);
	}
}