package com.example.calculator;

import java.util.Stack;

public class ProcessPriority {

    private String input;
    private double result;
    public ProcessPriority(String input) {
        this.input = input;
        result = calculateExpression(input);
    }

    public static double calculateExpression(String expression) {
        return evaluateExpression(expression);
    }

    public static double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", ""); // Boşlukları kaldır
        char[] tokens = expression.toCharArray();

        // Operandlar ve operatörler için stack'ler oluştur
        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == '(') {
                operators.push(tokens[i]);
            } else if (Character.isDigit(tokens[i])) {
                StringBuilder sb = new StringBuilder();
                while (i < tokens.length && (Character.isDigit(tokens[i]) || tokens[i] == ',')) {
                    sb.append(tokens[i++]);
                }
                values.push(Double.parseDouble(sb.toString().replace(',', '.')));
                i--;
            } else if (tokens[i] == ')') {
                while (operators.peek() != '(') {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop();
            } else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == 'x' || tokens[i] == '÷' || tokens[i] == '%') {
                while (!operators.empty() && hasPrecedence(tokens[i], operators.peek())) {
                    values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(tokens[i]);
            }
        }

        while (!operators.empty()) {
            values.push(applyOperation(operators.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    public static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        return (op1 != 'x' && op1 != '÷' && op1 != '%') || (op2 != '+' && op2 != '-');
    }

    public static double applyOperation(char operator, double b, double a) {
        switch (operator) {
            case '+':
                return Calculate.add(a, b);
            case '-':
                return Calculate.subtract(a, b);
            case 'x':
                return Calculate.multiply(a, b);
            case '÷':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return Calculate.divide(a, b);
            case '%':
                return Calculate.percentage(a, b);
        }
        return 0;
    }

    /**
     * @return the result
     */
    public double getResult() {
        return result;
    }
}
