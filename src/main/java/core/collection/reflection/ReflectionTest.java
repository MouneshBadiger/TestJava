package core.collection.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ReflectionTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {

		// Get Class using reflection
		Class<?> MyClass = MyClass.class;
		MyClass = new MyClass().getClass();
		try {
			// below method is used most of the times in frameworks like JUnit
			// Spring dependency injection, Tomcat web container
			// Eclipse auto completion of method names, hibernate, Struts2 etc.
			// because MyClass is not available at compile time
			MyClass = Class.forName("com.journaldev.reflection.MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println(MyClass.getCanonicalName()); // prints com.journaldev.reflection.MyClass

		// for primitive types, wrapper classes and arrays
		Class<?> booleanClass = boolean.class;
		System.out.println(booleanClass.getCanonicalName()); // prints boolean

		Class<?> cDouble = Double.TYPE;
		System.out.println(cDouble.getCanonicalName()); // prints double

		Class<?> cDoubleArray = Class.forName("D");
		System.out.println(cDoubleArray.getCanonicalName()); // prints double[]

		Class<?> twoDStringArray = String[][].class;
		System.out.println(twoDStringArray.getCanonicalName()); // prints java.lang.String[][]

		/* Get Super Class */
		Class<?> superClass = Class.forName("com.journaldev.reflection.ConcreteClass").getSuperclass();
		System.out.println(superClass); // prints "class com.journaldev.reflection.BaseClass"
		System.out.println(Object.class.getSuperclass()); // prints "null"
		System.out.println(String[][].class.getSuperclass());// prints "class java.lang.Object"

		
		
		

		/* Get Declared Classes */

		// getting all of the classes, interfaces, and enums that are explicitly
		// declared in ConcreteClass
		Class<?>[] explicitClasses = Class.forName("com.journaldev.reflection.ConcreteClass").getDeclaredClasses();
		// prints [class
		// com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultClass,
		// class com.journaldev.reflection.ConcreteClass$ConcreteClassDefaultEnum,
		// class com.journaldev.reflection.ConcreteClass$ConcreteClassPrivateClass,
		// class com.journaldev.reflection.ConcreteClass$ConcreteClassProtectedClass,
		// class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicClass,
		// class com.journaldev.reflection.ConcreteClass$ConcreteClassPublicEnum,
		// interface
		// com.journaldev.reflection.ConcreteClass$ConcreteClassPublicInterface]
		System.out.println(Arrays.toString(explicitClasses));

		/* Getting Class Modifiers */
		System.out.println(Modifier.toString(ConcreteClass.class.getModifiers())); // prints "public"
		// prints "public abstract interface"
		System.out.println(Modifier.toString(Class.forName("com.journaldev.reflection.BaseInterface").getModifiers()));

		// Get Type parameters (generics)
		TypeVariable<?>[] typeParameters = Class.forName("java.util.HashMap").getTypeParameters();
		for (TypeVariable<?> t : typeParameters)
			System.out.print(t.getName() + ",");

		/* Get Implemented Interfaces */
		Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();
//prints "[java.util.Map<K, V>, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(interfaces));
//prints "[interface java.util.Map, interface java.lang.Cloneable, interface java.io.Serializable]"
		System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getInterfaces()));

		/* Get All Public Methods */

		Method[] publicMethods = Class.forName("com.journaldev.reflection.ConcreteClass").getMethods();
//prints public methods of ConcreteClass, BaseClass, Object
		System.out.println(Arrays.toString(publicMethods));

		/* Get All Public Constructors */

//Get All public constructors
		Constructor<?>[] publicConstructors = Class.forName("com.journaldev.reflection.ConcreteClass")
				.getConstructors();
//prints public constructors of ConcreteClass
		System.out.println(Arrays.toString(publicConstructors));

		/* Get All Public Fields */

//Get All public fields
		Field[] publicFields = Class.forName("com.journaldev.reflection.ConcreteClass").getFields();
//prints public fields of ConcreteClass, it's superclass and super interfaces
		System.out.println(Arrays.toString(publicFields));

		java.lang.annotation.Annotation[] annotations = Class.forName("com.journaldev.reflection.ConcreteClass")
				.getAnnotations();
//prints [@java.lang.Deprecated()]
		System.out.println(Arrays.toString(annotations));

		Field field = Class.forName("com.journaldev.reflection.ConcreteClass").getField("interfaceInt");

		try {
			 field = Class.forName("com.journaldev.reflection.ConcreteClass").getField("interfaceInt");
			Class<?> fieldClass = field.getDeclaringClass();
			System.out.println(fieldClass.getCanonicalName()); // prints com.journaldev.reflection.BaseInterface
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}

		 field = Class.forName("com.journaldev.reflection.ConcreteClass").getField("publicInt");
		Class<?> fieldType = field.getType();
		System.out.println(fieldType.getCanonicalName()); // prints int

		 field = Class.forName("com.journaldev.reflection.ConcreteClass").getField("publicInt");
		ConcreteClass obj = new ConcreteClass(5);
		System.out.println(field.get(obj)); // prints 5
		field.setInt(obj, 10); // setting field value to 10 in object
		System.out.println(field.get(obj)); // prints 10

		/* Get/Set Private Field Value */

		Field privateField = Class.forName("com.journaldev.reflection.ConcreteClass").getDeclaredField("privateString");
//turning off access check with below method call
		privateField.setAccessible(true);
		ConcreteClass objTest = new ConcreteClass(1);
		System.out.println(privateField.get(objTest)); // prints "private string"
		privateField.set(objTest, "private string updated");
		System.out.println(privateField.get(objTest)); // prints "private string updated"

		/* Get Public Method */

		Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
//get method parameter types, prints "[class java.lang.Object, class java.lang.Object]"
		System.out.println(Arrays.toString(method.getParameterTypes()));
//get method return type, return "class java.lang.Object", class reference for void
		System.out.println(method.getReturnType());
//get method modifiers
		System.out.println(Modifier.toString(method.getModifiers())); // prints "public"

		 method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);
		Map<String, String> hm = new HashMap<>();
		method.invoke(hm, "key", "value");
		System.out.println(hm); // prints {key=value}

		/* Get Public Constructor */

		Constructor<?> constructor = Class.forName("com.journaldev.reflection.ConcreteClass").getConstructor(int.class);
		//getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

		Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"

		
		
		
		
		/* Instantiate Object using Constructor */
		constructor = Class.forName("com.journaldev.reflection.ConcreteClass").getConstructor(int.class);
//getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

		Object myObj = constructor.newInstance(10);
		Method myObjMethod = myObj.getClass().getMethod("method1", null);
		myObjMethod.invoke(myObj, null); // prints "Method1 impl."

		hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"
		HashMap<String, String> myMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);

		/* Invoking Private Methods */

		constructor = Class.forName("com.journaldev.reflection.ConcreteClass").getConstructor(int.class);
		//getting constructor parameters
		System.out.println(Arrays.toString(constructor.getParameterTypes())); // prints "[int]"

		 myObj = constructor.newInstance(10);
		 myObjMethod = myObj.getClass().getMethod("method1", null);
		myObjMethod.invoke(myObj, null); // prints "Method1 impl."

		hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
		System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes())); // prints "[]"
		myMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);

	}

}
class MyClass{
	private String  name;
	
	public String getName() {
		return this.name;
	}
}
