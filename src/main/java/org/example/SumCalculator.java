package org.example;

public class SumCalculator {
    private int result;
    public int sum(int n){
        if(n == 0 ){
            throw new IllegalArgumentException("Аргумент не може бути 0");
        }
        for (int i = 0; i <= n ; i++) {
            result += i;
        }
        return result;

    }
}
