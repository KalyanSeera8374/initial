package abstractEx;

abstract class Hi {
	static void hi() {
		System.out.println("Static Method in the abstract class.");
	}

	public void pub() {
		System.out.println("This is Concret Method in abstrct class .");
	}

	abstract void hello();
}

class Greetings extends Hi {
	public void hello() {
		System.out.println("This is Abstract method from the Abstract class Which is inherited to Greetings class.");
	}

	public void welcome() {
		System.out.println("This is normal method from the class Greetings.");
	}
}

public class PracticeABstract {
	public static void main(String[] args) {
		System.out.println("Main Method:");
		Greetings gr = new Greetings();
		gr.hello();
		Hi.hi();
		gr.welcome();
		gr.pub();
	}
}
