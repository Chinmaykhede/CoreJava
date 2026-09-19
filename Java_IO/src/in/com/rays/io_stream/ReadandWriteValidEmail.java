package in.com.rays.io_stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadandWriteValidEmail {
	public static void main(String[] args) throws Exception {
		FileReader source = new FileReader("D://IO_Stream//Email.txt");

		BufferedReader br = new BufferedReader(source);
		BufferedWriter gmailWriter = new BufferedWriter(new FileWriter("D://IO_Stream//ValidGmail.txt"));
		BufferedWriter outlookWriter = new BufferedWriter(new FileWriter("D://IO_Stream//ValidOutlook.txt"));
		BufferedWriter yahooWriter = new BufferedWriter(new FileWriter("D://IO_Stream//ValidYahoo.txt"));
		BufferedWriter hotmailWriter = new BufferedWriter(new FileWriter("D://IO_Stream//ValidHotmail.txt"));

		String email = br.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {
				System.out.println(email);
				gmailWriter.write(email);
				gmailWriter.newLine();
			} else if (email.endsWith("@outlook.com")) {
				System.out.println(email);
				outlookWriter.write(email);
				outlookWriter.newLine();
			} else if (email.endsWith("@yahoo.com")) {
				System.out.println(email);
				yahooWriter.write(email);
				yahooWriter.newLine();
			} else if (email.endsWith("@hotmail.com")) {
				System.out.println(email);
				hotmailWriter.write(email);
				hotmailWriter.newLine();
			}
				email = br.readLine();
			}

			br.close();
			gmailWriter.close();
			outlookWriter.close();
			yahooWriter.close();
			hotmailWriter.close();

		}
	}

