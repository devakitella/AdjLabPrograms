import java.rmi.*;
import java.rmi.server.*;

public class RMIServer extends UnicastRemoteObject implements OddSum {

public RMIServer() throws RemoteException {
super();
}

public int oddsum(int n)throws RemoteException {
int sum = 0, o = 1;
for(int i = 0; i < n; i++) {
sum = sum + o;
o = o + 2;
}
return sum;
}

public static void main(String args[]) throws Exception {
RMIServer server = new RMIServer();
System.out.println("RMI Server is running");
Naming.rebind("sumServer",server);
}
}