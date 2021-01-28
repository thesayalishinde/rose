package com.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
	public static void main(String args[]) throws IOException {
		int size;
		try {
		InputStream f = new FileInputStream("C:/Users/sevenugo/Desktop/awstask.txt");
		System.out.println("Total Available Bytes: " + (size = f.available()));
		int n = size / 40;
		System.out.println("First " + n + " bytes of the file one read() at a time");
		for (int i = 0; i < n; i++) {
			System.out.print((char) f.read());
		}
		System.out.println("\nStill Available: " + f.available());
		System.out.println("Reading the next " + n + " with one read(b[])");
		byte b[] = new byte[n];
		if (f.read(b) != n) {
			System.err.println("couldn't read " + n + " bytes.");
		}
		System.out.println(new String(b, 0, n));
		System.out.println("\nStill Available: " + (size = f.available()));
		System.out.println("Skipping half of remaining bytes with skip()");
		System.out.println(size/0);
		//f.close();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
