package test;

public class ImmutableTest/* extends Employee*/{

	public static void main(String[] args) {
		Employee e1=new Employee("123");
		String ss=e1.getPANNO();
	}
}

final class Employee{
	private final String PAN_NO;
	
	public Employee(String PANNO) {
		this.PAN_NO=PANNO;
	}
	public String getPANNO() {
		return this.PAN_NO;
	}
}