package test.string;

public class StringHashCode {
	
	public static void main(String[] args) {
		String s1="mounesh";//only one object will be created
		String s2="mounesh";//only one object will be created
		System.out.println("hascode s1="+s1.hashCode());
		System.out.println("hascode s2="+s2.hashCode());
		System.out.println("s1==s1--"+s1==s2);//references are different but pointing to same object from string pool
		
		System.out.println("s1==s1--"+s1.equals(s2));
	}

}
