package Test;

import java.io.IOException;

class One implements AutoCloseable {
	public void close() throws IOException {
		throw new IOException("Closing");
	}
}

public class TryResource {

	public static void main(String[] args) {
		try (One one = new One()) {
			throw new Exception("Hello Try");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			for (Throwable t : e.getSuppressed()) {
				System.out.println("suppressed:"+ t);

			}
		}
	}
}