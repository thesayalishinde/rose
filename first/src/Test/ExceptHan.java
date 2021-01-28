package Test;

import java.util.Scanner;

public class ExceptHan {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter your age ");
		System.out.println("");
		
		try {
		int x = s.nextInt();
		if(x<18) {
			throw new CustomEx();
		}
		}catch(CustomEx e){
			System.out.println(e.getMessage());
		}
		
}
}

	