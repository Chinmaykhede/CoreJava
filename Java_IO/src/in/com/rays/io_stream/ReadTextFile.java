package in.com.rays.io_stream;

import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("D://IO_Stream//Test.txt");
	   int i = file.read();
	   while(i !=-1) {
		  System.out.println((char)i + " = "+i);
		  i=file.read();
	   }
	   file.close();
	}

}
