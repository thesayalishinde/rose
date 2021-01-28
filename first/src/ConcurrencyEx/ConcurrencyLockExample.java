package ConcurrencyEx;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConcurrencyLockExample implements Runnable {

	private ResourceTest resource;
	private Lock lock;

	public ConcurrencyLockExample(ResourceTest r) {
		this.resource = r;
		this.lock = new ReentrantLock();
	}

	@Override
	public void run() {
		try {
			if (lock.tryLock(10, TimeUnit.SECONDS)) {
				resource.doSomething();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			// release lock
			lock.unlock();
		}
		resource.doLogging();
	}

	public static void main(String[] args) {
		ResourceTest t = new ResourceTest();
		new Thread(new ConcurrencyLockExample(t)).start();
		new Thread(new ConcurrencyLockExample(t)).start();
	}
}
