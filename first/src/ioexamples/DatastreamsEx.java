package ioexamples;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DatastreamsEx {
	
	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = {
	    "Java T-shirt",
	    "Java Mug",
	    "Duke Juggling Dolls",
	    "Java Pin",
	    "Java Key Chain"
	};
	
	public static void main (String args[]) throws IOException {
	
		
		try ( DataOutputStream out = 
                new DataOutputStream(new FileOutputStream("invoicedata")) ) 
    { 
			for (int i = 0; i < prices.length; i ++) {
			    out.writeDouble(prices[i]);
			    out.writeInt(units[i]);
			    out.writeUTF(descs[i]);
			}
    } 
      
    catch(EOFException ex) 
    { 
        System.out.println(ex.getMessage()); 
        return; 
    }
		
		try ( DataInputStream in = 
                new DataInputStream(new FileInputStream("invoicedata")) ) 
    { 
			double price;
			int unit;
			String desc;
			double total = 0.0;
			while (true) {
				
		        price = in.readDouble();
		        unit = in.readInt();
		        desc = in.readUTF();
		        System.out.format("You ordered %d" + " units of %s at $%.2f%n",
		            unit, desc, price);
		        total = total+ (unit * price);
		    }
    } 
    catch(EOFException e) 
    { 
        System.out.println(e.getMessage()); 
        return; 
    } 
		
	}
}
	
