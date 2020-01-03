package programs;
// Java program to print all the permutations 
// of the given string 
public class Permutations { 

	// Function to print all the permutations of str 
	static void printPermutn(String input, String outSoFar) 
	{ 

		// If string is empty 
		if (input.length() == 0) { 
			System.out.println(outSoFar ); 
			return; 
		} 
		//we chose not to include 
		printPermutn(input.substring(1),outSoFar);
		//we choose to include
		printPermutn(input.substring(1),outSoFar+input.charAt(0));

	} 
	

	// Driver code 
	public static void main(String[] args) 
	{ 
		String s = "abb"; 
		printPermutn(s, ""); 
		
		printPermutn("xyz","");
	} 
} 
