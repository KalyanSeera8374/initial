package strings;
public class StringEx1 {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		//it is == operator String comparing.
		String s1 ="java";
		String s2 ="jvaa";
		String s3 = new String("this is java class");
		String s4 = new String("JAVA");
		System.out.println(s1.compareTo(s2));//Here it will compare by the hashcode of s1 and s2. 
		System.out.println(s1==s3);//Here s3 will be created in the heap memory then point to the "java" in the String Constant Pool.
		System.out.println(s3.compareTo(s3));
		System.out.println(s3.compareToIgnoreCase(s4));
		System.out.println(s1.toUpperCase());
		System.out.println(s4.toLowerCase());
		System.out.println(s1.startsWith(s2));
		System.out.println(s3.startsWith(s1,8));
		System.out.println(s3.replace('t', 'T'));
		System.out.println(s1.indexOf('k'));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}