package core.java8;

import java.util.*;

public class OptionalTest {

	
	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Mark", "Howard", "Anthony D'Cornian");
		Optional<String> largeString = listOfStrings.stream().filter(str -> str.length() > 10).findAny();
		largeString.ifPresent(System.out::println);

		Optional<String> veryLargeString = listOfStrings.stream().filter(str -> str.length() > 20).findAny();
		veryLargeString.ifPresent(System.out::println);
		
		
		/*
		 * static Optional empty(): It creates and returns an empty Optional instance.
		 * boolean isPresent(): It return true if there is a value present, otherwise false.
		 * void ifPresent(Consumer consumer): If a value is present, this method invokes the specified consumer with the value, otherwise does nothing. As we can see, in our first example:
		 *T get(): If a value is present in the Optional, this method returns the value, otherwise throws NoSuchElementException. As you might have gussed
		 *static Optional<T> of(T value): It returns an Optional with the specified present non-null value.
		 *Optional filter(Predicate predicate): It takes a predicate as an argument and returns an Optional object. If condition of the predicate is met, then the Optional is returned as is, Otherwise it will return an empty Optional.
		 */
		Optional<String> empty = Optional.empty();
		System.out.println(empty.isPresent());

	}
}
