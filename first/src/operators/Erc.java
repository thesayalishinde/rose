package operators;

import java.util.Scanner;

public class Erc {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("");
		System.out.println("Enter the two numbers to perform operations ");
		System.out.println("");
		System.out.print("Enter the first number : ");
		int x = s.nextInt();
		System.out.print("Enter the second number : ");
		int y = s.nextInt();
		
		s.close();
		
/*		if(x == y) 
            System.out.println(x+" == "+y);
        if(x != y)
            System.out.println(x+" != "+y);
        if(x > y)
            System.out.println(x+" > "+y);
        if(x < y)
            System.out.println(x+" < "+y);
        if(x<= y)
            System.out.println(x+" <= "+y);
        
      
        
        if((x > y) && ( x == y))
            System.out.println(" Both Expressions are true ");
        else
        	System.out.println(" Only one expression is true ");
        
        if((x > y) || ( x == y))
            System.out.println(" Only one expression is true ");
        else
        	System.out.println(" Returns True ");
 */         
        
        String msg = x > y 
        		  ? x+ " is greater "+y 
        		  : x+ " is less than or equal "+y;
        System.out.println(msg);
        
        String mssg = x > y 
      		  ? x+ " is greater "+y 
      		  :x == y? x+ " is equal to "+y: x+ " is less than"+y;
     
        System.out.println(mssg);
        
        
        
        
	}
}
