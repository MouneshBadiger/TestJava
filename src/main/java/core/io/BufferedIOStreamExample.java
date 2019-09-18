package core.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedIOStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout = new FileOutputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\testout.txt");
		BufferedOutputStream bout = new BufferedOutputStream(fout);
		String s = "W汉elcome to javaTpoint.";
		byte b[] = s.getBytes();
		bout.write(b);
		bout.flush();
		bout.close();
		fout.close();
		System.out.println("success");
		
		 try{    
			    FileInputStream fin=new FileInputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\testout.txt");    
			    BufferedInputStream bin=new BufferedInputStream(fin);    
			    int i;    
			    while((i=bin.read())!=-1){    
			     System.out.print((char)i);    
			    }    
			    bin.close();    
			    fin.close();    
			}catch(Exception e){System.out.println(e);}  
	}
}  