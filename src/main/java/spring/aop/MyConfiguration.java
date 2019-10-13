package spring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import programs.Capitalize;

@Configuration
@ComponentScan("spring.aop")
@EnableAspectJAutoProxy
public class MyConfiguration {

	@Bean
	public Employee employee() {
		return new Employee();
	}
	@Bean
	public Capitalize capitalize() {
		return new Capitalize();
	}
}
