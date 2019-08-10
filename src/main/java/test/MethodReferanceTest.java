package test;

public class MethodReferanceTest {
	
	public static void main(String[] args) {
		
		//Salary s=s1->System.out.println(s1.length());
		Salary s=MethodReferanceTest::aliasMethod;
		s.printSalaries("mounesh");
	}
	
	static void aliasMethod(String s){
		s=s.toUpperCase();
		System.out.println(s);
	}

}



@FunctionalInterface
interface Salary{
	void printSalaries(String s);
}

class IBM implements Salary{


	@Override
	public void printSalaries(String s) {
		System.out.println(s);
		
	}
	
}

