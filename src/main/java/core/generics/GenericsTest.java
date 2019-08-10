package core.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author MOUNESHBADIGERBadige
 *
 * @param <T>
 */
public class GenericsTest {

	/**This is main method to test Generic types*/
	public static void main(String[] args) {
		
		//genericExtendsTest();
		sumOfNumbers(Arrays.asList(1.3,14,18));
		List<Object> list=new ArrayList<>(Arrays.asList("mgb","mounesh"));
		addNumbersToList(list);
		
	}
	
	public static void genericClassTest() {
		List<Box<String>> list=new ArrayList<>(Arrays.asList(new Box<String>("pen1"),new Box<String>("pen2")));
		list.forEach(System.out::println);
	}
	public static void GenericPairTest() {
		Pair<Integer,String> pair1=new OrderedPair<>(1,"Maths");
		Pair<Integer,String> pair2=new OrderedPair<>(2,"Science");
		Pair<Integer,String> pair3=new OrderedPair<>(2,"English");
		
	}
	public static void genericExtendsTest() {
		Box<String> s1=new Box<>("box1");
		s1.inspect(12);
		
	}
	//wild cards
	//<? extends Number> --> Upper bound--> anything that is subclass of Number
	//<? super Number> --> Lower bound--> anything that is parent of Number
	public static void sumOfNumbers(List<? extends Number> numbers) {
		Double d=0.0;
		for(Number n:numbers) {
			d+=n.doubleValue();
		}
		System.out.println("Sum="+d);
	}
	//User <? super Number> for modfication 
	//it is rarly used
	public static void addNumbersToList(List<? super String> numbers) {
		numbers.add("mounesh");
		numbers.add("badiger");
	}
}

