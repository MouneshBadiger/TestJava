package programs.hackerrank;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TempTest{
	
	
	 public static void main(String[] args){
		
		 String S="BAOOLLNNOLOLGBAX";
		 char ch[]="BALLOON".toCharArray();
	        int count=0;
	       
	        while(S.length()>=7){
	            boolean isSuccess=true;
	            
	             for(int i=0;i<ch.length;i++){
	            	
	                if(!S.contains(Character.toString(ch[i]))){
	                	isSuccess=false;
	                   break;
	                }
	            
	             }
	             if(isSuccess) {
	            	boolean isValid=true;
	            	 for(int i=0;i<ch.length;i++){
	            		 if(S.contains(Character.toString(ch[i]))){
	            			 S=S.replaceFirst(Character.toString(ch[i]), "");
	            		 }else {
	            			 isValid=false;
	            			 System.out.println("else");
	            		 }
	                   
	                 
	                  }
	            	 if(isValid)
	            	 count++;
	             }
	        }
        System.out.println(count);
	
		
	}
	
	

}
