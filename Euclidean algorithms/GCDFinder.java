package chapter1;


public class GCDFinder {
	
	
	
	/**
	 * This method takes two positive integers and finds their gcd using 
	 * Euclid's algorithm
	 * @param a
	 * @param b
	 * @return
	 */
	public int gcd(int a, int b) {
		/*
		Step 1 - First the number is put into the method
		Step 2 - Then it is checked if it is b is = 0
		Step 3 - gcd(b,a%b); a is devided by b to see reminder and b becomes the new a
		step 4 - repeated till reminder = 0
		 */
		if (b == 0)
			return a;

		return gcd(b,a%b);

	}	

	public static void main(String[] args) {
		System.out.println(new GCDFinder().gcd(25,10)); // should print 5
	}
}
