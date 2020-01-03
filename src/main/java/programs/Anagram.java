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
	 static boolean areAnagram(char str1[], char str2[]) 
	    { 
	        // Create 2 count arrays and initialize 
	        // all values as 0 
		 	int NO_OF_CHARS = 256; 
	        int count1[] = new int[NO_OF_CHARS]; 
	        Arrays.fill(count1, 0); 
	        int count2[] = new int[NO_OF_CHARS]; 
	        Arrays.fill(count2, 0); 
	        int i; 
	  
	        // For each character in input strings, 
	        // increment count in the corresponding 
	        // count array 
	        for (i = 0; i < str1.length && i < str2.length; i++) { 
	            count1[str1[i]]++; 
	            count2[str2[i]]++; 
	        } 
	  
	        // If both strings are of different length. 
	        // Removing this condition will make the program 
	        // fail for strings like "aaca" and "aca" 
	        if (str1.length != str2.length) 
	            return false; 
	  
	        // Compare count arrays 
	        for (i = 0; i < NO_OF_CHARS; i++) 
	            if (count1[i] != count2[i]) 
	                return false; 
	  
	        return true; 
	    } 

}
