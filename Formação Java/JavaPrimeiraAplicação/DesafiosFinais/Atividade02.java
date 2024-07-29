package DesafiosFinais;

import java.util.Scanner;

public class Atividade02 {
//Peça ao usuário para inserir dois números inteiros.
// Compare os números e imprima uma mensagem indicando se são iguais,
// diferentes, o primeiro é maior ou o segundo é maior.
public static void main(String[] args) {
    Scanner teclado = new Scanner ( System.in);
    System.out.println("Digite 2 numeros");
    System.out.println("Digite o primeiro numero");
    int number1 = teclado.nextInt();
    System.out.println("Digite segundo numero");
    int number2 = teclado.nextInt();

    if(number1 == number2){
        System.out.println("Numeros digitados foram iguais");
    }else if (number1 > number2){
        System.out.println("o maior numero digitado foi o primeiro");
    } else if (number1 < number2) {
        System.out.println("o maior numero digitado foi o segundo");
    }else {
        System.out.println("numeros diferentes");
    }

}



}
