
package com.model;

import java.util.*;

public class StreamExample2 {

    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(100, 200, 300, 400, 500);

        // Old way
        for (Integer price : prices) {
            double priceWithGST = price + (price * 0.12);
            System.out.println(priceWithGST);
        }

        // New way
        prices.forEach(price -> {
            double priceWithGST = price + (price * 0.12);
            System.out.println(priceWithGST);
        });
        
        //another way
        prices.stream().map(price -> price +.12* price)
        .forEach(System.out::println);
        
    }
}
