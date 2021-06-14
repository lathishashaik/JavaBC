
public class QStringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" B r o ";
		String s2=" b r o ";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('o'));
		System.out.println(s1.isEmpty());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		//remove the spaces before or after String not in btw
		System.out.println(s1.trim());
		//var.replace('oldchar','newchar')
		System.out.println(s1.replace('B', 'p'));

	}

}
