package com.tvt.solutions;

import java.util.HashSet;
import java.util.Set;

public class Bulbs {
    public int momentCount(int[] bulbs) {
        int count = 0;
        Set<Integer> turnOn = new HashSet<>();
        Set<Integer> missing = new HashSet<>();
        for (int i = 0; i < bulbs.length; i++) {
            turnOn.add(bulbs[i]);
            if (!turnOn.contains(i+1)) {
                missing.add(i+1);
            }
            if (missing.contains(bulbs[i])) {
                missing.remove(bulbs[i]);
            }
            if (missing.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
