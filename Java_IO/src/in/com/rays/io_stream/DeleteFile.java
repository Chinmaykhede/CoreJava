package in.com.rays.io_stream;

import java.io.File;

public class DeleteFile {
	public static void main(String[] args) {
		File file = new File("D://IO_Stream//Rays.txt");
		file.delete();
		System.out.println("File Deleted....");
	}

}
