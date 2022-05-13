package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = Calculator.instance.get();

        int a = calculator.plus.apply(1, 2);
        int b = calculator.minus.apply(1, 1);
        int c = calculator.divide.apply(a, b);
        // Здесь происходит деление на ноль
        // Нужно придумать другую реализацию метода apply(x, y) для деления

        calculator.println.accept(c);
    }
}
