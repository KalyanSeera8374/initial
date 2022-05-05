package constructor;
class UpCastingVar{
	UpCastingVar(int a ,int b){
		int z = a+b;
		System.out.println("Int ,Int");
		System.out.println(z);
	}
	UpCastingVar(int a ,double b){
		double z = a+b;
		System.out.println("Int ,Double");
		System.out.println(z);
	}
	UpCastingVar(double a ,int b){
		double  z = a+b;
		System.out.println("Double ,Int");
		System.out.println(z);
	}
	UpCastingVar(double a ,double b){
		double z = a+b;
		System.out.println("Int ,Int");
		System.out.println(z);
	}
}
public class ConstructorOverloading {
	public static void main(String[] args){
		System.out.println("This is Main Method:");
		new UpCastingVar(3,7);
	}
}