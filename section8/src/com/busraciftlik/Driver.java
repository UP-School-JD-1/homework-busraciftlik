package com.busraciftlik;

import java.util.function.Function;

public class Driver {
    public static void main(String[] args) {
        Function<Integer,Integer> evenTotalFunction = new EvenNumberTotal();
        System.out.println(applyFunction(10,evenTotalFunction));
        Function<Integer,Integer> productEvenNumber = new ProductEvenNumber();
        System.out.println(applyFunction(4,productEvenNumber));

    }

    public static int applyFunction(int n, Function<Integer, Integer> function){
        return function.apply(n);
    }

}
