package com.calculator;

import org.springframework.boot.SpringApplication;

class Calculator {
    public int addAToB(int a, int b) {
        return a + b;
    }

    public int substractAFromB(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(calculator.addAToB(5, 5));
        System.out.println(calculator.substractAFromB(10, 5));
    }
}
