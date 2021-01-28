package ioexamples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;


public class CopyBytes {
	
	public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

 /*       try {
            in = new FileInputStream("Kaz.txt");
            out = new FileOutputStream("Inej.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            
            
            
        }
        */
        try {
            in = new FileInputStream("Kaz.txt");
            out = new FileOutputStream("Inej.txt");
            int c=in.read();

            while (c != -1) {
                out.write(c);
                System.out.println((char)c);
                c=in.read();
            }
           
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
            
            
            
        }
    }
}