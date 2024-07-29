package DesafiosFinais;

import java.util.Scanner;

public class Atividade06 {
    //Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero para calcular seu fatorial");
        int number = teclado.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= number; i++) {
            fatorial *= i ;
        }

        System.out.println("O fatorial de " + number + " é: " + fatorial);
    }
}
