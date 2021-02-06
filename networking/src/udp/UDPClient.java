package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class UDPClient {

/**
* @param args
*/
public static void main(String[] args){
// TODO Auto-generated method stub

	try{
		InetAddress ia = InetAddress.getLocalHost();
		DatagramSocket ds = new DatagramSocket(1024,ia);
		Scanner sc = new Scanner(System.in);	
		System.out.println("Enter the range : ");
		String x = sc.nextLine();
		byte[] b = x.getBytes();
		DatagramPacket dp = new DatagramPacket(b, b.length, ia, 8);  
		ds.send(dp);
		System.out.println("sending to server: " + new String(b));
		byte[] buff = new byte[10000];
		DatagramPacket in = new DatagramPacket(buff, buff.length);  
		ds.receive(in);
		System.out.println("received from server: \n" + new String(buff));
		ds.close();
	} catch(SocketException se) {
		System.out.println(se);
	} catch(IOException ie) {
		System.out.println(ie);
	}
	}
}