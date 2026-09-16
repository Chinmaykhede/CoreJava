package in.com.rays.io_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader file = new BufferedReader(new FileReader("D://IO_Stream//Buffered.txt"));
		String line = file.readLine();
		while (line != null) {
			System.out.println(line);
			line=file.readLine();
		}
		file.close();
	}

}
