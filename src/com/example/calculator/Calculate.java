package com.example.calculator;

class Calculate {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        System.out.println(a*b);
        return a * b;
    }

    public static double divide(double a, double b) {
        double sonuc = (b == 0) ? Integer.MIN_VALUE : a / b;
        return sonuc;
    }

    public static double percentage(double a, double b) {
        return a * b / 100;
    }
}
