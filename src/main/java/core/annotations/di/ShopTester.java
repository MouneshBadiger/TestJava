package core.annotations.di;

import java.lang.reflect.InvocationTargetException;

public class ShopTester {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		DependecyInjectionContext context=new DependecyInjectionContext(MyConfigurations.class);
		Consumer consumer=(Consumer) context.getBean(Consumer.class);
		consumer.purchase();
		
	}

}
