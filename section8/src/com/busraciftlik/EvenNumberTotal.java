package com.busraciftlik;

import java.util.function.Function;

public class EvenNumberTotal implements Function<Integer,Integer>{

    @Override
    public Integer apply(Integer integer) {
        int sum = 0;
        for (int i = 2; i <= integer; i += 2)
            sum += i;
        return sum;
    }

  }
