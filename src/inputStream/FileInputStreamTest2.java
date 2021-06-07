package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream(String name)-�����̸� name(�������)�� �Ű������� �Է¹޾� ��Ʈ���� ����
//FileInputStream(File f)-File Ŭ���� ������ �Ű������� �Է� �޾� �Է� ��Ʈ���� ����
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while ((i=fis.read())!=-1) {//���� ������ ����Ʈ ������ �� ���ھ� �д´�.
				System.out.println((char)i);//�ƽ�Ű�ڵ尪�� ���ڷ� ��ȯ�ؼ� ���
			
			}
			System.out.println("end");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
