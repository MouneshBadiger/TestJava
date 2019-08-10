package test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.misc.IOUtils;


public class JavaIOTest {
	
	public static void main(String[] args) {
		
		//fileInputStreamTest();
		byteArrayInputStreamTest();
		
	}
	
	public static void fileInputStreamTest() {
		try {
			FileOutputStream fos=new FileOutputStream("myfile.txt");
			fos.write("mounesh badiger".getBytes());
			fos.close();
			System.out.println("File has been written");
			
			FileInputStream fis=new FileInputStream("myfile.txt");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void byteArrayInputStreamTest() {
		//ByteArrayOutputStream class is used to write common data into multiple files. 
		//In this stream, the data is written into a byte array which can be written to multiple streams later.
		try {
			FileOutputStream fos1=new FileOutputStream("byteArray_StreamTest1.txt");
			FileOutputStream fos2=new FileOutputStream("byteArray_StreamTest2.txt");
			System.out.println("--writing to ByteArryOutputStream---");
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			baos.write("badigermounesh".getBytes());
			baos.writeTo(fos1);
			baos.writeTo(fos2);
			System.out.println("--writing to ByteArryOutputStream completed---");
			System.out.println("--Reading from ByteArryOutputStream ---");
			
			File file=new File("byteArray_StreamTest2.txt");
			
			ByteArrayInputStream bais=new ByteArrayInputStream(getByteArray(new FileInputStream("byteArray_StreamTest2.txt")));
			
			int k=0;
			while((k=bais.read())!=-1) {
				System.out.print((char)k);
			}
			System.out.println("Byte array read completed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	public static byte[] getByteArray(InputStream input) throws IOException
	{
	    byte[] buffer = new byte[8192];
	    int bytesRead;
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    while ((bytesRead = input.read(buffer)) != -1)
	    {
	        output.write(buffer, 0, bytesRead);
	    }
	    return output.toByteArray();
	}

}
