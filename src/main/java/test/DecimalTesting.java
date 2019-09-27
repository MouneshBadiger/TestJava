package test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.*;

public class DecimalTesting {
	
	
	public static void main(String[] args) {
		/* Primitives */
		byte b=127;
		short s=128;
		char c=128;
		int i=128;
		long l=128;//128l l is optional
		float f=128;
		double d=128;
		
		
		
		
		/* Wrappers */
		Byte bb=127;
		Short ss=128;
		Character cc=128;
		Integer ii=128;
		Long ll=128l;//l is mandatory
		Float ff=128f;//f is mandatory
		Double dd=128d;//d is mandatory
		Double d1=128.0;// since fractoional literals are double by default
		
		Number n=128.993;
		DecimalFormat ddd=new DecimalFormat();
		ddd.setMaximumFractionDigits(2);
		ddd.setMinimumFractionDigits(2);
		System.out.println(ddd.format(n));
		
		System.out.println(new DecimalFormat("#.00").format(n));
		System.out.println(new DecimalFormat("#.00").format(ff/3));
		System.out.println(new DecimalFormat("#.00").format(ii/3));
		
		
		
		
	}

}
