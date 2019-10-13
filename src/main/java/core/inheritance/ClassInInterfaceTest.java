package core.inheritance;

public class ClassInInterfaceTest {
	
	public static void main(String[] args) {
		Outer1.Inner1 bo=new Outer1.Inner1();
	}

}
interface Outer1 {
  public abstract void show(); 
  static class Inner1      
  {                                
    public void display()
    {
      System.out.println("Hello 1");
    } 
  }
}
 
class Test extends Outer1.Inner1 implements Outer1
{
  public void show()
  {
    System.out.println("Hello 2");
  } 
  public static void main(String args[])
  {
    Test t1 = new Test();
    t1.display();                
    t1.show();      
  }
}