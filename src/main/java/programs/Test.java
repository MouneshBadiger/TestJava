package programs;

import java.util.Scanner;

public class Test {
	
	public static  boolean isOwel(char c) {
		return "aeiou".indexOf(c)!=-1;
	}
	public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of test cases");
        int testCases=sc.nextInt();
        
        for(int i=0;i<testCases;i++){
             //System.out.println("Enter charector lenght");
              int len=sc.nextInt();
              //System.out.println("Enter charector sequence");
              String str=sc.next();
              char[] ch=str.toCharArray();
              int result=0;
            for(int j=0;j<ch.length;j++){
            	 int k=j;
                 //ambiguous
            	 
                while(k<ch.length-1) {
                		boolean terminate=true;
                 		if(isOwel(ch[k]) && !isOwel(ch[k+1])) {
                 			result++;
                 			terminate=false;
                 		}
                 		if(!isOwel(ch[k]) && isOwel(ch[k+1])) {
                 			result++;
                 			terminate=false;
                 		}
                 		if(terminate) {
                 			break;
                 		}
                 		k++;
             	}
            }
            System.out.println("Result:"+result);
                
               
            
        }
   }
	
	

}
