package src;

public class Main {
    public static void main(String[] args) {
        Nome nomeprint = new Nome();
        Soma nSoma = new Soma();
        Subtracao nSubtracao = new Subtracao();

        System.out.println("Olá " + nomeprint.nome + 
        ",\n a soma é:  => " + nSoma.soma +
        "\n a subtracao é : => " + nSubtracao.subtracao
        );
    }
}
