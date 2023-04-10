package org.example;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        int result =  sumCalculator.sum(3);
        System.out.println("result = " + result);
    }
}