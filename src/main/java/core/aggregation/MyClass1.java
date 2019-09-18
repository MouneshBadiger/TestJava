package core.aggregation;

public class MyClass1 {

	
	MyClass2 myClass2;
	
	MyClass1(MyClass2 myClass2){
		this.myClass2=myClass2;
	}
	
	void myMethod2() {
		System.out.println("----Inside of mymethod2---");
		myClass2.myMethod();
	}

}
