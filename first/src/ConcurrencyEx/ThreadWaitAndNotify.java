package ConcurrencyEx;

public class ThreadWaitAndNotify extends Thread {
	Calculator c;

	public ThreadWaitAndNotify(Calculator calc) {
		c = calc;
	}

	public void run() {
		synchronized (c) {
			try {
				System.out.println("Waiting for calculation...");
				System.out.println("---:" + Thread.currentThread().getName());
				c.wait();

			} catch (InterruptedException e) {
			}
			System.out.println("Total is: " + c.total);
		}
	}

	public static void main(String[] args) {
		System.out.println("---:" + Thread.currentThread().getName());
		Calculator calculator = new Calculator();
		new ThreadWaitAndNotify(calculator).start();
		new ThreadWaitAndNotify(calculator).start();
		new ThreadWaitAndNotify(calculator).start();
		new Thread(calculator).start();
	}
}

class Calculator implements Runnable {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 0; i < 100; i++) {
				total += i;
			}
			notifyAll();
		}
	}
}