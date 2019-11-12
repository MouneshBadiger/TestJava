package core.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.file.CopyOption;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest {

	
	public static void main(String[] args) throws FileNotFoundException {
		//to Change Standard Out and Error Stream to a file
		//System.setOut(new PrintStream(new FileOutputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\general_out.txt")));
		//System.setErr(new PrintStream(new FileOutputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\error_out.txt")));
		try {
		Path p1=Paths.get("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\env_file.env");
		System.out.println(p1.getRoot());
		System.out.println(p1.toUri());
		//check if file exists
		boolean isExist=Files.exists(p1, LinkOption.NOFOLLOW_LINKS);
		System.out.println(isExist);
		//check read or write access
		System.out.println(Files.isReadable(p1));
		System.out.println(Files.isWritable(p1));
		System.out.println(Files.isSameFile(p1, p1));
		
		//You can delete files, directories or links. 
		//With symbolic links, the link is deleted and not the target of the link. 
		//With directories, the directory must be empty, or the deletion fails.
		//Files.delete(p1);
		//Files.deleteIfExists(p1);
		
		
		//copy(InputStream, Path, CopyOptions...) method may be used to copy all bytes from an input stream to a file. 
		//The copy(Path, OutputStream) method may be used to copy all bytes from a file to an output stream.
		Path p2=Paths.get("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\testout.txt");
		//Files.createFile(p2);
		
		//Files.copy(p1, p2, LinkOption.NOFOLLOW_LINKS);
		InputStream is=new FileInputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\env_file.env");
		Files.copy(is, p2,StandardCopyOption.REPLACE_EXISTING);
		
		OutputStream os=new FileOutputStream("C:\\Users\\MOUNESHBADIGERBadige\\Desktop\\io\\testout.txt");
		Files.copy(p1, os);
		
		//You can move a file or directory by using the move(Path, Path, CopyOption...) 
		
		
		
		
		
		
		}catch (NoSuchFileException x) {
		    System.err.format("%s: no such" + " file or directory%n", x.getFile());
		} catch (DirectoryNotEmptyException x) {
		    System.err.format("%s not empty%n", x.getFile());
		} catch (IOException x) {
		    // File permission problems are caught here.
		    System.err.println(x);
		}
		
	}
}
