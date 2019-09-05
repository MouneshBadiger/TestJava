package core.io;

import java.io.*;

/**The PipedReader class is used to read the contents of a pipe as a stream of characters. This class is used generally to read text.

PipedReader class must be connected to the same PipedWriter and are used by different threads.*/
public class PipeReaderWriterExample {
	
	 public static void main(String[] args) {  
	        try {  
	  
	            final PipedReader read = new PipedReader();  
	            final PipedWriter write = new PipedWriter(read);  
	  
	            Thread readerThread = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                        int data = read.read();  
	                        while (data != -1) {  
	                            System.out.print((char) data);  
	                            data = read.read();  
	                        }  
	                    } catch (Exception ex) {  
	                    }  
	                }  
	            });  
	  
	            Thread writerThread = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                        write.write("I love my country\n".toCharArray());  
	                    } catch (Exception ex) {  
	                    }  
	                }  
	            });  
	  
	            readerThread.start();  
	            writerThread.start();  
	  
	        } catch (Exception ex) {  
	            System.out.println(ex.getMessage());  
	        }  
	        
		/* Reader Implementaion */
	        try {  
	        	  
	            final PipedReader read = new PipedReader();  
	            final PipedWriter write = new PipedWriter(read);  
	  
	            Thread readerThread = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                        int data = read.read();  
	                        while (data != -1) {  
	                            System.out.print((char) data);  
	                            data = read.read();  
	                        }  
	                    } catch (Exception ex) {  
	                    }  
	                }  
	            });  
	  
	            Thread writerThread = new Thread(new Runnable() {  
	                public void run() {  
	                    try {  
	                        write.write("I love my country\n".toCharArray());  
	                    } catch (Exception ex) {  
	                    }  
	                }  
	            });  
	  
	            readerThread.start();  
	            writerThread.start();  
	  
	        } catch (Exception ex) {  
	            System.out.println(ex.getMessage());  
	        }  
	  
	    }  
	 
	 

}
