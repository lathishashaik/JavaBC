import java.util.Scanner;
public class IIfSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		if(age>=20) {
			System.out.println("You are an adult");
		}
		else if(age<18 && age>13) {
			System.out.println("You are a teenager");
		}
		else {
			System.out.println("You are a child");
		}

	}

}
