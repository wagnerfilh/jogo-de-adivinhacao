import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.Random;

public class Server extends UnicastRemoteObject implements AdvinhacaoInterface {
    private int numeroAleatorio;

    public Server() throws RemoteException {
        super();
        // Inicialize o número aleatório quando o servidor for criado
        numeroAleatorio = Aleatorio();
    }

    public static void main(String[] args) {
        try {
            Server obj = new Server();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("AdvinhacaoInterface", obj);
            System.out.println("Servidor do Jogo de Adivinhação iniciado.");
        } catch (Exception e) {
            System.err.println("Erro ao iniciar o servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    public String jogoAdvinhacao(int numJogador) throws RemoteException {
        // Verifique se o palpite está correto
        String correcao = Correcao(numJogador);
        // Se o palpite estiver correto, gere um novo número aleatório
        if (correcao.equals("Correto")) {
            numeroAleatorio = Aleatorio();
        }
        return correcao;
    }

    public int Aleatorio() {
        Random randomico = new Random();
        // Gera um número aleatório entre 1 e 100
        return randomico.nextInt(100) + 1;
    }

    public String Correcao(int x) {
        if (x < 1 || x > 100) {
            return "Palpite inválido. Por favor, insira um número entre 1 e 100.";
        } else if (x > numeroAleatorio) {
            return "Alto";
        } else if (x < numeroAleatorio) {
            return "Baixo";
        } else {
            return "Correto";
        }
    }
}
