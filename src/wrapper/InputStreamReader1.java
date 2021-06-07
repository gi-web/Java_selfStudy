package wrapper;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReader1 {

	public static void main(String[] args) {
		
		//보조스트림인 InputStreamReader이 바이트스트림을 문자로 변환해주었기 때문에 한글이 깨지지 않는다.
		try(InputStreamReader isr=new InputStreamReader
					(new FileInputStream("reader.txt"))) {
			int i;
			while((i=isr.read())!=-1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
