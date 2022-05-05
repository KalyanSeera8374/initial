package constructor;
class Car{
	String cname = "MG Hector";
	double cprice =1900000;
	String Colour = "Red";
	int Capacity = 5;
	Car(){
		System.out.println("Car Comapany Name: "+cname);
		System.out.println("Car Price: "+ cprice);
		System.out.println("Car Colour: "+Colour);
		System.out.println("Car Capacity: "+Capacity);
	}
}
public class ConstructorEx2 {
	public static void main(String[] args) {
		System.out.println("This is Main Method:");
		new Car();
	}
}