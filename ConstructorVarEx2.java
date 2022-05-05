package constructor;
class ADD1{
	int p,m;
	ADD1(int p,int m){
		//this.p=p;
		//this.m=m;
		int z =p+m;
		System.out.println("This is constructor with parameterized:");
		System.out.println(z);
}
}
public class ConstructorVarEx2 {
	public static void main(String[] args) {
		System.out.println("This is Main Method:");
		new ADD1(3 ,56 );
	}
}