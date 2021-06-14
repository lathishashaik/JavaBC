
public class WOverloadedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//methods having same name but different signature
		//i.e no:of parameters,datatype of each parameter and order of parameters
		int x=3;int y=4;int z=5;
		double a=3.14;double b=4.6874;
		System.out.println(add(x,y));
		System.out.println(add(x,y,z));
		System.out.println(add(a,x));
		System.out.println(add(x,a));
		System.out.println(add(x,b));

	}
	static int add(int p,int q) {
		System.out.println("In #1 method");
	  return p+q;
	}
	static int add(int p,int q,int r) {
		System.out.println("In #2 method");
		  return p+q+r;
		}
	static double add(double s,int t) {
		System.out.println("In #3 method");
		  return s+t;
		}
	static double add(int t,double s) {
		System.out.println("In #4 method");
		  return t+s;
		}

}
