class RWrapperClass{
 public static void main(String[]args){
	//here true is primitive value which is automatically converted to Bolean(wc)
	//auto-boxing adv are now below variables can have access to useful methods
	Boolean a=true;
	Character b='@';
	Integer c=123;
	Double d=3.14;

	//Unboxing:as a==true executes as of primitive datatypes 
	if(a==true)
		System.out.println("This is true");
 }
}