package jogo_de_advinhacao;

import java.rmi.Naming;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            AdvinhacaoInterface game = (AdvinhacaoInterface) Naming.lookup("rmi://localhost/AdvinhacaoInterface");
            int contador = 0;
            while (true) {
                System.out.println("Digite um número entre 1 e 100 ou -1 para sair: ");
                int numero = scanner.nextInt();
                if (numero == -1) {
                    System.out.println("Você deslogou.");
                    System.exit(0);
                }
                String result = game.jogoAdvinhacao(numero);
                System.out.println(result);
                if (result.equals("Correto")) {
                    contador++;
                    System.out.println("Você tem o total de " + contador + " vitórias.");
                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
