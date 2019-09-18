package programs;

import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.ws.util.StringUtils;

public class ReversePrograms {
	//reverse a sentence along with letters of word
	public static void reverseSenctenceAndLetters(String str) {
	
		String words[]=str.split(" ");
		String newStr="";
		for(int i=words.length-1;i>-1;i--) {
			
			newStr+=new StringBuilder(words[i]).reverse()+" ";
		}
		System.out.println(newStr.trim());
	}
	
	public static void main(String[] args) {
		System.out.println("Reverse String \"India Is my country\"");
		String str="India Is my country";
		System.out.println("Revers of Mounesh is "+reverseString("Mounesh"));
		reverseSenctenceAndLetters(str);
	}
	public static String reverseString(String str) {
		char[] ch=str.toCharArray();
		char[] temp=new char[ch.length];
		int j=0;
		for(int i=ch.length-1;i>=0;i--) {
			temp[j]=ch[i];
			j=j+1;
		}
		return new String(temp);
	}

}
