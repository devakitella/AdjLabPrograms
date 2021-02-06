package net;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class client {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		try {
			Socket s = new Socket("localhost", 2000);

			DataInputStream din = new DataInputStream(s.getInputStream());
			PrintStream pw = new PrintStream(s.getOutputStream());

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the range : ");
			String s1 = sc.nextLine();
			pw.println(s1);

			System.out.println("Server :");

			String thisLine = null;

			while((thisLine = din.readLine()) != null) {
				System.out.println(thisLine);
			}

			s.close();

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
