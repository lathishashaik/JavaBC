import java.util.Scanner;
public class DUserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=scan.next();
		System.out.println("Your age?");
		int age=scan.nextInt();
		System.out.println("Fav food?");
		String food=scan.next();
		System.out.println("Your name : "+name);
		System.out.println("Your age is "+age);
		System.out.println("Your favourite food is "+food);

	}

}
