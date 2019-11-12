package core.io.more;

import java.io.*;

public class ObjectStreamClassExample {  
    public static void main(String[] args) {  
  
		
		  // create a new object stream class for Integers 
    	  ObjectStreamClass osc = ObjectStreamClass.lookup(ObjectStreamClassExample.class);
		  
		  // get the value field from ObjectStreamClass for integers
		  System.out.println("" + osc.getField("price"));
		  
		  // create a new object stream class for Calendar
		  ObjectStreamClass osc2 =ObjectStreamClass.lookup(String.class);
		  
		  // get the Class instance for osc2 
		  System.out.println("" + osc2.getField("hash"));
		 
  
    }  
}  