package test;
/**Member Inner Class Example*/
public class InnerClassTest {
	
	private String data ="mounesh";
	private String staticData="badiger";
	class InnerLevel1{
		void msg() {System.out.println("---inner class--");}
	}
	
	public static void main(String[] args) {
		//member inner class Test
		InnerClassTest.InnerLevel1 in1=new InnerClassTest().new InnerLevel1();
		in1.msg();
		int data1=10;
		class LocalInner1{
			
			
			void locaInnerTestMethod() {
				System.out.println("executing Method Local Inner class: data="+data1);
			}
		}
		//LocalInner class test
		LocalInner1 lin1=new LocalInner1();
		lin1.locaInnerTestMethod();
		//static Inner class Test
		InnerClassTest.StaticClassTest staticClassTest=new InnerClassTest.StaticClassTest();
		staticClassTest.staticMethod();
		
		//nested Interface test
		Showable.Message nestedInterface=new Showable.Message() {
			public void msg() {System.out.println("--innside of nested interface implementation");};
		};
		nestedInterface.msg();
	}
	
	static class StaticClassTest{
		int staticData=12;
		void staticMethod() {
			System.out.println("--inside of method of StaticClassTest class-- accessing parent static member:"+this.staticData);
		}
	}
	//Example of nested Interface
	interface Showable{  
		  void show();  
		  interface Message{  
		   void msg();  
		  }  
	}  
}

/*Class within Interface=Possible 
Interface within Interface= Possible
Class within Class =Possible*/
interface M{  
	  class A{}  
	}  

/*Nested interface must be public if it is declared inside the interface but it can have any access modifier if declared within the class.
Nested interfaces are declared static implicitely.*/