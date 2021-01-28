package com.test.io;

import java.util.Scanner;

public class TryWithResource {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);

		} catch (Exception e) {

		} finally {
			if (scanner != null)
				scanner.close();
		}

		try (Scanner s = new Scanner(System.in)) {

		} catch (Exception e) {

		}
	}

}
