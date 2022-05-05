package constructor;
class Hello{
	//so,here jvm will create Default Constructor for this Constructor.
	//That is why is not throwing any Error.
	
}
public class DefaultConstructor {
	public static void main(String[] args) {
		System.out.println("This is Main Method.");
		new Hello();
	}
}