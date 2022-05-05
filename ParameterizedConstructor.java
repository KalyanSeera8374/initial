package constructor;
class Student{
	String name;
	int age;
	Student(String name ,int age){
		this.name=name;
		this.age=age;
		System.out.println("Student Name: "+name);
		System.out.println("Student Age: "+age);
	}	
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		System.out.println("This is Main method:");
		new Student("Kalyan",459);
		new Student("Venu",450);
		new Student("Ganesh",457);
	}
}