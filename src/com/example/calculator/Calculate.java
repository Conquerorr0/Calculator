package com.example.calculator;
class Calculate{
    public int hesapla(){
        double sayi = 0,sonuc =0;
        char islem = 0;
        switch (islem) {
            case '+':
                sonuc += sayi;    
                break;
            case '-':
                sonuc -= sayi;
                break;
            case '*':
                sonuc *= sayi;
                break;
            case '/':
                try{
                    sonuc /= sayi;
                }
                catch(ArithmeticException e){
                    System.out.println("0 'a bölme hatası");
                }
                break;
            case '%':
                sonuc = sonuc * sayi / 100;
                break;
                   
            default:
                throw new AssertionError();
        }
        return 0;
    }
}
   
  
        
    
