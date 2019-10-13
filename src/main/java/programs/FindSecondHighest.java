package programs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindSecondHighest {
	
	
	public static int secHighest(int a[]) {
		
		int max=Integer.MIN_VALUE;
		int secMax=max;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secMax=max;
				max=a[i];
			}
			if(a[i]>secMax && a[i]<max) {//condition for handling last number in array
				secMax=a[i];
			}
		}
		
		if(max==secMax) {
			throw new RuntimeException("No second highest found, invalid input");
		}
		return secMax;
	}
	
	@Test
	public void testSecHigest() {
		int a[]= {2,4,7,3,9,8};
		assertEquals(8, secHighest(a));
	}
	@Test
	public void testSecHigest1() {
		int a[]= {2,1};
		assertEquals(1, secHighest(a));
	}

	@Test(expected = RuntimeException.class)
	public void testSecHigest2() {
		int a[] = {};
		assertEquals(8, secHighest(a));
	}
	 

}
