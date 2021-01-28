package Test;

import java.util.Scanner;

public class GenericEx <T>{
	T o;
	
	void dummy(T o) {
		this.o=o;
		
	}
	T getData() {
		return o;
	}
	void yourName() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter you Name: ");
		String x = s.next();
		System.out.println(x);
		}
	
	void add(T a, T b) {
		int c = a + b;
		
	}
	public static void main(String[] args) {
		GenericEx<String> g = new GenericEx<String>();
		g.dummy("Hello");
		System.out.println(g.getData());
		g.yourName();
	}
}
