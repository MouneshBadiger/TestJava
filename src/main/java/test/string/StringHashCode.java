package test.string;

public class StringHashCode {
	
	public static void main(String[] args) {
		String s1="mounesh";
		String s2="mounesh";
		System.out.println("hascode s1="+s1.hashCode());
		System.out.println("hascode s2="+s2.hashCode());
		System.out.println("s1==s1--"+s1==s2);
		
		System.out.println("s1==s1--"+s1.equals(s2));
	}

}
