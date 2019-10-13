package test;

import java.util.Date;
import java.util.Locale;

public class PrintfTest {
	
	public static void main(String[] args) {
		/* %[flags][width][.precision]conversion-character */
		
		/*
		 *  s – formats strings
			d – formats decimal integers
			f – formats the floating-point numbers
			t– formats date/time values
		 */
		//%n Line Seperater
		System.out.printf("baeldung%nline%nterminator");
		System.out.printf("%n------------------- %n");
		
		//%s String formater
		System.out.printf("'%s' %n", "baeldung");
		System.out.printf("'%S' %n", "baeldung");
		
		//%X.Ys X minimum characters Y is number characters to be displayed
		System.out.printf("'%10s' %n", "mounesh");
		System.out.printf("'%-10s' %n", "mounesh");//-ve will add right padding
		
		System.out.printf("%10.6s %n", "Hi there!");
		
		//%c %C charecter printing
		System.out.printf("%c%n", 's');
		System.out.printf("%C%n", 's');
		
		//%d number print  flat , for thousands
		System.out.printf("simple integer: %d%n", 10000L);
		System.out.printf(Locale.CANADA, "%,d %n", 10000);
		
		//%f floating printing
		System.out.printf("%f%n", 34.2323f);
		System.out.printf("%1.3f%n", 235.14733);
		
		//%e scientifix notation
		System.out.printf("%5.2e%n", 5.1473);
		
		//Time formatting
		//‘H', ‘M', ‘S'  – characters are responsible for extracting the hours, minutes and second from the input Date
		//‘L', ‘N'  – to represent the time in milliseconds and nanoseconds accordingly
		//‘p' – adds am/pm formatting
		//‘z' – prints out the timezone offset
		Date date = new Date();
		System.out.printf("%tT%n", date);
		
		System.out.printf("hours %tH: minutes %tM: seconds %tS%n", date, date, date);
		
		//Date Formatting
		//‘A' – prints out the full day of the week
		//‘d' – formats a two-digit day of the month
		//‘B' – is for the full month name
		//‘m' – formats a two-digit month
		//‘Y' – outputs a year in four digits
		//‘y' – outputs the last two digits of the year
		System.out.println("--------Printing Dates-");
		System.out.printf("%1$tA, %1$tB %1$tY %n", date);
		System.out.printf("%1$td.%1$tm.%1$ty %n", date);

	}
	

}
