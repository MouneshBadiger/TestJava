package programs;

public class FindPrime{
	
	public static void main(String[] args) {
		int no=13;
		checkISPrime(no);
		
	}
	public static void checkISPrime(int no) {
		for(int i=2;i<no;i++) {
			if(no%i==0) {
				System.out.println("Its a not prime number");
				return;
			}
		}
		System.out.println("Its a prime number");
		return;
	}

}
