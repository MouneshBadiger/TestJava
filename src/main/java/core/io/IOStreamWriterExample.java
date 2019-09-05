package core.io;

import java.io.*;

/**OutputStreamWriter is a class which is used to convert character stream to byte stream, the characters are encoded into byte using a specified charset. write() method calls the encoding converter which converts the character into bytes. The resulting bytes are then accumulated in a buffer before being written into the underlying output stream. The characters passed to write() methods are not buffered. We optimize the performance of OutputStreamWriter by using it with in a BufferedWriter so that to avoid frequent converter invocation.*/
public class IOStreamWriterExample {
	
	 public static void main(String[] args) {  
		  
	        try {  
	            OutputStream outputStream = new FileOutputStream("output.txt");  
	            Writer outputStreamWriter = new OutputStreamWriter(outputStream);  
	  
	            outputStreamWriter.write("Hello World");  
	  
	            outputStreamWriter.close();  
	        } catch (Exception e) {  
	            e.getMessage();  
	        }  
	        
	        try  {  
	            InputStream stream = new FileInputStream("file.txt");  
	            Reader reader = new InputStreamReader(stream);  
	            int data = reader.read();  
	            while (data != -1) {  
	                System.out.print((char) data);  
	                data = reader.read();  
	            }  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	    }  

}
