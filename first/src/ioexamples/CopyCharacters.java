package ioexamples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class CopyCharacters {
	    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("Inej.txt");
            outputStream = new FileWriter("Jesper.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        
    }
	    /*  
	 public static void main(String[] args) throws IOException {

	        BufferedReader inputStream = null;
	        PrintWriter outputStream = null;

	        try {
	            inputStream = new BufferedReader(new FileReader("Kaz.txt"));
	            outputStream = new PrintWriter(new FileWriter("Nina.txt"));

	            String l;
	            while ((l = inputStream.readLine()) != null) {
	                outputStream.println(l);
	            }
	        } finally {
	            if (inputStream != null) {
	                inputStream.close();
	            }
	            if (outputStream != null) {
	                outputStream.close();
	            }
	        }
	    }
	 */
}