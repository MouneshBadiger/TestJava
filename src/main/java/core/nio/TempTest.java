package core.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TempTest{
	
	
	static public  void main(String[] args){
		try {
			Files.list(Paths.get("C:\\Users\\mbadiger\\JDEV_USER_HOME\\DiagnosticsClients"))
	        .forEach(p->{
	        	System.out.println(p);
	        });
			
			//Stream<String> str=Files.lines(Paths.get("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\env_file.env"));
			//str.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
