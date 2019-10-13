package test;

public class TempTest{
	
	
	static public  void main(String[] args){
		TestMe t=new TestMe();
		System.out.println(t.m(1));
	}
	

}

 class TestMe<T>{
	  <K extends Number,U,L,M,N,O,P> U  m(K k) {
		 System.out.println(k);
		 Integer i=(Integer)k;
		 i=i*100;
		 U u=(U)i;
		return u;
	 }
 }