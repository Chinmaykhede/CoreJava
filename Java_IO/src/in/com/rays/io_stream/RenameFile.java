package in.com.rays.io_stream;

import java.io.File;

public class RenameFile {
	public static void main(String[] args) {
	File file = new File("D://IO_Stream//Test.txt");
	file.renameTo(new File("D://IO_Stream//Rays.txt"));
	System.out.println("File Rename...");
	}

}
