package core.io;

import java.io.*;

/**Java StringReader class is a character stream with string as a source. It takes an input string and changes it into character stream. It inherits Reader class.

In StringReader class, system resources like network sockets and files are not used, therefore closing the StringReader is not necessary.*/
public class StringReaderWriterExample {
	
	 public static void main(String[] args) throws IOException {  
	        char[] ary = new char[512];  
	        StringWriter writer = new StringWriter();  
	        FileInputStream input = null;  
	        BufferedReader buffer = null;  
	        input = new FileInputStream("D://testout.txt");  
	        buffer = new BufferedReader(new InputStreamReader(input, "UTF-8"));  
	        int x;  
	        while ((x = buffer.read(ary)) != -1) {  
	                   writer.write(ary, 0, x);  
	        }  
	        System.out.println(writer.toString());        
	        writer.close();  
	        buffer.close(); 
	        
	        /*Reader*/
	        
	        String srg = "Hello Java!! \nWelcome to Javatpoint.";  
	        StringReader reader = new StringReader(srg);  
	        int k=0;  
	            while((k=reader.read())!=-1){  
	                System.out.print((char)k);  
	            }  
	        }  
}
