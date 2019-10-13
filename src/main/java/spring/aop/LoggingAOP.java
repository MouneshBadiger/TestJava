package spring.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class LoggingAOP {
	
	@Before(value = "execution(* spring.aop.Employee.payTaxes())")
	public void logDetails() {
		System.out.println("before details");
	}
	@After(value = "execution(* spring.aop.Employee.payTaxes())")
	public void afterAdvice() {
		System.out.println("after method");
	}
	
	@Around(value = "execution(* spring.aop.Employee.payTaxes())")
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

	//Pointcut to execute on all the methods of classes in a package
	//@Pointcut("within(com.journaldev.spring.service.*)")
	//public void allMethodsPointcut(){}
	
	
	
	//Advice arguments, will be applied to bean methods with single String argument
	//@Before("args(name)")
	//public void logStringArguments(String name){
	//	System.out.println("String argument passed="+name);
	//}
		
	//
	@Around("@annotation(Loggable)")
	public void beforeAnnotatedMethods(ProceedingJoinPoint pjp) {
		
		System.out.print("calling method:"+pjp.getSignature());
		System.out.println(" argument Passed:"+Arrays.toString(pjp.getArgs()));
	}


}
/* ways to befine JointPoint 
 * 1.execution(..)
 * 2.within(.ClassName)
 * 3.args(name)
 * 4.@annotation(MyAnnotation)
 * */
