
public class P2DArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] cars=new String[2][2];
		cars[0][0]="BMW";
		cars[0][1]="Tesla";
		cars[1][0]="Maruthy";
		cars[1][1]="Audi";
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(cars[i][j]);
			}
		}
		String[][] choclates= {{"DairyMilk","Cadbury"},{"Milkybar","Snickers"}};
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(choclates[i][j]);
			}
		}

	}

}
