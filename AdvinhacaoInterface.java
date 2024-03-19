import java.rmi.Remote;
import java.rmi.RemoteException;

public interface AdvinhacaoInterface extends Remote {
    String jogoAdvinhacao(int numJogador) throws RemoteException;
}
