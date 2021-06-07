package readerWrite;

import java.io.FileReader;
//바이트단위가 아닌 문자 단위로 읽기 때문에 한글 깨짐 현상이 없음
public class FileReader1 {

	public static void main(String[] args) {
		try(FileReader fr=new FileReader("reader.txt")) {
			int i;
			while((i=fr.read())!= -1) {
				System.out.print((char)i);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
