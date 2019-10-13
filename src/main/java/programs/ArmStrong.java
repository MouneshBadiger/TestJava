package programs;

/**
 * @author MOUNESHBADIGERBadige
 *A number is called an Armstrong number if it is equal to the cube of its each digit. 
 *for example, 153 is an Armstrong number because 153= 1+ 125+27 which is equal to 1^3+5^3+3^3

 */
public class ArmStrong {
	
	public static void main(String[] args) {
		if(isArmstrongNumber(153)) {
			System.out.println("Its armstrong");
		}else {
			System.out.println("Its not armstrong");
		}
		
		
	}
	static boolean isArmstrongNumber(int number) {
		int sum=0;
		int temp=number;
		while(temp!=0) {
			int rem=temp%10;
			sum+=rem*rem*rem;
			temp=temp/10;
		}
		return sum==number;
	}

}
