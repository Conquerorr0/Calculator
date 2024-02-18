package com.example.calculator;
class Calculate{
    public double add(int a, int b){
        return a + b;
    }
    
    public double subtract(int a, int b){
        return a - b;
    }
    
    public double multiply(int a, int b){
        return a * b;
    }
    
    public double divide(int a, int b, int result){
        if(b == 0){
            try{
                result = a/b;
            }
            catch(ArithmeticException e){
                System.out.println("Sıfıra bölme hatası");
            }
        }
        return Integer.MIN_VALUE;
    }
    
    public double percentage(int a, int b){
        return a * b / 100;
    }
    
}
   
  
        
    
