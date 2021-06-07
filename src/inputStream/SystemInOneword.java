package inputStream;

import java.io.IOException;

public class SystemInOneword {

	public static void main(String[] args) {
		int i ;
		try {
			i=System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
