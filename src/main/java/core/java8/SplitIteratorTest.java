package core.java8;
import java.util.*;
import java.util.stream.Stream;
public class SplitIteratorTest {

	public static void main(String[] args) {
		
		Stream<String> st=Stream.of("mounesh","baiger","kenganur");
		
		Spliterator<String> sitorator=st.spliterator();
		sitorator.forEachRemaining(System.out::println);
		
		List<String> strlist=new ArrayList<>(Arrays.asList("jhkj","mnm","hjhk"));
		Spliterator<String> sitoratorlist=strlist.spliterator();
		sitoratorlist.forEachRemaining(System.out::println);

	}

}
