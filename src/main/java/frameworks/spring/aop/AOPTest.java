package frameworks.spring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPTest {
		
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
		Employee e= context.getBean(Employee.class);
		e.payTaxes();
		
	}
}
