package core.io;

import java.io.*;

/**It is an abstract class for writing to character streams.*/
/**
 * Some of the implementation class are BufferedReader, CharArrayReader,
 * FilterReader, InputStreamReader, PipedReader, StringReader
 * Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.
 *
 *FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.
 *Java BufferedReader class is used to read the text from a character-based input stream. It can be used to read data line by line by readLine() method
 *
 *The CharArrayReader is composed of two words: CharArray and Reader. The CharArrayReader class is used to read character array as a reader (stream). It inherits Reader class.
 *The CharArrayWriter class can be used to write common data to multiple files. This class inherits Writer class. Its buffer automatically grows when data is written in this stream. Calling the close() method on this object has no effect.
 */
public class ReaderWriterExample {  
    public static void main(String args[]) throws IOException{    
         try{    
           FileWriter fw=new FileWriter("D:\\testout.txt");    
           //BufferedWriter buffer = new BufferedWriter(fw); 
           
			/*
			 * CharArrayWriter out=new CharArrayWriter();
			 * out.write("Welcome to javaTpoint"); FileWriter f1=new
			 * FileWriter("D:\\a.txt"); FileWriter f2=new FileWriter("D:\\b.txt");
			 */   
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");   
          
          FileReader fr=new FileReader("D:\\testout.txt");    
          //BufferedReader br=new BufferedReader(fr);   br.readLine()
		/*
		 * char[] ary = { 'j', 'a', 'v', 'a', 't', 'p', 'o', 'i', 'n', 't' };
		 * CharArrayReader reader = new CharArrayReader(ary);
		 */ 
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();   
     }    
}  