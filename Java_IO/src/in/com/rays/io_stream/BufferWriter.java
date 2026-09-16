package in.com.rays.io_stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriter {
	public static void main(String[] args)throws IOException {
		BufferedWriter file = new BufferedWriter(new FileWriter("D://IO_Stream//Buffered.txt"));
		file.write("public class Hello{");
		file.newLine();
		file.write("public static void main(String[] args){");
		file.newLine();
		file.write("System.out.println('Hello Java');}}");
		System.out.println("text data write successfully");
		file.close();
	}

}
