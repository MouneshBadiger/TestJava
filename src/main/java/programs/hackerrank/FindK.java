package programs.hackerrank;

import java.util.Arrays;

public class FindK {
	
	public static void main(String[] args) {
		int[][] arr= {{3,3,3},{1,5,14},{2,5,15},{2,5,15},{2,5,15},{2,5,15},{2,5,15},{2,5,15},{2,5,15},{2,5,15}};
		String str[]= {"aaaaa","bbbbb","cccccc","dddddd","eeeeeeee"};
		System.out.println(Arrays.toString(findK(arr,str)));
		
	}
	public static char[] findK(int[][] arr,String str[]) {
		char[] ch=new char[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			int l=arr[i][0]-1;
			int r=arr[i][1]-1;
			int k=arr[i][2]-1;
			
			String temp="";
			for(int m=l;m<=r;m++) {
				temp+=str[m];
			}
			char tempCh[]=temp.toCharArray();
			Arrays.sort(tempCh);
			temp=new String(tempCh);
			ch[i]=temp.charAt(k);
		}
		
		return ch; 
	}
	
	
}
