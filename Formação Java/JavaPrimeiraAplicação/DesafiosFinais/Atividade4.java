package DesafiosFinais;

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        //Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.

        Scanner teclado = new Scanner (System.in);


        System.out.println("Digite um numero para descobrir a sua tabua de 1 ao 10");
        int number = teclado.nextInt();


        System.out.println("Tabuada do numero"+ number + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(number + "x"+ i + "=" + (number * i) );
        }
    }
}
