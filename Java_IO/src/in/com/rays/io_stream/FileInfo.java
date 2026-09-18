package in.com.rays.io_stream;

import java.io.File;
import java.util.Date;

public class FileInfo {
	public static void main(String[] args) {
		File file = new File("D://IO_Stream//Test.txt");
		if(file.exists()) {
			System.out.println("File Name: "+file.getName());
			System.out.println("File Path: "+file.getAbsolutePath());
			System.out.println("---------Access Permission---------");
			System.out.println("Writable: "+file.canWrite());
			System.out.println("Readable: "+file.canRead());
			System.out.println("----check if it is a folder/directory or a file----");
			System.out.println("Is File: "+file.isFile());
			System.out.println("Is folder/directory: " + file.isDirectory());
			System.out.println("---Last modified date of file, folder/directory---");
			Date lastModifiedDate = new Date(file.lastModified());
			System.out.println("lastModifiedDate: "+ lastModifiedDate);
			System.out.println(file.length());
		}else {
			System.out.println("File not Found");
		}
	}

}
