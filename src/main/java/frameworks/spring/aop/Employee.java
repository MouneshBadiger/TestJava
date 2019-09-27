package frameworks.spring.aop;

public class Employee {
	
	String name="Mounesh1";
	
	public String payTaxes() {
		System.out.println("--Paying tax--");
		return String.valueOf(1000);
	}

}
