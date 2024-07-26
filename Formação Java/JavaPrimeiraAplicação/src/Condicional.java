package src;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um ano");
        int anoDeLancamento = teclado.nextInt();

        String tipoPlano = teclado.next();

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        if(anoDeLancamento >= 2022){
            System.out.println("Lançamento que os clientes estão curtindo ");
        }else {
            System.out.println("Filme retro");
        }

        //if(incluidoNoPlano == true || tipoPlano.equals("plus")){
        if(tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else{
            System.out.println("nao incluido no seu plano");
        }
        teclado.close();
    }
}
