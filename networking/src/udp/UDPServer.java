 package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
	try {
		DatagramSocket ds = new DatagramSocket(8);
		byte[] b = new byte[10000];
		DatagramPacket in = new DatagramPacket(b, b.length);  
		System.out.println("Waiting for client's data");
		ds.receive(in);
		String x = new String(b);
		String x1 = x.trim();
		int n = Integer.parseInt(x1);
		String st = "";
		for(int i = 2; i < n; i++) {
			if(isPrime(i) && isPrime(i + 2)) {
				st = st + i + " " + (i + 2) + "\n";
			}
		}
		byte buff[] = st.getBytes();
		DatagramPacket out = new DatagramPacket(buff, buff.length, in.getAddress(), in.getPort());
		ds.send(out);
		ds.close();
	} catch(Exception e) {
		System.out.println(e);
	}
}
static boolean isPrime(int n) {
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
