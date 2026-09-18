package in.com.rays.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSerializable {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Account a = new Account("8376744585890", 87660.01);
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://IO_Stream//Account.txt"));

		// Convert Account class object into byte stream: serialization

		out.writeObject(a);
		out.close();
		System.out.println("object serialized successfully");
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://IO_Stream//Account.txt"));

		// Convert byte stream into Account class object: deserialization
		System.out.println(in.readObject());

		in.close();

	}

}
	
