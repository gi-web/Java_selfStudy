package readerWrite;

import java.io.FileReader;
//����Ʈ������ �ƴ� ���� ������ �б� ������ �ѱ� ���� ������ ����
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
