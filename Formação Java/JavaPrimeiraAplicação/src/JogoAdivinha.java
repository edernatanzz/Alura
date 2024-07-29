package src;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinha {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int numeroSecreto = random.nextInt(101); // Gera um número aleatório entre 0 e 100
        int tentativas = 5; // Número máximo de tentativas

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar um número entre 0 e 100.");

        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int numero = teclado.nextInt();

            if (numero == numeroSecreto) {
                System.out.println("Parabéns! Você acertou o número em " + i + " tentativas.");
                break; // Sai do loop pois o jogador acertou o número
            } else if (numero > numeroSecreto) {
                System.out.println("O número secreto é menor que " + numero + ".");
            } else {
                System.out.println("O número secreto é maior que " + numero + ".");
            }

            if (i == tentativas) {
                System.out.println("Você esgotou suas tentativas. O número secreto era " + numeroSecreto + ".");
            }
        }

        teclado.close();
    }
}
