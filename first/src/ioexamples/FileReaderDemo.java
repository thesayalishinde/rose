package com.test.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String args[]) throws IOException {
		FileReader fr = new FileReader("C:/Users/sevenugo/Documents/Codility/Code/io/FileInputStreamDemo.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
		}
		fr.close();
	}
}
