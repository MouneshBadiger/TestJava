package core.java8;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {
	
	public static void main(String[] args) {
		//1
		IntStream intStream=IntStream.range(1, 100);
		intStream.forEach(System.out::println);
		
		
		//2 Map
		String[] names= {"mounesh","ramesh","suresh","rajest"};
		Stream<String> stream=Stream.of(names);
		stream.map(p->p.toUpperCase()).forEach(System.out::println);
	}

}
