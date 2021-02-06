import java.rmi.*;
import java.util.*;

public class RMIClient {
public static void main(String args[])  throws Exception {

int n, sum = 0;

Scanner sc = new Scanner(System.in);
System.out.println("Enter number of elements:");
n = sc.nextInt();

OddSum os = (OddSum)Naming.lookup("rmi://localhost:1099/sumServer");

sum = os.oddsum(n);

System.out.println("Sum of first n odd numbers is:"+sum);
}
}