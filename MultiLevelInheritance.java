package inheritance;
class GrandParentM{
	public void landm() {
		System.out.println("The land was brought by the Grand parent.");
	}
}
class ParentM extends GrandParentM{
	public void housem() {
		System.out.println("Buliding the house on the land given by the Grand parent.");
	}
}
class ChildM extends ParentM {
	public void floorm() {
		System.out.println("Building a Second floor on the house given by the Parent.");
	}
}
public class MultiLevelInheritance {
	public static void main(String[] args) {
		System.out.println("Multi level inheritance:");
		ChildM cm = new ChildM();
		cm.landm();
		cm.housem();
		cm.floorm();
	}
}