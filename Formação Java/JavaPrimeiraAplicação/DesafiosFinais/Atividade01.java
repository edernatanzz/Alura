package DesafiosFinais;

import java.util.Scanner;

public class Atividade01 {
        //Crie um programa que solicite ao usuário digitar um número.
    // Se o número for positivo, exiba "Número positivo", caso contrário, exiba "Número negativo".


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       System.out.println("Digite um numero : " );
       float number = teclado.nextFloat();

       if( number > 0 ){
           System.out.println("o numero é postivo");
       }else {
           System.out.println("o numero é negativo");
       }

    }



}
