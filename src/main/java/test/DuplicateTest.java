package test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateTest {

	//find duplicates of charector
	public static void main(String[] args) {
		
		
		String str="India is my country";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		
		
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
					count++;
				}
			}
				map.put(ch[i], count);
		}
		
		map.entrySet().forEach(e->{
			System.out.println(e.getKey()+"--"+e.getValue());
		});
	}
}
