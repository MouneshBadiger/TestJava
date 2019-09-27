package frameworks.spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("frameworks.spring.aop")
@EnableAspectJAutoProxy
public class MyConfiguration {

	@Bean
	public Employee employee() {
		return new Employee();
	}
}
