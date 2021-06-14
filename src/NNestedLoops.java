import java.util.Scanner;
public class NNestedLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=scan.nextInt();
		System.out.println("Enter number of columns");
		int columns=scan.nextInt();
		System.out.println("enter any symbol");
		String symbol=scan.next();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
				
			{
				System.out.print(symbol);
			}
			System.out.println();
		}

	}

}
