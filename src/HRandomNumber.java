import java.util.Random;
public class HRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random=new Random();
		//prints a random number btw +ve and -ve 2billion
		System.out.println(random.nextInt());
		//prints a random number btw 0 & 1
		System.out.println(random.nextDouble());
		//to print random  num of a die
		// As compiler takes 0 to 5 we need 1 to 6 so +1
		int result=random.nextInt(6)+1;
		System.out.println(result);
		boolean bool=random.nextBoolean();
		System.out.println(bool);

	}

}
