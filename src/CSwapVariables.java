
public class CSwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String glass1="Water";
		String glass2="Juice";
		String temp;
		//SWAPPING USING TEMP VAR
		temp=glass1;
		glass1=glass2;
		glass2=temp;
		System.out.println("Glass1 : "+glass1+"\nGlass2 : "+glass2);
		//WITHOUT USING TEMP VAR
		int a=5;int b=4;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a= "+a+"\nb= "+b);

	}

}
