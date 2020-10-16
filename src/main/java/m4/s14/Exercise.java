package m4.s14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercise {
	/**
	 * Extract from input the even values and return them in a List
	 * 
	 * @param data a bunch of integers
	 * @return even values from input
	 * 
	 *         example: in {2, 3, 4, 5} -> out {2, 4}
	 */
	public List<Integer> evens(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (data == null) {
			return result;
		}

		if (data.length == 0) {
			return result;
		}

		for (int value : data) {
			if (value % 2 == 0) {
				result.add(value);
			}
		}

		return result;
	}

	public int[] evensRaw(int[] data) {
		int len = 0;

		for (int value : data) {
			if (value % 2 == 0) {
				len++;
			}
		}

		int[] result = new int[len];

		int i = 0;
		for (int value : data) {
			if (value % 2 == 0) {
				result[i] = value;
				i++;
			}
		}

		return result;
	}

	/**
	 * Extract non-duplicated values in input and return them in a list
	 * 
	 * @param data a bunch of integers
	 * @return only the non-duplicated values from input
	 * 
	 *         example: in {2, 3, 4, 4} -> out {2, 3}
	 */
//	public List<Integer> singles(int[] data) {
//		ArrayList<Integer> result = new ArrayList<Integer>();
//
//
//		for (int i = 0; i < data.length; i++) {
//			boolean flag = true;
//
//			for (int j = 0; j < data.length; j++) {
//				if (data[i] == data[j] && i != j) {
//					flag = false;
//				}
//
//			}
//			if(flag == true) {
//				result.add(data[i]);
//			}
//		}
//
//		return result;
//	}

	public List<Integer> singles(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		if (data == null || data.length == 0) {
			return result;
		}

		Arrays.sort(data);

//		for (int i = 1; i < data.length; i++) {
//			if (i + 1 != data.length && i != 1) {
//				if (data[i] != data[i - 1] && data[i] != data[i + 1]) {
//					result.add(data[i]);
//				}
//			} else if (i == 1) {
//				if (data[i] != data[i - 1]) {
//					result.add(data[i - 1]);
//				}
//			} else {
//				if (data[i] != data[i - 1]) {
//					result.add(data[i]);
//				}
//			}
//		}
		
		int duplicated = 0;
		for (int i = 0; i < data.length; i++) {
			if (i != data.length - 1) {
				if (data[i] != data[i + 1] && data[i] != duplicated) {
					result.add(data[i]);
				} else if (data[i] == data[i + 1]) {
					i++;
					duplicated = data[i];
					
				}
			} else {
				result.add(data[i]);
			}
		}

		return result;
	}

	/**
	 * As above, but with a linear time algorithm
	 * 
	 * @param data
	 * @return
	 */
	public ArrayList<Integer> singlesLinear(int[] data) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		
		int count = 1;
		for(int i = 0; i < data.length; i++) {
			if(hashmap.containsKey(data[i])) {
				hashmap.put(data[i], ++count);
			} else {
				hashmap.put(data[i], 1);
			}
		}
				
		for(Integer key: hashmap.keySet())
		if(hashmap.get(key) == 1) {
			result.add(key);
		}

		return result;
	}
}
