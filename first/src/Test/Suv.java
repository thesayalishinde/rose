package Test;

public class Suv implements Vehicle {

	int gear, speed;
	
	@Override
	public void changeGear(int g) {
		gear= g;
		
	}

	@Override
	public void speedUp(int si) {
		speed = speed + si;
		
	}

	@Override
	public void applyBrakes(int sd) {
		speed = speed + sd;
		
	}
	
	public void printStates() { 
        System.out.println("speed: " + speed 
            + " gear: " + gear); 
   } 
	
	public static void main (String[] args) { 
	      
      
        Suv su = new Suv(); 
        su.changeGear(3); 
        su.speedUp(6); 
        su.applyBrakes(2); 
          
        System.out.println("Suv present state :"); 
        su.printStates(); 
      
    } 
}
