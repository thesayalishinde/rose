package Test;

public class CustomEx extends Exception {
	
	
	CustomEx(){
		super("Age not Applicable, Only above 18 Allowed");
	}
	
	public CustomEx(String message){
		super(message);
	}
}