package DesafiosFinais;

import java.util.Scanner;

public class Atividade3 {

    //Crie um menu que oferece duas opções ao usuário: "1.
    // Calcular área do quadrado" e "2. Calcular área do círculo".
    // Solicite a escolha do usuário e realize o cálculo da área com base na opção selecionada.
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite 2 numeros");
        int x = teclado.nextInt();
        int y = teclado.nextInt();


        int areaQuadrado = x * y;
        double areaCirculo = areaQuadrado * 3.14;


        System.out.println("Digite 1 para calcular area do quadrado e 2 para area do Cirulo");
        int opacao = teclado.nextInt();

       if (opacao == 1){
           System.out.println("Area do quadrado é : " + areaQuadrado);
       }else if(opacao == 2) {
           System.out.println("Area do circulo : " + areaCirculo);
       }else{
           System.out.println("formato invalido");
       }

    }
}
