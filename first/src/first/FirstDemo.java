package first;

public class FirstDemo {
	
	 byte a;
	 short b;
	 int c;
	 long d;
	 float e;
	 double f;
	 char g;
	 boolean h;
	 String i;
	 
	   public void getDefault() {
		   
		   System.out.println("Default values.....");
		      System.out.println("Byte is = " + a);
		      System.out.println("Short is = " + b);
		      System.out.println("Int is = " + c);
		      System.out.println("Long is = " + d);
		      System.out.println("Float is = " + e);
		      System.out.println("Double is = " + f);
		      System.out.println("Char is = " + g);
		      System.out.println("Boolean is = " + h);
		      System.out.println("String is = " + i);   
	   }
	public static void main(String[] args) {
		
		FirstDemo f = new FirstDemo();
		 f.getDefault();
	   }
}
