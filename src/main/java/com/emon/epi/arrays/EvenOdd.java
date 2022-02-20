package com.emon.epi.arrays;

public class EvenOdd {
    public void evenOdd(int[] arr) {
        int nextEven = 0, nextOdd = arr.length - 1, temp;
        while (nextEven < nextOdd) {
            if (arr[nextEven] % 2 == 0) {
                nextEven++;
            } else {
                temp = arr[nextEven];
                arr[nextEven] = arr[nextOdd];
                arr[nextOdd--] = temp;
            }
        }
    }
}
