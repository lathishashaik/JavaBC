import java.util.Scanner;
public class LWhileLoop {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name="";
		
		while(name.isBlank()) {
			System.out.print("Name is : ");
			name=scan.nextLine();
		}
		System.out.println("Welcome "+name);
	}

}
