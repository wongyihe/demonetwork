package demonetwork;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class socketserverdemo {
	public static void main(String args[]) {
		mythread t = new mythread();
		t.start();
	}
}

class mythread extends Thread {
	ServerSocket ss;

	mythread() {
		try {
			ss = new ServerSocket(81);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void run() {
		while (true) {
			System.out.println("waiting...");
			try {
				Socket s = ss.accept();
				System.out.println(s.getLocalAddress());
				s.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
