package test;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashcode {

	public static void main(String[] args) {
		Set<FullName> set=new HashSet<FullName>();
		set.add(new FullName("mounesh","badiger"));
		
		System.out.println(set.contains(new FullName("mounesh","badiger")));
		//FullName.myNative();
		
		
	}
}

class FullName{
	String fNmae;
	String lName;
	public FullName(String fNmae, String lName) {
		super();
		this.fNmae = fNmae;
		this.lName = lName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof FullName) {
			FullName f=(FullName)obj;
			return (this.fNmae.equals(f.fNmae) && this.lName.equals(f.lName));
		}else
			return false;
	}
	
	@Override
	public int hashCode() {
		return 30* this.fNmae.hashCode()*this.lName.hashCode();
		//return super.hashCode();
	}
	public static native void myNative();
}