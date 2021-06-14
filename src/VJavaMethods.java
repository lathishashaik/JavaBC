
public class VJavaMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Bro";
		int age=21;
		greetings(name,age);

	}
	//if not static error is cannot make a static reference to a non static method
	 static void greetings(String n,int a) {
		System.out.println("Hello "+n);
		System.out.println("You are "+a+" years old");
	}

}
