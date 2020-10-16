package m1ex;

public class S04 {
	/**
	 * Add up all the numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the numbers, or zero
	 */
	public static long sum(int first, int last) {
		if (first > last) {
			return 0;
		} else if (last > first) {
			long sum = 0;

			for (int i = first; i <= last; i++) {
				sum += i;
			}
			return sum;
		} else {
			return first;
		}

	}

	/**
	 * Add up only the even numbers in the passed closed interval
	 * 
	 * @param first the left limit
	 * @param last  the right limit
	 * @return the sum of all the even numbers, or zero
	 */
	public static long evenSum(int first, int last) {
		if (first > last) {
			return 0;
		}

		long sum = 0;

		for (int i = first; i <= last; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}

		return sum;
	}

	/**
	 * Square root using Newton method Epsilon should be set to 0.001
	 * 
	 * @param value
	 * @return calculated square root
	 */
	public static double sqrt(double value) {

		double epsilon = 000.1;
		double x = value / 2;
		double temp = x;

		while (Math.abs(temp - x) > epsilon) {
			temp = x;
			x = 1 / 2 * (x + value / x);
		}
		return x;

	}

	/**
	 * Square root using Newton method
	 * 
	 * @param value
	 * @param epsilon stop iterating when gain is less than this value
	 * @return calculated square root
	 */
	public static double sqrt(double value, double epsilon) {
		// TODO
		return 0.0;
	}

	/**
	 * Factorial
	 * 
	 * @param value
	 * @return factorial of input value, or zero
	 */
	public static long factorial(int value) {
		
		long result = 1;
		
		if (value < 0) {
			return 0;
		}
		
		for(int i = 1; i <= value; i++) {
			result *= i; 
		}
		return result;
	}

	/**
	 * Fibonacci number (0, 1, 1, 2, 3, 5, 8, �)
	 * 
	 * @param value
	 * @return the Fibonacci number of value, or zero
	 */
	public static long fibonacci(int value) {
		if (value == 0) {
			return 0;
		} else if (value == 1) {
			return 1;
		} else {
			long f1 = fibonacci(value - 1);
			long f2 = fibonacci(value - 2);
			return f1 + f2;
		}
	}

	/**
	 * Multiplication table
	 * 
	 * @param value
	 * @return The multiplication table for value, when possible
	 */
	public static int[][] multiplicationTable(int value) {
		int[][] result = new int[value][value];
		
		for(int i = 0; i < value; i++) {
			for(int j = 0; j < value; j++) {
				result[i][j] = (i + 1) * (j + 1);
			}
		}

		return result;
	}
}
