package strings;
public class StringMutability {
	public static void main(String[] args) {
		String name="Seera Kalyan";
		System.out.println(name);
		System.out.println(name.hashCode());
		String full_name =name.concat(" Kumar");
		System.out.println(full_name);
		System.out.println(full_name.hashCode());
	}
}