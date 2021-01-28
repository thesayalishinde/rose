package first;

public class Variables {
	int a;
	
	 int localVar(){
		  int a=this.a;
			return a;
			
		}
	 
	 public static void main(String[] args) {
		    Variables x = new Variables();
			
		    System.out.println(x.localVar());
			
		}
}
