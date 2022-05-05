package abstractEx;

abstract class Ads {
	void Show() {
		System.out.println("This is Show Method in Abstract Class.");

	}

	abstract void Show1();
}

class Sub extends Ads {
	void Show1() {
		System.out.println("This is Abstract Show1 Method From Abstract Class which is inherited from to Class sub. ");
	}
}

public class AbstractEx1 {
	public static void main(String[] args) {
		System.out.println("This is Main Method:");
		Sub sa = new Sub();
		sa.Show1();
		sa.Show();
	}
}