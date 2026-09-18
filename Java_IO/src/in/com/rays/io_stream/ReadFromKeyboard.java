package in.com.rays.io_stream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ReadFromKeyboard {
	public static void main(String[] args) throws IOException {

		PrintWriter out = new PrintWriter(new FileWriter("D:\\IO_Stream\\Test.txt"));
		System.out.println("start writing your text here....");
		InputStreamReader kb = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(kb);
		String line = in.readLine();
		while (!line.equals("exit")) {
			out.println(line);          // write line in the file
			line = in.readLine();      // read next line
		}

		in.close();
		out.close();
		kb.close();

	}
}
