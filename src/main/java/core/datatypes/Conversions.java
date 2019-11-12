package core.datatypes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Conversions {
	
	public static void main(String[] args) {
		System.out.println("-Testing-");
		/* List<Integer> to int[] */
		List<Integer> list=new ArrayList<>();
		int a[]=list.stream().mapToInt(p->p.intValue()).toArray();
		
		/* int[] to List<Integer> */
		int b[]=new int[10]	;
		List<Integer> list1=Arrays.stream(b).boxed().collect(Collectors.toList());

		/* Object[] to List<Object> */
		//best example for variable arguments in java
		Object[] obj=new Object[10];
		List<Object> list2=Arrays.asList(obj);
		
		/* Convert Date to String and vice versa  Java 8 */
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate localDate=LocalDate.parse("12-12-2019",formatter);
		LocalDate locDate=LocalDate.of(2019, 1, 1);
		System.out.println(locDate.getDayOfWeek().toString());
		String localDateStr= localDate.format(formatter);
		
		
		/* Convert Date to String and vice versa  Java Old */
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Date date=null;
			try {
				date = sdf.parse("12-12-2019");
			} catch (ParseException e) {}
			
		String dateStr= sdf.format(date);
		
		
	}

}
