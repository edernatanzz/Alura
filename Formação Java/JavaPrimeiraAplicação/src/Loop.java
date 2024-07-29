package src;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;



        for(int i = 0; i<3; i++){
            System.out.println("digite sua avaliação do filme ");
            nota = teclado.nextDouble();
            mediaAvaliacao = mediaAvaliacao + nota;
        }

        System.out.print("media de avaliação" + mediaAvaliacao/3 );

    }
}
