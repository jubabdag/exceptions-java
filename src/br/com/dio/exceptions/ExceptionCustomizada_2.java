package br.com.dio.exceptions;

import javax.swing.*;

public class ExceptionCustomizada_2 {
    public static void main(String[] args){
        int[] numerador = {4, 5, 8, 10};
        int[] denominador = {2, 4, 0, 2, 8};

        for (int i = 0; i < denominador.length || i < numerador.length; i++) {
            try {
                if(numerador[i] %2 != 0)
                    throw new DivisaoNaoExataException("Divisão não exata!");

                if(denominador[i] == 0)
                    throw new ArithmeticException("Impossível fazer divisão por 0");

                if(i > numerador.length || i > denominador.length)
                    throw new ArrayIndexOutOfBoundsException();

                int resultado = numerador[i] / denominador[i];
                System.out.println(resultado);
            } catch (DivisaoNaoExataException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
                //e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        System.out.println("O programa continua...");
    }
}


