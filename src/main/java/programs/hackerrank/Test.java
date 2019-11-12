package programs.hackerrank;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	
	
    static Set<Integer> list=new TreeSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
    static int findPossibleSmallestNumberMatchingPattern(String pattern) {

        if(pattern==null || pattern==""){
            return -1;
        }
        //if(pattern.equals("M")){
         //   return 21;
       // }
        if(pattern.equals("N")){
            return 12;
        }
        char chA[]=pattern.toCharArray();
        int num=0;

        if(chA[0]=='M'){
            num=21;
            list.remove(2);
             list.remove(1);
        }else{
            num=12;
             list.remove(2);
             list.remove(1);
        }
        
        int i=1;
        int j=0;
        int low=0;
        int hi=0;
        int d=0;
        while(i<chA.length) {
        	 char ch=chA[i];
        	 d=num%10;
        	 if(ch=='M'){
                
                  low=getNextLow(d-j);
                 if(low==-1) {//revert back code
                	 j++;
                	 i--;
                	  num=num/10;
                	 list.add(d);
                	 continue;
                 }
                 num=num*10+low;
                 list.remove(low);

             }else if(ch=='N'){
                  hi=getNextHigh(d+j);
                 if(hi==-1) {//revert back code
                	 j++;
                	 i--;
                	 num=num/10;
                	 list.add(d);
                	 continue;
                 }
                 num=num*10+hi;
                 list.remove(hi);      
             }
        	i++;
        	j=0;
        	low=0;
            hi=0;
        }
        
        
        
       
        return num;

    }
    public  static int getNextHigh(int i){
        
        for(Integer a:list){
            if(a>i){
                return a;
            }
        }
        return -1;
    }
    public  static int getNextLow(int i){
        int low=-1;
        for(Integer a:list){
            if(a<i){
                low=a;
            }
        }
        
            return low;
        
    }
    public static void main(String[] args) {
		//System.out.println(findPossibleSmallestNumberMatchingPattern("M"));
		System.out.println(findPossibleSmallestNumberMatchingPattern("MNMN"));
	}
}
