package test;

public class OperatorsTest {
	
	public static void main(String[] args) {
		int i= 10 + + 15 + - 5;
		System.out.println(i);
		
		int d=15;
		int binary=0b1111;
		int octa=017;
		int hex=0xf;
		System.out.println("Decimal:"+d);
		System.out.println("Binary:"+binary);
		System.out.println("octa:"+octa);
		System.out.println("hex:"+hex);
		
		
		System.out.println("Negation of 15="+(~d)+"   "+Integer.toBinaryString(~d));
		
		
		System.out.println("-----------------------------------------------------------------------");
		//For positive number, >> and >>> works same  
	    System.out.println("20>>2 "+(20>>2)+"   "+Integer.toBinaryString(20)+"   "+Integer.toBinaryString(20>>2));  
	    System.out.println("20>>>2 "+(20>>>2)+"   "+Integer.toBinaryString(20)+"   "+Integer.toBinaryString(20>>>2));  
	    //For negative number, >>> changes parity bit (MSB) to 0  
	    //>>> unsigned shift 
	    System.out.println(Integer.toBinaryString(-20));
	    System.out.println(Integer.toBinaryString(-20>>1));
	    System.out.println();
	    System.out.println(Integer.toBinaryString(-20)); 
		System.out.println(Integer.toBinaryString(-20>>>1));
		
		
		short a=10;
		short b=10;
		
		//short sum=a+b;//operation on two numbers result in integer.
		String name=true?"Mounesh":"Anand";
		System.out.println(name);
		
		
	}

}
