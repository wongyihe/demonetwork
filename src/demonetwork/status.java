package demonetwork;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class status {

	public static void main(String[] args) {
		try {
			Socket s = new Socket("www.yzu.edu.tw", 80);
			System.out.println(s.getInetAddress());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
