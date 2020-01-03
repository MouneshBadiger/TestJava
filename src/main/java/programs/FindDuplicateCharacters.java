package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacters {
	 public static void main(String args[]) {
	        printDuplicateCharacters("Programmingg");
	        printDuplicateCharacters("Combination");
	        printDuplicateCharacters("Java");
	        int arr[] = {1, 2, 3, 1, 3, 6, 6}; 
	        printRepeating(arr);
	    }

	    /*
	     * Find all duplicate characters in a String and print each of them.
	     */
	    public static void printDuplicateCharacters(String word) {
	        char[] characters = word.toCharArray();

	        // build HashMap with character and number of times they appear in String
	        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	        for (char ch : characters) {
	            if (charMap.containsKey(ch)) {
	                charMap.put(ch, charMap.get(ch) + 1);
	            } else {
	                charMap.put(ch, 1);
	            }
	        }

	        // Iterate through HashMap to print all duplicate characters of String
	        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
	        System.out.printf("List of duplicate characters in String '%s' %n", word);
	        for (Map.Entry<Character, Integer> entry : entrySet) {
	            if (entry.getValue() > 1) {
	                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
	            }
	        }
	    }
	 // Function to print duplicates 
	    static void printRepeating(int arr[]) 
	    { 
	        int i;   
	        System.out.println("The repeating elements are : "); 
	     
	        for (i = 0; i < arr.length; i++) 
	        { 
	            if (arr[ Math.abs(arr[i])] >= 0) 
	                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
	            else
	                System.out.print(Math.abs(arr[i]) + " "); 
	        }          
	    }  
	    public static void printRepeatingHandling0() { 
	        int numRay[] = {0, 4, 3, 2, 7, 8, 2, 3, 1}; 
	  
	        for (int i = 0; i < numRay.length; i++) { 
	            numRay[numRay[i] % 10] = numRay[numRay[i] % 10] + 10; 
	        } 
	        System.out.println("The repeating elements are : "); 
	        for (int i = 0; i < numRay.length; i++) { 
	            if (numRay[i] > 19) { 
	                System.out.println(i + " "); 
	            } 
	        } 
	    } 
}
