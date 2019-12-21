package demonetwork;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

public class geturl {

	public static void main(String[] args)throws IOException {
		 
			URL url=new URL("http://140.138.146.85");
			HttpURLConnection conn=(HttpURLConnection) url.openConnection();
			conn.connect();
			BufferedInputStream is=new BufferedInputStream(conn.getInputStream());
			byte [] tmp = new byte[1024];
			int len=0;
			    final Charset UTF_8 = Charset.forName("UTF-8");
			while ((len = is.read(tmp)) != -1) {
			            
			String value = new String(tmp, UTF_8);
			System.out.print(value);
			            }
			is.close();
			}


	}

