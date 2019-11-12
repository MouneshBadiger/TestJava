package programs.hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TempCode {
	public static Map<String,Integer> map1=new HashMap<>();
	
	public static void main(String[] args) {
		
	
		
		String S="1A 2A,12A 12A";
		String T="12A";
		int N=12;
		map1.put("A", 0);
		map1.put("B", 1);
		map1.put("C", 2);
		map1.put("D", 3);
		map1.put("E", 4);
		int map[][]=new int[N][N];
		
		
		String hits[]=T.split(" ");
		for(String s:hits) {
			int row=Integer.parseInt(s.substring(0,s.length()-1));
			row--;
			int col=map1.get(s.substring(s.length()-1,s.length()));
			map[row][col]=1;
		}
		String ships[]=S.split(",");
		//actual checks
		int pSunk=0;
		int sunk=0;
		
		for(String sh:ships) {
			String starPoint=sh.split(" ")[0];
			String endPint=sh.split(" ")[1];
			
			int stRow=Integer.parseInt(starPoint.substring(0,starPoint.length()-1));
			stRow--;
			int stCol=map1.get(starPoint.substring(starPoint.length()-1,starPoint.length()));
			
			int endRow=Integer.parseInt(endPint.substring(0,endPint.length()-1));
			endRow--;
			int endCol=map1.get(endPint.substring(endPint.length()-1,endPint.length()));
			
			boolean isSunk=true;
			boolean isHit=false;
			for(int i=stRow;i <=endRow;i++) {
				
				for(int j=stCol;j<=endCol;j++) {
					if(map[i][j]==1) {
						isHit=true;
					}else {
						isSunk=false;
					}
				}
			}
			if(isSunk) {
				sunk++;
			}
			if(isHit) {
				pSunk++;
			}
		}
		pSunk=pSunk-sunk;
		String ret=sunk+","+pSunk;
		System.out.println(ret);
	}
	

}
