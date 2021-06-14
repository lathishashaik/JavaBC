import java.util.ArrayList;
public class SArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//It is a resizable array which stores reference datatypes only(specified in angular bracket)
				//so have access to useful methods
				ArrayList<String> food=new ArrayList<String>();
				food.add("Pizza");
				food.add("Pasta");
				food.add("Potato");
				food.add("Pumkin");
				food.set(3,"Apple");
				food.remove(2);
//Incase of ArrayList we use size() to know it's length
				for(int i=0;i<food.size();i++) {
					System.out.println( food.get(i));
					
				}
				food.clear();

	}

}
