package com.example;

public class Optional {

    public static void main(String[] args) {
        Integer n = 1;
        System.out.println("Número não convertido:" + n);
        System.out.println("\n\nTipo da variável antes da conversão: " + n.getClass().getSimpleName());
        String numeroConvertido = ConvertEmInteger(n);
        System.out.println("\n\nNúmero convertido:" + numeroConvertido);
        System.out.println("\n\nTipo da variável depois da conversão: " + numeroConvertido.getClass().getSimpleName());

    }

    public static String ConvertEmInteger(Integer numeroString){
        return String.valueOf(numeroString);
    }

}
