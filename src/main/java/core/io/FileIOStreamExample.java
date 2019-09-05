package core.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileIOStreamExample {
	
	public static void main(String[] args) {
	    try{    
            OutputStream fout=new FileOutputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\testout.txt");    
            fout.write(65);  //writes A 
            String s="Welcome to javaTpoint.";    
            byte b[]=s.getBytes();//converting string into byte array    
            fout.write(b);
            fout.close();    
            System.out.println("success...");    
           }catch(Exception e){System.out.println(e);}  
	    
	    try{    
            InputStream fin=new FileInputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\testout.txt");    
            int i=fin.read();  
            //System.out.print((char)i); 
            
            while((i=fin.read())!=-1) {
            	System.out.print((char)i);
            }
  
            fin.close();    
          }catch(Exception e){System.out.println(e);} 
	}

}
