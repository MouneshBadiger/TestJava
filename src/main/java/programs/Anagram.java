package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
//Anagram: words with same letters 
public class Anagram {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream os=new PrintStream(new File("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\myoutput_stream.txt"));
		System.setOut(os);
		String s1="MANISHa";
		String s2="ANISHM";
		
		char ch1[]=s1.toCharArray();
		char ch2[]=s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch2, ch1)) {
			System.out.println("anangram");
		}else {
			System.out.println("not anangram");
		}
	}

}
