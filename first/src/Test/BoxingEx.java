package Test;

import java.util.Date;

public class BoxingEx {
	public static void main(String args[]) {
		// Converting int into Integer
		int a = 20;
		Integer i = Integer.valueOf(a);// converting int into Integer
		Integer j = a;// autoboxing, now compiler will write Integer.valueOf(a)
		// internally
		//valueOf() method to facilitate the conversion

		 System.out.println(a + " " + i + " " + j);

			Runtime rt = Runtime.getRuntime();
			System.out.println("total jvm mem:" + rt.totalMemory() + "-freeMemory--" + rt.freeMemory());
			Date d = null;
			for(int i1=0;i1<100;i1++) {
			d=new Date();
			d=null;
			}
			System.out.println("total jvm mem" + rt.totalMemory() + "-freeMemory--" + rt.freeMemory());
			rt.gc(); //System.gc()
			System.out.println("total jvm mem" + rt.totalMemory() + "-freeMemory--" + rt.freeMemory());
		
		}
}

	