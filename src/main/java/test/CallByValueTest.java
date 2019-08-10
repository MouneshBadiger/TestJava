package test;

public strictfp class CallByValueTest {
	  int i=10;
	
	  static public  void main(String[] args) {
		CallByValueTest ob=new CallByValueTest();
		
		System.out.println("before change:i="+ob.i);
		
		ob.changeValue(10);
		
		System.out.println("before change:i="+ob.i);
	}
	void changeValue(int i) {
		i=i+10;
	}

}
