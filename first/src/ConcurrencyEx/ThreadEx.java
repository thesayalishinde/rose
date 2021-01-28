package ConcurrencyEx;

import java.util.Arrays;
import java.util.List;

public class ThreadEx implements Runnable {

	public void run() {
		System.out.println("Hello :" + Thread.currentThread().getName() + " Heyy....");
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println();
		ThreadEx t = new ThreadEx();
		Thread r = new Thread(t);
		r.start();
		r.setName("Example Thread");
		System.out.println("Thread Id : " + r.getId() + "  Thread Name : " + r.getName());
		System.out.println("Thread isAlive? : " + r.isAlive());
		System.out.println("Thread Priority : " + r.getPriority());
		System.out.println("Thread State : " + r.getState());

		String[] rats = { "Inej", "kaz", "Jesper" };
		List<String> l = Arrays.asList(rats);

		System.out.println("Thread State : " + r.getState());

		for (String x : l) {
			Thread.sleep(3000);
			System.out.print(x + " ");
		}
		System.out.println();

		System.out.println(Thread.currentThread().getId());
		
		MyClass thrd = new MyClass();
		Thread u = new Thread(thrd);
		u.setPriority(Thread.MAX_PRIORITY);
		u.start();
		
		// u.interrupt();
		Thread.yield();

		System.out.println("Main thread execution completes");

	}

}

class MyClass extends ThreadEx {
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