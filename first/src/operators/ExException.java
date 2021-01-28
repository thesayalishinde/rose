package operators;

public class ExException {

	static void throwOne() throws IllegalAccessException {
		System.out.println("Inside throwOne.");
		throw new IllegalAccessException("demo");
	}

	/*
	 * static void foo() {
	 * 
	 * 
	 * try { throw new
	 * NullPointerException("Throwing exception explicity foo method of ThrowExample"
	 * ); } catch (NullPointerException e) {
	 * System.out.println("Caught inside foo."+ e.getMessage()); throw new
	 * ArithmeticException(); // rethrowing the exception }
	 * catch(ArithmeticException e) { throw e; } }
	 */
	public static void main(String[] args) {

		/*
		 * String str=null; try { System.out.println(str.equals("hello")); }
		 * //System.out.println("Hey"); catch(NullPointerException e) {
		 * System.out.println(e.getMessage()); } catch(Exception e) {
		 * System.out.println(e); } finally { System.out.println("Hey"); }
		 * 
		 * try { foo(); } catch (NullPointerException e) {
		 * System.out.println("Caught in main."); }
		 */
		try {
			throwOne();
		} catch (IllegalAccessException e) {
			System.out.println("Caught " + e);
		}
		
		
		
		
	}

}
