package wrapper;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		//�Ʒ���ο� FileŬ���� ����, ���� ���� ������ ������ ���� �ƴ�
		File file=new File("C:\\Java\\eclipse-workspace\\selfStudyJava\\newFile.txt");
		file.createNewFile();//���� ���� ����//������Ÿ����  throws�� ����ó��
		//���ϼӼ��� �����ִ� �޼ҵ带 ȣ���Ͽ� ���
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();//���ϻ���
		
		
		

	}

}
