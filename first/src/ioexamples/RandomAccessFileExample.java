package ioexamples;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
	public static void main(String[] args) {
		String filePath = "inej.txt";

		try {

			RandomAccessFile randomFile = new RandomAccessFile(filePath, "rw");
			randomFile.seek(10);
			int number = randomFile.readInt();
			randomFile.seek(125);
			randomFile.writeUTF("Anya");
			System.out.println(randomFile.readLine());
			randomFile.close();

		} catch (IOException ex) {
			System.err.println("I/O Error: " + ex);
		}
	}

}
