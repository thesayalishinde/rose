package com.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {
	public static void main(String args[]) throws IOException {
		String source = "Now is the time for all good men\n"
				+ " to come to the aid of their country\n"
				+ " and pay their due taxes.";
		byte buf[] = source.getBytes();
		OutputStream f0 = new FileOutputStream(
				"C:/Users/sevenugo/Documents/Codility/Code/io/FileInputStreamDemo.txt");
		for (int i = 0; i < buf.length; i += 2) {
			f0.write(buf[i]);
		}
		f0.close();
		OutputStream f1 = new FileOutputStream("file1.txt");
		f1.write(buf);
		f1.close();
	}
}
