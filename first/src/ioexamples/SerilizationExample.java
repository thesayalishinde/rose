package ioexamples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import Employee;

public class SerilizationExample extends Employee {
	public static void main(String[] args) {

		Employee obj = new Employee(11, "santhosh", 30, "pune",888888);
		try {
			FileOutputStream fos = new FileOutputStream("Employee.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			oos.close();
			fos.close();
			System.out.println("Serialzation Done!!");
		} catch (IOException ioe) {
			System.out.println(ioe);
		}
	}
}