package spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import programs.Capitalize;

public class AOPTest {
		
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee e= context.getBean(Employee.class);
		e.payTaxes();
		Capitalize capitalize= context.getBean(Capitalize.class);
		capitalize.main(null);
		capitalize.aopNonStaticMethod();
		
	}
}
