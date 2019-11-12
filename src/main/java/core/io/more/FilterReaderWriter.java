package core.io.more;

import java.io.*;
/**Java FilterReader is used to perform filtering operation on reader stream. It is an abstract class for reading filtered character streams.
The FilterReader provides default methods that passes all requests to the contained stream. Subclasses of FilterReader should override some of its methods and may also provide additional methods and fields.*/
public class FilterReaderWriter {
	
	public static void main(String[] args) {  
        try {  
            FileWriter fw = new FileWriter("Record.txt");   
            CustomFilterWriter filterWriter = new CustomFilterWriter(fw);             
            filterWriter.write("I LOVE MY COUNTRY");  
            filterWriter.close();  
            FileReader fr = new FileReader("record.txt");  
            BufferedReader bufferedReader = new BufferedReader(fr);  
            int k;  
            while ((k = bufferedReader.read()) != -1) {  
                System.out.print((char) k);  
            }  
            bufferedReader.close();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        
        
        
        
        try  {  
            Reader reader = new FileReader("javaFile123.txt");  
            CustomFilterReader fr = new CustomFilterReader(reader);  
            int i;  
            while ((i = fr.read()) != -1) {  
                System.out.print((char) i);  
            }  
            fr.close();  
            reader.close();  
        } catch (Exception e) {  
            e.getMessage();  
        }  
    }  

}
class CustomFilterWriter extends FilterWriter {  
    CustomFilterWriter(Writer out) {  
        super(out);  
    }  
    public void write(String str) throws IOException {  
        super.write(str.toLowerCase());  
    }  
}  
class CustomFilterReader extends FilterReader {  
    CustomFilterReader(Reader in) {  
        super(in);  
    }  
    public int read() throws IOException {  
        int x = super.read();  
        if ((char) x == ' ')  
            return ((int) '?');  
        else  
            return x;  
    }  
}  