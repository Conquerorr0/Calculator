package com.example.calculator;

import java.util.Stack;

/**
 * Matematiksel ifadeleri işlem önceliğine göre değerlendiren sınıf.
 */
public class ProcessPriority {
    private final String input;
    private final double result;

    /**
     * @param input Değerlendirilecek matematiksel ifade
     */
    public ProcessPriority(String input) {
        this.input = input;
        this.result = calculateExpression(input);
    }

    /**
     * Matematiksel ifadeyi değerlendirir
     * @param expression Değerlendirilecek ifade
     * @return Sonuç
     */
    public static double calculateExpression(String expression) {
        return evaluateExpression(expression);
    }

    /**
     * İfadeyi tokenize edip hesaplar
     * @param expression Değerlendirilecek ifade
     * @return Sonuç
     * @throws IllegalArgumentException Geçersiz ifade durumunda
     */
    private static double evaluateExpression(String expression) {
        expression = expression.replaceAll("\\s+", "");
        char[] tokens = expression.toCharArray();

        Stack<Double> values = new Stack<>();
        Stack<Operator> operators = new Stack<>();

        StringBuilder number = new StringBuilder();
        
        for (int i = 0; i < tokens.length; i++) {
            if (Character.isDigit(tokens[i]) || tokens[i] == ',') {
                number.append(tokens[i] == ',' ? '.' : tokens[i]);
            } else {
                if (number.length() > 0) {
                    values.push(Double.parseDouble(number.toString()));
                    number.setLength(0);
                }

                Operator currentOp = Operator.fromChar(tokens[i]);
                if (currentOp == null) {
                    throw new IllegalArgumentException("Geçersiz operatör: " + tokens[i]);
                }

                if (currentOp == Operator.LEFT_PARENTHESIS) {
                    operators.push(currentOp);
                } else if (currentOp == Operator.RIGHT_PARENTHESIS) {
                    while (!operators.isEmpty() && operators.peek() != Operator.LEFT_PARENTHESIS) {
                        evaluateTop(values, operators);
                    }
                    if (!operators.isEmpty()) {
                        operators.pop(); // Sol parantezi çıkar
                    }
                } else {
                    while (!operators.isEmpty() && currentOp.hasLowerOrEqualPrecedence(operators.peek())) {
                        evaluateTop(values, operators);
                    }
                    operators.push(currentOp);
                }
            }
        }

        if (number.length() > 0) {
            values.push(Double.parseDouble(number.toString()));
        }

        while (!operators.isEmpty()) {
            evaluateTop(values, operators);
        }

        if (values.isEmpty()) {
            throw new IllegalArgumentException("Geçersiz ifade");
        }

        return values.pop();
    }

    /**
     * Stack'in en üstündeki operatörü ve değerleri kullanarak işlem yapar
     * @param values Değer stack'i
     * @param operators Operatör stack'i
     */
    private static void evaluateTop(Stack<Double> values, Stack<Operator> operators) {
        if (values.size() < 2) {
            throw new IllegalArgumentException("Yetersiz operand");
        }

        double b = values.pop();
        double a = values.pop();
        Operator op = operators.pop();

        switch (op) {
            case ADD:
                values.push(Calculate.add(a, b));
                break;
            case SUBTRACT:
                values.push(Calculate.subtract(a, b));
                break;
            case MULTIPLY:
                values.push(Calculate.multiply(a, b));
                break;
            case DIVIDE:
                values.push(Calculate.divide(a, b));
                break;
            case PERCENTAGE:
                values.push(Calculate.percentage(a, b));
                break;
            default:
                throw new IllegalStateException("Beklenmeyen operatör: " + op);
        }
    }

    /**
     * @return Hesaplama sonucu
     */
    public double getResult() {
        return result;
    }
}
