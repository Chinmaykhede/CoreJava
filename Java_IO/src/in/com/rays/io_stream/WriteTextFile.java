package in.com.rays.io_stream;

import java.io.FileWriter;
import java.io.IOException;
//FileWriter is a character stream class in I/O stream
//it is used to write character / text data into a file

public class WriteTextFile {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("D://IO_Stream//Test.txt", true);
		file.write("Hello Chinmay");
		System.out.println("text data write successfully");
		file.close();
	}

}
