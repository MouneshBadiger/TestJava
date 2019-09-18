
package core.collection.enumtest;

import java.io.IOException;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Set;

public class S4JavaEnumExamples {

	public static void main(String[] args) throws IOException {
				
		usingEnumMethods();
		System.out.println();
		usingEnumValueOf();
		System.out.println();
		usingEnumValues();
		System.out.println();
		usingEnumInSwitch(S3ThreadStatesEnum.START);
		System.out.println();
		usingEnumInSwitch(S3ThreadStatesEnum.DEAD);
		System.out.println();
		
		usingEnumMap();
		System.out.println();
		usingEnumSet();
		
	}

	private static void usingEnumSet() {
		EnumSet<S3ThreadStatesEnum> enumSet = EnumSet.allOf(S3ThreadStatesEnum.class);
		for(S3ThreadStatesEnum tsenum : enumSet){
			System.out.println("Using EnumSet, priority = "+tsenum.getPriority());
		}
	}

	private static void usingEnumMap() { 
		EnumMap<S3ThreadStatesEnum, String> enumMap = new EnumMap<S3ThreadStatesEnum,String>(S3ThreadStatesEnum.class);
		enumMap.put(S3ThreadStatesEnum.START, "Thread is started");
		enumMap.put(S3ThreadStatesEnum.RUNNING, "Thread is running");
		enumMap.put(S3ThreadStatesEnum.WAITING, "Thread is waiting");
		enumMap.put(S3ThreadStatesEnum.DEAD, "Thread is dead");
		
		
		Set<S3ThreadStatesEnum> keySet = enumMap.keySet();
		for(S3ThreadStatesEnum key : keySet){
			System.out.println("key="+key.toString()+":: value="+enumMap.get(key));
		}
		
	}

	private static void usingEnumInSwitch(S3ThreadStatesEnum th) {
		switch (th){
		case START:
			System.out.println("START thread");
			break;
		case WAITING:
			System.out.println("WAITING thread");
			break;
		case RUNNING:
			System.out.println("RUNNING thread");
			break;
		case DEAD:
			System.out.println("DEAD thread");
		}
	}

	private static void usingEnumValues() {
		S3ThreadStatesEnum[] thArray = S3ThreadStatesEnum.values();
		
		for(S3ThreadStatesEnum th : thArray){
			System.out.println(th.toString() + "::priority="+th.getPriority());
		}
	}

	private static void usingEnumValueOf() {
		S3ThreadStatesEnum th = Enum.valueOf(S3ThreadStatesEnum.class, "START");
		System.out.println("th priority="+th.getPriority());
	}

	private static void usingEnumMethods() throws IOException {
		S3ThreadStatesEnum thc = S3ThreadStatesEnum.DEAD;
		System.out.println("priority is:"+thc.getPriority());
		
		thc = S3ThreadStatesEnum.DEAD;
		System.out.println("Using overriden method."+thc.toString());
		
		thc = S3ThreadStatesEnum.START;
		System.out.println("Using overriden method."+thc.toString());
		thc.setPriority(10);
		System.out.println("Enum Constant variable changed priority value="+thc.getPriority());
		thc.close();
	}

}
