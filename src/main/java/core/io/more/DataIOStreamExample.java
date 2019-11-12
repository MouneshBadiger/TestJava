package core.io.more;

import java.io.*;

/**Java DataInputStream/DataOutputStream class allows an application to read/write primitive data from the input
 *  stream in a machine-independent way.*/
public class DataIOStreamExample {
	
	public static void main(String[] args) throws IOException {  
        FileOutputStream file = new FileOutputStream("D:\\testout.txt");  
        DataOutputStream data = new DataOutputStream(file);  
        data.writeInt(65);  
        data.flush();  
        data.close();  
        System.out.println("Succcess...");  
        
        InputStream input = new FileInputStream("D:\\testout.txt");  
        DataInputStream inst = new DataInputStream(input);  
        int count = input.available();  
        byte[] ary = new byte[count];  
        inst.read(ary);  
        for (byte bt : ary) {  
          char k = (char) bt;  
          System.out.print(k+"-");  
        }  
    }  

}
