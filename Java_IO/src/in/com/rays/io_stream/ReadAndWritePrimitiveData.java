package in.com.rays.io_stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWritePrimitiveData {
	public static void main(String[] args) throws IOException {
		DataOutputStream out = new DataOutputStream(new FileOutputStream("D:\\IO_Stream\\primitive.txt"));// DataOutputStream se primitive data file me write karta hai.
		out.writeInt(5);
		out.writeBoolean(false);
		out.writeDouble(23.45);
		out.writeChar('C');
		out.close();
		System.out.println("data added......");
		
		
		DataInputStream in = new DataInputStream(new FileInputStream("D://IO_Stream//primitive.txt")); //DataInputStream → file se data read

		System.out.println(in.readInt());
		System.out.println(in.readBoolean());
		System.out.println(in.readDouble());
		System.out.println(in.readChar());

		in.close();

	}

}
