package core.java8;

import java.util.stream.Stream;

public class MethodReferanceTest {
	
	public static void main(String[] args) {
		
		//Salary s=s1->System.out.println(s1.length());
		Salary s=MethodReferanceTest::aliasMethod;
		s.printSalaries("mounesh");
		
		Stream.of("first","second","third").forEach(System.out::println);
		//Here since signiture println(T t) of System.out reference is same as Consumer interface method accept(T t)
		//Instead of providing implmentaion of Consumer we can directly provide any method refernce of same signiture,
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

