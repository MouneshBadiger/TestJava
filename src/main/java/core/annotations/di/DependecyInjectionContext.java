package core.annotations.di;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DependecyInjectionContext {
	Class<?> configuration;
	Map<String,Object> contextMap=new HashMap<>();
	
	public DependecyInjectionContext(Class<?> configuration) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		this.configuration=configuration;
		this.contextMap=this.initApplicationContext();
	}
	
	
	
	public  Object getBean(Class<?> classType) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Constructor<?> constr[]=classType.getConstructors();
		Object bean=null;
		for(Constructor<?> constr1:constr) {
			
			if(constr1.isAnnotationPresent(AutowireDependecy.class)) {
				Class<?> paramsTypes[]=constr1.getParameterTypes();
				for(Class<?> depType:paramsTypes) {
					//String id=constr1.getAnnotation(MyBean.class).id();
					
					Object depObj=checkIfBeanDefined(depType);
					if(depObj!=null) {
						bean=constr1.newInstance(depObj);
						return bean;
					};
				}
			}
		}
		return null;
	}

	private  Object checkIfBeanDefined(Class<?> depType) {
		for(Map.Entry<String, Object> entry:this.contextMap.entrySet()) {
			if(depType.isAssignableFrom(entry.getValue().getClass())) {
				return entry.getValue();
			}
		}
		return null;
	}
	
	public Map<String,Object> initApplicationContext() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		Map<String,Object> contextMap=new HashMap<>();
		Class<?> configClass=this.configuration;
		Method methods[]=configClass.getMethods();
		for(Method method:methods) {
			if(method.isAnnotationPresent(core.annotations.di.MyBean.class)) {
				
				String id=method.getAnnotation(MyBean.class).id();
				Object bean=method.invoke(configClass.newInstance(), null);
				if(!contextMap.containsKey(id)) {
					contextMap.put(id, bean);
				}else {
					throw new RuntimeException("Duplicate Bean ID Exception");
				}
				
			}
		
		}
		return contextMap;
	}
	
	

}
