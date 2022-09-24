package com.busraciftlik;

import java.util.function.Function;

public class SquareOfEvenNumbers implements Function<Integer, int[]> {

    @Override
    public int[] apply(Integer integer) {
        int[] square = new int[5];
        for (int i = 2; i <= integer; i += 2)
            square[i / 2 - 1] = i * i;
        return square;
    }
}
