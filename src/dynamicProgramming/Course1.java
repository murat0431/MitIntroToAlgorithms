package dynamicProgramming;

public class Course1 {
	public static void main(String[] args) {
		/*
		Long start = System.currentTimeMillis();
		System.out.println(fib(40));
		Long finish = System.currentTimeMillis();
		System.out.println("The naive algorithm takes: " + (finish-start) + "ms");
		*/
		/*
		Long start2 = System.currentTimeMillis();
		System.out.println(fibMemo(60));
		Long finish2 = System.currentTimeMillis();
		System.out.println("The memo algorithm takes: " + (finish2-start2) + "ms");
		*/
		System.out.println(fibTabular(3));
	}
	
	/**
	 * Naive Fibonacci Algorithm
	 */
	public static int fib(int n) {
		if(n<3) return 1;
		return fib(n-1) + fib(n-2);
	}
	
	/**
	 * Memo version of Fibonacci
	 */
	
	public static Long fibMemo(int n) {
		Long[] memo = new Long[n+1];
		return fibMemo(n, memo);
	}
	
	private static Long fibMemo(int n, Long[] memo) {
		if(n < 3) return Long.valueOf(1);
		if(memo[n] != null) return memo[n];
		memo[n] = fibMemo(n-1, memo) + fibMemo(n-2, memo);
		return memo[n];
	}
	
	public static int fibTabular(int n) {
		int[] tab = new int[n+1];
		tab[1] = 1; tab[2] = 1; 
		for (int i = 3; i < tab.length; i++) {
			tab[i] = tab[i-1] + tab[i-2];
		}
		return tab[n];
	}
	
	
}
 