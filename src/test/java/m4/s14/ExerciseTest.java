package m4.s14;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.containsInAnyOrder;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ExerciseTest {
	
	@Test
	void evensArray() {
		Exercise ex = new Exercise();
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] expected = {2, 4, 6};
		
		int[] actual = ex.evensRaw(arr);
		
		assertThat(actual, is(expected));
		
	}
	
	void evensList() {
		Exercise ex = new Exercise();
		
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		List<Integer> actual = ex.evens(arr);
		List<Integer> expected = Arrays.asList(2, 4, 6);
		
		assertThat(actual, is(expected));
		
	}
	
    @Test
    void singlesOne() {
        Exercise ex = new Exercise();

        List<Integer> expected = Arrays.asList(3, 4, 23);
        List<Integer> actual = ex.singles(new int[] { 4, 3, 23 });
        assertThat(actual, is(expected));
    }

    @Test
    void singlesCouple() {
        Exercise ex = new Exercise();

        int[] data = { 23, 43, 23, 25, 43};

        List<Integer> expected = Arrays.asList(25);
        List<Integer> actual = ex.singles(data);
        assertThat(actual, is(expected));
    }

    @Test
    void singlesCouple2() {
        Exercise ex = new Exercise();

        int[] data = { 23, 43, 23, 25 };

        List<Integer> expected = Arrays.asList(25, 43);

        List<Integer> actual = ex.singles(data);
        actual.sort(null);
        assertThat(actual, is(expected));
    }

    @Test
    void singlesCouple3() {
        Exercise ex = new Exercise();

        int[] data = { 23, 43, 23, 25 };

        List<Integer> expected = Arrays.asList(25, 43);

        List<Integer> actual = ex.singles(data);
        assertThat(actual.size(), is(expected.size()));
        assertThat(actual, containsInAnyOrder(expected.toArray()));
    }
    
    @Test
    void singlesCouple4() {
        Exercise ex = new Exercise();

        int[] data = { 23, 23, 23, 43, 23, 25, 3, 25, 43};

        List<Integer> expected = Arrays.asList(3);
        List<Integer> actual = ex.singles(data);
        assertThat(actual, is(expected));
    }
    
    @Test
    void singlesLinear() {
        Exercise ex = new Exercise();

        List<Integer> expected = Arrays.asList(4, 23);
        List<Integer> actual = ex.singlesLinear(new int[] { 3, 3, 4, 3, 23 });
        assertThat(actual, is(expected));
    }
    
}
