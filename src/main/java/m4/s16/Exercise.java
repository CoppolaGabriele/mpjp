package m4.s16;

import java.util.HashSet;
import java.util.Set;

public class Exercise {
    /**
     * Generate an array that contains only once each value (possibly duplicated) in
     * the input array
     * 
     * <pre>
     * Example: { 12, 53, 12, 35 } -> { 12, 53, 35 }
     * 
     * Note: Result is not expected in any specific order
     * </pre>
     * 
     * @param data an array with duplicates
     * @return a stripped copy of the original array
     */
    public Integer[] singles(int[] left) {

    	Set<Integer> hashset = new HashSet<>();
    	
    	for(int value: left) {
    		hashset.add(value);
    	}

    	Integer[] result = hashset.toArray(new Integer[0]);
    	
    	return result;
    }
    
    public static void main(String[] args) {
		int[] arr = {12, 53, 12, 35};
		
		Exercise ex = new Exercise();
		var hashset = ex.singles(arr);
		
		for(Integer value: hashset) {
			System.out.println(value);
		}
	}
}
