package com.emon.epi.arrays;

import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {
    public void dutchNationalFlagApproach01(int pivotIndex, List<Integer> list) {
        Integer pivot = list.get(pivotIndex);

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < pivot) {
                    Collections.swap(list, i, j);
                    break;
                }
            }
        }

        for (int i = list.size() - 1; i >= 0 && list.get(i) >= pivot; i--) {
            for (int j = i - 1; j >= 0 && list.get(j) >= pivot; j--) {
                if (list.get(j) > pivot) {
                    Collections.swap(list, i, j);
                    break;
                }
            }
        }
    }

    public void dutchNationalFlagApproach02(int pivotIndex, List<Integer> list) {
        Integer pivot = list.get(pivotIndex);

        int smaller = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < pivot) {
                Collections.swap(list, smaller++, i);
            }
        }

        int larger = list.size() - 1;
        for (int i = list.size() - 1; i >= 0 && list.get(i) >= pivot; i--) {
            if (list.get(i) < pivot) {
                Collections.swap(list, larger--, i);
            }
        }
    }

    public void dutchNationalFlagApproach03(int pivotIndex, List<Integer> list) {
        int pivot = list.get(pivotIndex);
        int smaller = 0, equal = 0, larger = list.size();
        while (equal < larger) {
            if (list.get(equal) < pivot) {
                Collections.swap(list, smaller++, equal++);
            } else if (list.get(equal) == pivot) {
                equal++;
            } else {
                Collections.swap(list, equal, --larger);
            }
        }
    }

    public void dutchNationalFlagVariant01() {

    }

    public void dutchNationalFlagVariant02() {

    }

    public void dutchNationalFlagVariant03() {

    }

    public void dutchNationalFlagVariant04() {

    }
}
