package inputStream;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream(String name)-�����̸� name(�������)�� �Ű������� �Է¹޾� ��Ʈ���� ����
//FileInputStream(File f)-File Ŭ���� ������ �Ű������� �Է� �޾� �Է� ��Ʈ���� ����
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("input.txt");
			//int read()�޼��� : �Է½�Ʈ������ ���� �� ����Ʈ�� �ڷḦ �а� �ڷ��� �ƽ�Ű�ڵ尪 ��ȯ
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println((char)fis.read());// char�ڷ������� ��ȯ
			
		}catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				
			}catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
