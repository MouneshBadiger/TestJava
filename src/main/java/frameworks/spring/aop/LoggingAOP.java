package frameworks.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAOP {
	
	@Before(value = "execution(* frameworks.spring.aop.Employee.payTaxes())")
	public void logDetails() {
		System.out.println("before details");
	}
	@After(value = "execution(* frameworks.spring.aop.Employee.payTaxes())")
	public void afterAdvice() {
		System.out.println("after method");
	}
	
	@Around(value = "execution(* frameworks.spring.aop.Employee.payTaxes())")
	public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		try {
			Employee e=(Employee) proceedingJoinPoint.getTarget();
			if(e.name.equals("Mounesh")) {
				System.out.println("around method validation success");
				proceedingJoinPoint.proceed();
			}else {
				System.out.println("around method validation failed");
			}
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


}
