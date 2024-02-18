package com.example.calculator;

class Calculate {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        double sonuc = (b == 0) ? Integer.MIN_VALUE : a / b;
        return sonuc;
    }

    public double percentage(double a, double b) {
        return a * b / 100;
    }

}