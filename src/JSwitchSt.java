import java.util.Scanner;
public class JSwitchSt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any day of a week");
		String day=scan.next();
		switch(day) {
		case "Monday":
			System.out.println("It's Monday!! ");
			break;
		case "Tuesday":
			System.out.println("It's Tuesday!! ");
			break;
		case "Wednesday":
			System.out.println("It's Wednesday!! ");
			break;
		case "Thursday":
			System.out.println("It's Thursday!! ");
			break;
		case "Friday":
			System.out.println("It's Friday!! ");
			break;
		case "Saturday":
			System.out.println("It's Saturday!! ");
			break;
		case "Sunday":
			System.out.println("It's Sunday!! ");
			break;
		default:
			System.out.println("Incorrect day is entered");
		}

	}

}
