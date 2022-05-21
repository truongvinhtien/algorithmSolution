package com.tvt.solutions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ParkingDilemma {
    public int parking(int[] cars, int k) {
        int min = Integer.MAX_VALUE;
        List<Integer> sortedParkingSlot = new ArrayList<>();
        for (int i : cars) {
            sortedParkingSlot.add(i);
        }
        Collections.sort(sortedParkingSlot);
        for (int i = 0; i < cars.length - k; i++) {
            min = Math.min(min, sortedParkingSlot.get(i+k-1) - sortedParkingSlot.get(i));
        }
        return min+1;
    }
}
