import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

public class TestArrayExercise {
    @Test
    public void testArrayToUpperCase(){
        String[] input = new String[]{"cat", "dog", "fish"};
        ArrayExercise.arrayToUpperCase(input);
        assertArrayEquals(new String[]{"CAT", "DOG", "FISH"}, input);
    }
    @Test
    public void testIncrementArray(){
        int[] input = new int[]{1, 2, 3, 4, 5};
        ArrayExercise.incrementArray(input);
        assertArrayEquals(new int[]{2, 3, 4, 5, 6}, input);

    }

    //./mvnw test



}
