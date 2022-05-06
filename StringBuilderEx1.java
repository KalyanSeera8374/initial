package strings;

public class StringBuilderEx1 {
	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder("java");
//		Any thing is same but StringBuilder is faster then StringBuffer
		StringBuffer sb = new StringBuffer("java");
		sb.append("code");
		System.out.println(sb);
		sb.insert(4,'@');
		System.out.println(sb);
		sb.replace(0, 4,"Python");
		System.out.println(sb);
		sb.delete(6,11);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}
}
