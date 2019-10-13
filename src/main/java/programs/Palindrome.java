package programs;

public class Palindrome {
	
	public static void main(String[] args) {
		checkIsPalindrome("bab");
		checkIsPalindrome(1211);
		
	}
	public static void checkIsPalindrome(String str) {
		char[] ch=str.toCharArray();
		int n=ch.length;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=ch[n-1-i]) {//compare both ends --->   <----
				System.out.println("Its not a palindrome");
				return;
			}
		}
		System.out.println("Its a palindrome");
	}
	public static void checkIsPalindrome(int no) {
		
		if(no==reverseNumber(no)) {
			System.out.println("Its a palindrome");
		}else {
			System.out.println("Its not a palindrome");
		}
		
	}
	public static int reverseNumber(int no) {
		int temp=0;
		
		while(no%10>0) {
			int rem=no%10;
			temp=temp*10+rem;
			no=no/10;
		}
		
		
		return temp;
	}
	

}
