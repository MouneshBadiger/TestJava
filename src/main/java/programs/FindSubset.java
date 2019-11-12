package programs;

public class FindSubset {

	public static void main(String[] args) {
		char[] main= {'a','b','c','d'};
		char[] subset=new char[main.length];
		System.out.println(subset[0]=='\u0000');
		findSubset(main,subset,0);
		
	}
	
	static void print(char[] subset) {
		System.out.print("{");
		for(int i=0;i<subset.length;i++) {
			if(subset[i]!='\u0000')
			System.out.print(" "+subset[i]);
		}
		System.out.println("}");
	}
	static void findSubset(char[] main,char[] subset,int i){
		if(i==main.length) {
			print(subset);
		}else {
			subset[i]='\u0000';//not including subset
			findSubset(main,subset,i+1);
			subset[i]=main[i];//including in subset
			findSubset(main,subset,i+1);
		}
		
	}
	

}
