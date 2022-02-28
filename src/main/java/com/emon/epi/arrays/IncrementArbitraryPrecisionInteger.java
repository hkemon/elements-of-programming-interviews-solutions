package com.emon.epi.arrays;

import java.util.List;

public class IncrementArbitraryPrecisionInteger {
    public static void plusOne(List<Integer> list) {
        int n = list.size() - 1;
        list.set(n, list.get(n) + 1);
        for (int i = n; i > 0 && list.get(i) == 10; i--) {
            list.set(i, 0);
            list.set(i - 1, list.get(i - 1) + 1);
        }
        if (list.get(0) == 10) {
            list.set(0, 0);
            list.add(0, 1);
        }
    }
}
