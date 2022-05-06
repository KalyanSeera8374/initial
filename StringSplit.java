package strings;
public class StringSplit {
	public static void main(String[] args) {
		String s1 = "java by kalyan.";
		String x[]=s1.split(" ");
		for(String s:x)
			System.out.println(s);
		String dob ="03-02-1997";
		String y[] =dob.split("-");
		for(String s2:y)
			System.out.println(s2);
	}
}