package test;

public class WrapperTest {
	
	public static void main(String[] args) {
		Long i=new Long(0);
		System.out.println(i.equals(0));
		System.out.println(i.equals(0l));
		
		Integer m=10;
		Integer n=10;
		System.out.printf("%n%d",m==n);
		System.out.printf("%n%d",m.equals(n));
	}

}
