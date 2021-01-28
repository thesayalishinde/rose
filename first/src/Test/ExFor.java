package Test;

import java.util.Scanner;

public class ExFor {

	public static void main(String[] args) {
		int i, j, a;
		
		/*
		 * for (i = 0; i < 5; i++) { for (j = 0; j <= i; j++) { System.out.print("* ");
		 * } System.out.println(); }
		 */
		
		/*		for (i = 0; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.print(i + " is divisible by 3 \n");
			}
*/			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter an integer ");

			a = sc.nextInt();
			
			for(i=1; i<=10; i++) {
				
				System.out.println(+a+"*"+i+"="+a*i);
			}
		
			int[] array=new int[20];
			
			
		}
	}


