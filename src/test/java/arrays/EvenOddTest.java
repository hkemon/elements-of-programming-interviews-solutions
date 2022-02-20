package arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class EvenOddTest {
    private static EvenOdd evenOdd;

    @BeforeAll
    public static void initialize() {
        evenOdd = new EvenOdd();
    }

    @Test
    public void evenOddTest() {
        int[] arr = new int[]{10, 7, 21, 90, 85, 35, 65, 15, 21};
        evenOdd.evenOdd(arr);
        Assertions.assertEquals(arr[1], 90);
    }
}
