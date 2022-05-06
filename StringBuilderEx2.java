package strings;
public class StringBuilderEx2 {
	public static void main(String[] args) {
		int count=0;
		String s="String Buffer and String Builder are mutable class whereas String class immutable.it is synchronized.";
		StringBuilder stb = new StringBuilder(s);
		stb.chars();
		System.out.println(stb.length());
		for (int i = 0; i <stb.length(); i++) {
			if (stb.charAt(i)==' ' || stb.charAt(i)=='.') {
				count++;
			}
		}
		System.out.println("In the above Sentence there are "+count+" words.");
	}
}