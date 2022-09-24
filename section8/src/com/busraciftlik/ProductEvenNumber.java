package com.busraciftlik;

import java.util.function.Function;

public class ProductEvenNumber implements Function<Integer,Integer> {
     @Override
    public Integer apply(Integer integer) {
         int product = 1;
         for (int i = 2; i <= integer; i += 2)
             product *= i;
         return product;
    }
}
