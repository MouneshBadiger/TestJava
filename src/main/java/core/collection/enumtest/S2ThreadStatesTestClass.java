
package core.collection.enumtest;

public class S2ThreadStatesTestClass {
	public static final int START = 1;
	public static final int WAITING = 2;
	public static final int RUNNING = 3;
	public static final int DEAD = 4;

	/**
	 * This method shows the benefit of using Enum over Constants
	 */
	private static void benefitsOfEnumOverConstants() {
		// Enum values are fixed
		simpleEnumExample(S1ThreadStates.START);
		simpleEnumExample(S1ThreadStates.WAITING);
		simpleEnumExample(S1ThreadStates.RUNNING);
		simpleEnumExample(S1ThreadStates.DEAD);
		simpleEnumExample(null);

		simpleConstantsExample(1);
		simpleConstantsExample(2);
		simpleConstantsExample(3);
		simpleConstantsExample(4);
		// we can pass any int constant
		simpleConstantsExample(5);
	}

	private static void simpleEnumExample(S1ThreadStates th) {
		if (th == S1ThreadStates.START)
			System.out.println("Thread started");
		else if (th == S1ThreadStates.WAITING)
			System.out.println("Thread is waiting");
		else if (th == S1ThreadStates.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

	private static void simpleConstantsExample(int i) {
		if (i == S2ThreadStatesTestClass.START)
			System.out.println("Thread started");
		else if (i == S2ThreadStatesTestClass.WAITING)
			System.out.println("Thread is waiting");
		else if (i == S2ThreadStatesTestClass.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

}
/*
 * 
1.We can pass any int constant to the simpleConstantsExample method but we can pass only fixed values to simpleEnumExample, so it provides type safety.
2.We can change the int constants value in ThreadStatesConstant class but the above program will not throw any 
exception. Our program might not work as expected but if we change the enum constants, we will get compile time error that removes any possibility of runtime issues.
*/