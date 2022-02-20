package com.emon.epi.arrays;

import com.emon.epi.TimingExtension;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(TimingExtension.class)
public class DutchNationalFlagTest {
    private static DutchNationalFlag dutchNationalFlag;
    private Integer pivot;
    private List<Integer> unordered;
    private List<Integer> ordered; // cannot be determined before

    @BeforeAll
    public static void initialize() {
        dutchNationalFlag = new DutchNationalFlag();
    }

    @Test
    public void dutchNationalFlagApproachTest1() {
        pivot = 0;
        unordered = List.of(1);
        ordered = List.of(1);

        approachesTest(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlagApproachTest2() {
        pivot = 4;
        unordered = Arrays.asList(2, 0, 2, 1, 1, 0);
        ordered = Arrays.asList(0, 0, 1, 1, 2, 2);

        approachesTest(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlagApproachTest3() {
        pivot = 8;
        unordered = Arrays.asList(3, 3, 3, 2, 2, 2, 1, 1, 1);
        ordered = Arrays.asList(1, 1, 1, 3, 3, 3, 2, 2, 2);

        approachesTest(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlagApproachTest4() {
        pivot = 7;
        unordered = Arrays.asList(5, 4, 2, 3, 5, 1, 7, 6, 4, 9, 6, 2, 4, 3, 2, 4, 6, 7, 8);
        ordered = Arrays.asList(4, 2, 3, 5, 1, 4, 5, 2, 4, 3, 2, 4, 6, 6, 6, 7, 8, 9, 7);

        approachesTest(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlagApproachTest5() {
        pivot = 3;
        unordered = Arrays.asList(0, 1, 2, 0, 2, 1, 1);
        ordered = Arrays.asList(0, 0, 1, 1, 2, 2, 1);

        approachesTest(pivot, unordered, ordered);
    }

    private void approachesTest(Integer pivot, List<Integer> unordered, List<Integer> ordered) {
        approach01Test(pivot, unordered, ordered);
        approach02Test(pivot, unordered, ordered);
        approach03Test(pivot, unordered, ordered);
    }

    private void approach01Test(Integer pivot, List<Integer> unordered, List<Integer> ordered) {
        dutchNationalFlag.dutchNationalFlagApproach01(pivot, unordered);
        assertEquals(ordered, unordered);
    }

    private void approach02Test(Integer pivot, List<Integer> unordered, List<Integer> ordered) {
        dutchNationalFlag.dutchNationalFlagApproach02(pivot, unordered);
        assertEquals(ordered, unordered);
    }

    private void approach03Test(Integer pivot, List<Integer> unordered, List<Integer> ordered) {
        dutchNationalFlag.dutchNationalFlagApproach03(pivot, unordered);
        assertEquals(ordered, unordered);
    }
}
