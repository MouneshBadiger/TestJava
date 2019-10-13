package core.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SerializationTest {
	
	public static void main(String[] args) {
		List<String> list=Arrays.asList("Mounesh","Moun","Mouni","Monu");
		saveObjectToCache(list);
		
		List<String> ll=(List<String>) readObjectFromCache();
		ll.forEach(System.out::println);
	}
	
	 public static boolean saveObjectToCache(Object object){
	        try{
	            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\serialized.bin"));
	            oos.writeObject(object);
	            oos.close();
	        }catch (Exception e){
	            return false;
	        }
	        return true;
	    }
	    public static  Object readObjectFromCache(){
	        Object ob=null;
	        try{
	            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\serialized.bin"));
	            ob=ois.readObject();
	            ois.close();
	        }catch (Exception e){
	            return null;
	        }
	        return ob;
	    }

}
