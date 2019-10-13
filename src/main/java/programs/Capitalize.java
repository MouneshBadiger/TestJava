package programs;

import spring.aop.Loggable;
import test.CharectorTest;
//Tital Case problem
public class Capitalize {
	
	public static void main(String[] args) {
		usingRaw();
		
	}

	public static void usingRaw() {
		String str="  i am mounesh badiger.";
		String temp="";
		String s[]=str.trim().split(" ");
		for(String s1:s) {
			char c=s1.charAt(0);
			//ASCII 'A' starts at (65-90) and 'a' starts at (97-122) ==> 97-65=32
			c=(char) (c-32);
			s1=s1.replace(s1.charAt(0),c);
			temp=temp+s1+" ";
		}
		System.out.println(temp.trim());
	}
	public static void usingBuiltIn() {
		String str="  i am mounesh badiger.";
		String temp="";
		String s[]=str.trim().split(" ");
		for(String s1:s) {
			s1=s1.replace(s1.charAt(0), Character.toUpperCase(s1.charAt(0)));
			temp=temp+s1+" ";
		}
		System.out.println(temp.trim());
	}
	@Loggable
	public void aopNonStaticMethod() {
		System.out.println("nonStaticMethod");
	}

}
