package ioexamples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class Deserialization extends Employee {
	public static void main(String[] args) {
	    Employee emp=null;
	    try{
	      FileInputStream fis = new FileInputStream("Employee.txt");
	      ObjectInputStream ois = new ObjectInputStream(fis);
	      emp = (Employee)ois.readObject();
	      ois.close();
	      fis.close();
	    }
	    catch(IOException ioe)
	    {
	       ioe.printStackTrace();
	       return;
	    }catch(ClassNotFoundException cnfe)
	     {
	       System.out.println("Employee Class is not found.");
	       cnfe.printStackTrace();
	       return;
	     }
	    System.out.println("emp id :" + emp.getEmployeeId() + "\temployee Name:" + emp.getName() + "--age-"
				+ emp.getAge() + "\taddress-" + emp.getAddress());	
	}
}
