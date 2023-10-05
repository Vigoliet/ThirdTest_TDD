package org.example;

public class FactorialCalculator {


    public long calculateFactorial(int number){

        if (number<0) {
            throw new IllegalArgumentException();
        }

        long product = 1;

        for (int i = number; i > 0; i--) {
            product*=i;
        }
        return product;
    }
}
