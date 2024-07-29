package src;

import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;


        while(nota != -1 ){
            System.out.println("digite sua avaliação do filme e pressione -1 para cancelar");
            nota = teclado.nextDouble();

            if (nota != -1) {
                mediaAvaliacao = mediaAvaliacao + nota;
                totalDeNotas++;
            }


        }

        System.out.print("media de avaliação" + mediaAvaliacao/totalDeNotas );

    }
}
