package programs.hackerrank;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class NecklessProblem {
	
	static public  void main(String[] args){
		int a[]= {5,4,0,3,1,6,2};
		solution(a);
	}
	public static int solution(int[] a) {
		
		Set<Integer> set=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) {
			
			int m=i;
			int count=1;
			while(a[m]!=i) {
				m=a[m];
				count++;
				
			}
			set.add(count);
		}
		
		int max=Collections.max(set);
		
      return max;
    }

}
