package wrapper;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamReader1 {

	public static void main(String[] args) {
		
		//������Ʈ���� InputStreamReader�� ����Ʈ��Ʈ���� ���ڷ� ��ȯ���־��� ������ �ѱ��� ������ �ʴ´�.
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
