package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TempTest {
	public static void main(String[] args) {
		List<String> list=new LinkedList<String>();
		long start=System.currentTimeMillis();
		for(int i=0;i<1000000;i++) {
			list.add("mounesh");
			System.out.println("--adding--");
		}
		long end=System.currentTimeMillis();
		System.out.println("total time taken in ms:"+(end-start)/1000+" Size:"+list.size());
	}

}
