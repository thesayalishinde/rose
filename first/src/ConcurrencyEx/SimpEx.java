package ConcurrencyEx;

public class SimpEx implements Runnable {
	
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i%10==0)
				System.out.println("Hey");
		}
		
		
	}
	public static void main(String[] args) {
		SimpEx t = new SimpEx();
		Thread t1 = new Thread(t);
		t1.start();

	}

}
