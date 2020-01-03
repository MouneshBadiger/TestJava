package programs.array;

import java.util.Arrays;

public class Segregate0and1s {

	public static void main(String[] args) {
		//int a[]= {1,0,1,0,1,0,1,1,1,0,0,1,1,0,0,0,1,1};
		int a[]= {0,0,0,0,0,0,0};
		
		int i=0,j=a.length-1;
		int c=0;
		while(i<j) {
			if(a[i]==1 && a[j]==0) {//if both are incorrect exchange
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}else if(a[i]==0) {//i is correct j is wrong
				i++;
			}else if(a[i]==1) {//i is wrong j is correct
				j--;
			}else {//i and j both are correct
				i++;
				j--;
			}
			System.out.println(++c+" "+a.length);
			System.out.println("i="+i+"j="+j);
		}
		System.out.println(Arrays.toString(a));
	}

}
