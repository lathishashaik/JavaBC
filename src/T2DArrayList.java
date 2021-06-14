import java.util.ArrayList;
public class T2DArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//A dynamic list of lists wose sizes are resizable during runtime
		ArrayList<String> bakeryList=new ArrayList<String>();
		bakeryList.add("Pastries");bakeryList.add("Bread");bakeryList.add("Puff");
		System.out.println(bakeryList);
		for(String i:bakeryList)
			System.out.println(i);
		ArrayList<String> produceList=new ArrayList<String>();
		produceList.add("fries");produceList.add("garlic");produceList.add("Salads");
		ArrayList<String> drinkList=new ArrayList<String>();
		drinkList.add("water");drinkList.add("soda");
		
		
		ArrayList<ArrayList<String>> groceryList=new ArrayList<ArrayList<String>>();
       groceryList.add(bakeryList);
       groceryList.add(produceList);
       groceryList.add(drinkList);
       System.out.println(groceryList.get(2));
       System.out.println(groceryList.get(2).get(0)); 
	}

}
