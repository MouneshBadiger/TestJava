package programs;

public class Test {
	public static void main(String[] args) {
		StringBuilder str=new StringBuilder("mounesh");
		recursionTest(str,0);
		System.out.println(str);
	}
	
	public static void recursionTest(StringBuilder name,int i) {
		if(i<10) {
			name.append(i);
			recursionTest(name,i+1);
		}
		
	}
	
	public static void testBitwiseOps() {
		int n=0;
		System.out.println("Left Shifting");
		while(n<10) {
			System.out.println(1<<n);//2^count
			n++;
		}
		n=0;
		System.out.println("Right Shifting");
		while(n<10) {
			System.out.println(8>>n);//2^count
			n++;
		}
		System.out.println("Sign bit shift -8");
		System.out.println(-8>>>3);
		System.out.println("Bitwise &");
		System.out.println(3&2);// 00011 & 00010=00010=2
		System.out.println(3|2);// 00011 | 00010=00011=3
	}

}
