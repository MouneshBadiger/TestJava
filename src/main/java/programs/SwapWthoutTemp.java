package programs;

public class SwapWthoutTemp {
	
		public static void main(String[] args) {
			int x=15,y=20;
			System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
		      x = x + y;
		      y = x - y;
		      x = x - y;
		      System.out.println("After Swapping without third variable\nx = "+x+"\ny = "+y);
		}

}
