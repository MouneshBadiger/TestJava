package core.collection.hastable;

import java.util.Hashtable;

/**Its same as HasMap excetp below 2 things
1.It does not allow null as key
2.Its methods are syncronised i,e Thread safe and slow*/
public class HashTableTest {
	
	
	public static void main(String[] args) {
		Hashtable<String, String> hTable=new Hashtable<>();;
		//hTable.put(null, "mounesh"); Throws NullPointerException
		hTable.put("1", "mounesh");
		hTable.put("2", "kiran");
		hTable.put("3", "ravi");
		hTable.entrySet().forEach(e->System.out.println(e.getValue()));
	}

}
