package DesafiosFinais;

import javax.swing.*;
import java.util.Scanner;
//Crie um programa que solicite ao usuário a entrada de um número inteiro.
// Verifique se o número é par ou ímpar e exiba uma mensagem correspondente.
public class Atividade05 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um numero Inteiro e descubra se ele é par ou ímpar");
        int number = teclado.nextInt();

        if( number % 2 == 0 ){
            System.out.println("o numero digitado foi par");
        }else{
            System.out.println("Numero digitado foi impar ");
        }
       return;
    }
}
