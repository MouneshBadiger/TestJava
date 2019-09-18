package core.io;
import java.io.*;  

/**Java ByteArrayOutputStream class is used to write common data into multiple files. 
 * In this stream, the data is written into a byte array which can be written to multiple streams later.
*The ByteArrayOutputStream holds a copy of data and forwards it to multiple streams.
*The buffer of ByteArrayOutputStream automatically grows according to data*/

/**The ByteArrayInputStream is cmposed of two words: ByteArray and InputStream. As the name suggests, it can be used to read byte array as input stream.
Java ByteArrayInputStream class contains an internal buffer which is used to read byte array as stream. In this stream, the data is read from a byte array.
The buffer of ByteArrayInputStream automatically grows according to data.*/
public class ByteArrayIOStreamExample {
	public static void main(String args[]) throws Exception {
		FileOutputStream fout1 = new FileOutputStream("D:\\f1.txt");
		FileOutputStream fout2 = new FileOutputStream("D:\\f2.txt");

		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		//Same As FileInputStream exept it can write to multiple files
		bout.write(65);
		bout.writeTo(fout1);
		bout.writeTo(fout2);

		bout.flush();
		bout.close();// has no effect
		System.out.println("Success...");
		
		
		byte[] buf = { 35, 36, 37, 38 };
		// Create the new byte array input stream
		ByteArrayInputStream byt = new ByteArrayInputStream(buf);
		int k = 0;
		while ((k = byt.read()) != -1) {
			// Conversion of a byte into character
			char ch = (char) k;
			System.out.println("ASCII value of Character is:" + k + "; Special character is: " + ch);
		}
	}
}  