package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestNew {
	
	public static void main(String[] args) {
		String str="name   at one tow there";
		String str1="name one thereat";
	
		
		Pattern p = Pattern.compile("\\sat\\s");
		Matcher m = p.matcher(str);
		System.out.println(m.find());
	}

}
