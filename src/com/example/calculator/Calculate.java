package com.example.calculator;

/**
 * Hesap makinesi için temel matematik işlemlerini sağlayan utility sınıfı.
 */
public final class Calculate {
    
    /**
     * Utility sınıfı olduğu için private constructor
     */
    private Calculate() {
        throw new AssertionError("Utility sınıfı örneklenemez");
    }

    /**
     * İki sayıyı toplar
     * @param a Birinci sayı
     * @param b İkinci sayı
     * @return Toplam sonucu
     */
    public static double add(double a, double b) {
        return a + b;
    }

    /**
     * İki sayının farkını alır
     * @param a Birinci sayı
     * @param b İkinci sayı
     * @return Çıkarma sonucu
     */
    public static double subtract(double a, double b) {
        return a - b;
    }

    /**
     * İki sayıyı çarpar
     * @param a Birinci sayı
     * @param b İkinci sayı
     * @return Çarpım sonucu
     */
    public static double multiply(double a, double b) {
        return a * b;
    }

    /**
     * İki sayıyı böler
     * @param a Bölünen sayı
     * @param b Bölen sayı
     * @return Bölme sonucu
     * @throws ArithmeticException Sıfıra bölme durumunda fırlatılır
     */
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası");
        }
        return a / b;
    }

    /**
     * Bir sayının belirtilen yüzdesini hesaplar
     * @param a Ana sayı
     * @param b Yüzde değeri
     * @return Yüzde hesaplama sonucu
     */
    public static double percentage(double a, double b) {
        return a * b / 100;
    }
}
