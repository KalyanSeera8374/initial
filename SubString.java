package strings;
public class SubString {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		String str ="Getting a SubString";
		System.out.println(str);
		String sub = str.substring(0, 9);
		System.out.println(sub);
		System.out.println(str.substring(10));
	}
}