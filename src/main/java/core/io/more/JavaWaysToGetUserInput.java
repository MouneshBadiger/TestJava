package core.io.more;

import java.io.Console;

public class JavaWaysToGetUserInput {
	
	public static void main(String args[]) {
		/* 1st way using console */
		Console c = System.console();
		System.out.println("Enter password: ");
		char[] ch = c.readPassword();
		String pass = String.valueOf(ch);// converting char array into string
		System.out.println("Password is: " + pass);
	}   
}
