package com.example.calculator;

/**
 * Hesap makinesi operatörlerini temsil eden enum sınıfı.
 */
public enum Operator {
    ADD('+', 1),
    SUBTRACT('-', 1),
    MULTIPLY('x', 2),
    DIVIDE('÷', 2),
    PERCENTAGE('%', 2),
    LEFT_PARENTHESIS('(', 0),
    RIGHT_PARENTHESIS(')', 0);

    private final char symbol;
    private final int precedence;

    Operator(char symbol, int precedence) {
        this.symbol = symbol;
        this.precedence = precedence;
    }

    public char getSymbol() {
        return symbol;
    }

    public int getPrecedence() {
        return precedence;
    }

    /**
     * Verilen karaktere karşılık gelen operatörü döndürür
     * @param ch Karakter
     * @return Operatör veya null
     */
    public static Operator fromChar(char ch) {
        for (Operator op : values()) {
            if (op.symbol == ch) {
                return op;
            }
        }
        return null;
    }

    /**
     * İki operatörün önceliğini karşılaştırır
     * @param other Karşılaştırılacak operatör
     * @return true eğer this operatörünün önceliği diğerinden küçük veya eşitse
     */
    public boolean hasLowerOrEqualPrecedence(Operator other) {
        if (other == LEFT_PARENTHESIS || other == RIGHT_PARENTHESIS) {
            return false;
        }
        return this.precedence <= other.precedence;
    }
}