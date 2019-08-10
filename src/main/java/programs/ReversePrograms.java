package programs;

import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.ws.util.StringUtils;

public class ReversePrograms {
	//reverse a sentence along with letters of word
	/*public static void main(String[] args) {
		System.out.println("Reverse String \"India Is my country\"");
		String str="India Is my country";
		String words[]=str.split(" ");
		String newStr="";
		for(int i=words.length-1;i>-1;i--) {
			
			newStr+=new StringBuilder(words[i]).reverse()+" ";
		}
		System.out.println(newStr.trim());
	}*/
	
	public static void main(String[] args) {
	Set<String> set1=new HashSet<String>();
	set1.add("mounesh");
	set1.add("badiger");
	set1.add("abc");
	set1.forEach(System.out::println);
	}

}
