package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest1 {

	public static void main(String[] args) {
		//�Ʒ������� true�� ����� ����Ʈ���� false�� �����Ǿ� ������ �����Ҷ����� ���� ������ ����.���λ����Ǹ�
		//�Ʒ��� ���� true�� �س����� �����Ҷ����� ������ �߰� �Ǿ� ���� ����� ����Ǿ� �����ȴ�.
		//������ selfStydyJava�� ���ΰ�ħ �ϸ� out.txt������ ������ ���� ���� �ִ�. 
		try(FileOutputStream fos = new FileOutputStream("out.txt",true)){//out.txt���ϻ���
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
