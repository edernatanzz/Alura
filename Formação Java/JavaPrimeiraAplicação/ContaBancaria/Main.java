package ContaBancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome = "Eder Natan Azevedo Figueiredo";
        String tipoDeConta = "Corrente";
        double saldoInicial = 250.00;

        System.out.println("Nome: " + nome);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo inicial: " + saldoInicial);

        String menu = """
                **Digite a opção desejada**
                1 - Consultar Saldos
                2 - Receber Valores
                3 - Transferir Valores
                4 - Sair
                """;

        int option = 0;

        while (option != 4) {
            System.out.println(menu);
            option = teclado.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Saldo atual: " + saldoInicial);
                    break;
                case 2:
                    System.out.print("Digite o valor a receber: ");
                    double valorRecebido = teclado.nextDouble();
                    saldoInicial += valorRecebido;
                    System.out.println("Valor recebido com sucesso! Novo saldox: " + saldoInicial);
                    break;
                case 3:
                    System.out.print("Digite o valor a transferir: ");
                    double valorTransferido = teclado.nextDouble();
                    if (valorTransferido > saldoInicial) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldoInicial -= valorTransferido;
                        System.out.println("Valor transferido com sucesso! Novo saldo: " + saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        teclado.close();
    }
}
