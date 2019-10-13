package test;

public class Ambiguity {
	
	public Ambiguity(Object ob) {
		System.out.println("--constr 1---");
	}
	public Ambiguity(String ob) {
		System.out.println("--constr 2---");
	}
	
	//public Ambiguity(Integer i) {
	//	System.out.println("--constr 3---");
	//}
	 
	
	public static void main(String[] args) {
		//works fine, as compiler can pick most specific constructor i,e string
		//if above constructor is uncommented,compiler fails to decide the constructor to be picked up i,e The constructor Ambiguity(Object) is ambiguous
		Ambiguity a=new Ambiguity(null);
		//Ambiguity.test(null);//The method test(Integer) is ambiguous for the type Ambiguity
	}
	
	public static void test(Integer i) {
		
	}
	public static void test(String s) {
		
	}

}
