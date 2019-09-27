package core.inheritance;
/**Senario:
A ChildClass class extending Super Class and also implementing some interfaces
* If there are same state and behavior i,e properties and Methods
1.In case of methods it compiles fine and the Implementation is used based on Object invocation at runtime.
2.Compiler fail to compile if there are same property in both super class and Interface
 i,e The field name is ambiguous*/
interface Interface3{
	String name="BigBazar-";
	String shopRegNumber="KAR1234";
	default String createProductId() {
		return "12345";
	}
}
abstract class  AbstSoap{
	String name="soap-";
	
	public abstract String createProductId();
	
}

class ConcClass extends AbstSoap implements Interface3{
	//String name="Dove";
	
	
	@Override
	public String createProductId() {
		return super.name+"-"+System.currentTimeMillis();
		
	}
}
public class AbstractClassTest {
	
	public static void main(String[] args) {
		Interface3 bo=new ConcClass();
		System.out.println(bo.createProductId());
	}

}