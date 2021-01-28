package ConcurrencyEx;

public class InterruptEx implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		InterruptEx thrd = new InterruptEx();
		Thread u = new Thread(thrd);
		u.start();
		u.interrupt();
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Child Thread is executing");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("InterruptedException occurs");
		}
	}

}
