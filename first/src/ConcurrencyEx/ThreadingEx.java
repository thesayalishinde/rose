package ConcurrencyEx;

public class ThreadingEx implements Runnable {

/*	ThreadingEx th = new ThreadingEx();

	public void print() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 5; i++) {
			System.out.println(i);

		}
	}

	public void run() {

		th.print();

	}
*/
	public void run() {
		Thread.yield();
		System.out.println("Thread Name : " + Thread.currentThread().getName() +
				" Thread Priority : " + Thread.currentThread().getPriority());
	}
	
	
	public static void main(String[] args) {

		ThreadingEx t = new ThreadingEx();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t4.setPriority(Thread.NORM_PRIORITY);
		
		t1.setName("Kaz");
		t2.setName("Matt");
		t3.setName("Inej");
		t4.setName("Jesper");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		
		
	}

}
