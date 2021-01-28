package ConcurrencyEx;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorService {
	public static void main(String[] args) {
		java.util.concurrent.ExecutorService service = null;
		try {
			service = Executors.newSingleThreadExecutor();
			System.out.println("begin");
			service.execute(() -> System.out.println("Printing  inventory"));
			service.execute(() -> {
				for (int i = 0; i < 3; i++)
					System.out.println("Printing record: " + i);
			});
			service.execute(() -> System.out.println("Printing  inventory"));//“fire-and-forget
			System.out.println("end");
		} finally {
			if (service != null)
				service.shutdown();
		}
	}
}