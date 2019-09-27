package test;

import java.util.logging.Logger;

public class StringPadding {
    private static final Logger logger = Logger.getLogger(StringPadding.class.getName());
   
    public static void main(String args[]) {
      
        int number = 7;
      
        //add 3 leading zeros in this number
        String padded = String.format("%03d" , number);
        System.out.println("Integer number left padded with zero : " + padded);
      
        //left pad 7 zeros in this integer
        padded = String.format("%07d" , number);
        System.out.println("Java example to add leading zeros in Integer : " + padded);
      
        
    }
  
}


