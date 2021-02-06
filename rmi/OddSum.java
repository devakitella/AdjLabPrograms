import java.rmi.*;

public interface OddSum extends Remote {
public int oddsum(int n) throws RemoteException;
}