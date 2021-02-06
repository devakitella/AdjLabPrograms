package net;
 
import java.io.*;
import java.net.*;

public class server {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			ServerSocket ss = new ServerSocket(2000);

			System.out.println("Server is ready for clients");

			Socket s = ss.accept();

			DataInputStream din = new DataInputStream(s.getInputStream());
			PrintStream pw = new PrintStream(s.getOutputStream()); 
			String x = din.readLine();
			int range = Integer.parseInt(x);

			String st = "";

			for(int i = 2; i < range; i++) {
				if(isPrime(i) && isPrime(i + 2)) {
					st = st + i + " " + (i + 2) + "\n";
				}
			}
			pw.println("List of Twin primes are: \n" + st);

			s.close(); 

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static boolean isPrime(int n) {
		if(n < 2) {
			return false;
		}
		else {
			for(int i = 2; i <= n / 2; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
    }
}
