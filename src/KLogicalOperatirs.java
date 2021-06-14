import java.util.Scanner;
public class KLogicalOperatirs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temperature");
		int temp=scan.nextInt();
		if(temp>38)
			System.out.println("It's hot outside");
		else if(temp>15 && temp<38)
			System.out.println("It's cool outside");
		else
			System.out.println("It's freezing");
		System.out.println("enter q or Q to quit the game");
		String choice=scan.next();
		if(choice.equals("q") || choice.equals("Q"))
			System.out.println("You quitted the game");
		else
			System.out.println("You are still iin the game");

	}

}
