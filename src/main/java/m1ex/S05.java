package m1ex;

public class S05 {
	/**
	 * Reverse a string
	 * 
	 * @param s
	 * @return the input reversed
	 */
	public static String reverse(String s) {
		String result = "";
		//Meglio usare StringBuilder perché ogni volta che faccio result += creo nuovo oggetto
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}

	/**
	 * Check if the parameter is a palindrome
	 * 
	 * @param s
	 * @return true if the parameter is a palindrome
	 */
	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length() / 2; i++) {
			for (int j = s.length() - 1; j >= s.length() / 2; j--) {
				if (s.charAt(i) != s.charAt(j)) {
					return false;
				} else {
					i++;
				}
			}
		}
		return true;
	}

	/**
	 * Remove vowels from the parameter
	 * 
	 * @param s
	 * @return a string, same of input but without vowels
	 */
	public static String removeVowels(String s) {

		StringBuilder str = new StringBuilder(s.toLowerCase());
		
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				str.deleteCharAt(i);
			}
		}

		return str.toString();
	}

	/**
	 * Convert from binary to decimal
	 * 
	 * @param s a string that contains the binary representation of an integer
	 * @return the converted integer
	 */
	public static int bin2dec(String s) {
		// [1][0][0][0][1]
		// 43_210
		// 2
		int result = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			result += (Integer.parseInt(String.valueOf(s.charAt(i)))) * Math.pow(2, s.length() - 1 - i);
		}
		
		return result;
	}

	/**
	 * Reverse an array of integers
	 * 
	 * @param data
	 * @return a new array holding the same elements of input, in reversed order
	 */
	public static int[] reverse(int[] data) {
		int[] result = new int[data.length];

		for (int i = data.length - 1; i >= 0; i--) {
			for (int j = 0; j < data.length; j++) {
				result[j] = data[i];
				i--;
			}
		}

		return result;
	}

	/**
	 * Calculate the average
	 * 
	 * @param data
	 * @return the average
	 */
	public static double average(int[] data) {
		double sum = 0;
		for (int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum / data.length;
	}

	/**
	 * Find the largest value
	 * 
	 * @param data
	 * @return the largest value
	 */
	public static int max(int[] data) {
		int max = 0;
		for (int i = 0; i < data.length; i++) {
			if (max < data[i]) {
				max = data[i];
			}
		}
		return max;
	}
}
