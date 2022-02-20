package com.emon.epi.arrays;

import com.emon.epi.TimingExtension;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(TimingExtension.class)
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
        assertEquals(arr[1], 90);
    }
}
