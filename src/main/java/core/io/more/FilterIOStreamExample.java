package core.io.more;

import java.io.*;

/**Java FilterOutputStream class implements the OutputStream class.It provides
 *   different sub classes such as BufferedOutputStream and DataOutputStream to provide additional functionality. 
 *  So it is less used individually.*/
public class FilterIOStreamExample {
	
	 public static void main(String[] args) throws IOException {  
	        File data = new File("D:\\testout.txt");  
	        FileOutputStream file = new FileOutputStream(data);  
	        FilterOutputStream filter = new FilterOutputStream(file);  
	        String s="Welcome to javaTpoint.";      
	        byte b[]=s.getBytes();      
	        filter.write(b);     
	        filter.flush();  
	        filter.close();  
	        file.close();  
	        System.out.println("Success...");  
	        
	        
	        File data1 = new File("D:\\testout.txt");  
	        FileInputStream  file1 = new FileInputStream(data1);  
	        FilterInputStream filter1 = new BufferedInputStream(file1);  
	        int k =0;  
	        while((k=filter1.read())!=-1){  
	            System.out.print((char)k);  
	        }  
	        file.close();  
	        filter.close();  
	        
	    }  

}
