package programs;

import java.util.Arrays;

import org.aspectj.asm.internal.CharOperation;

import test.CharectorTest;

/**
 * @author MOUNESHBADIGERBadige
 *Panagram: A sentence containing all the letters of English Alphabets
 */
public class Panagram {
	
	public static void main(String[] args) {
		String str="The uick brown fox jumps over the lazy dog";
		str=str.replace(" ", "").toUpperCase();
		
		for(char c='A';c<='Z';c++) {
		
			if(!str.contains(Character.toString(c))) {
				System.out.println("Its not Panagram");
				System.exit(0);
			}
		}
		StringBuilder s=null;
		System.out.println("Its a Panagram ");
		
	}
	public static boolean isPangram(String str) {
	    if (str == null) {
	        return false;
	    }
	    int ALPHABET_COUNT=26;
	    Boolean[] alphabetMarker = new Boolean[ALPHABET_COUNT];
	    Arrays.fill(alphabetMarker, false);
	    int alphabetIndex = 0;
	    str = str.toUpperCase();
	    for (int i = 0; i < str.length(); i++) {
	        if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z') {
	            alphabetIndex = str.charAt(i) - 'A';
	            alphabetMarker[alphabetIndex] = true;
	        }
	    }
	    for (boolean index : alphabetMarker) {
	        if (!index) {
	            return false;
	        }
	    }
	    return true;
	}

}
