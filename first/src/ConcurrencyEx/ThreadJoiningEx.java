package ConcurrencyEx;

public class ThreadJoiningEx implements Runnable {

	public static void main(String[] args) {
		
		 ThreadJoiningEx t = new ThreadJoiningEx(); 
		 Thread t1 = new Thread(t);
			Thread t2 = new Thread(t);
			Thread t3 = new Thread(t);
		 
	        // thread t1 starts 
	        t1.start(); 
	  
	        // starts second thread after when 
	        // first thread t1 has died. 
	        try
	        { 
	            System.out.println("Current Thread: "
	                  + Thread.currentThread().getName()); 
	            t1.join(); 
	        } 
	  
	        catch(Exception ex) 
	        { 
	            System.out.println("Exception has " + 
	                                "been caught" + ex); 
	        } 
	  
	        // t2 starts 
	        t2.start(); 
	  
	        // starts t3 after when thread t2 has died. 
	        try
	        { 
	            System.out.println("Current Thread: "
	                 + Thread.currentThread().getName()); 
	            t2.join(); 
	        } 
	  
	        catch(Exception ex) 
	        { 
	            System.out.println("Exception has been" + 
	                                    " caught" + ex); 
	        } 
	  
	        t3.start(); 

	}

	@Override
	public void run() {
		for (int i = 0; i < 2; i++) 
        { 
            try
            { 
                Thread.sleep(500); 
                System.out.println("Current Thread: "
                        + Thread.currentThread().getName()); 
            } 
  
            catch(Exception ex) 
            { 
                System.out.println("Exception has" + 
                                " been caught" + ex); 
            } 
            System.out.println(i); 
		
	}

}
}
