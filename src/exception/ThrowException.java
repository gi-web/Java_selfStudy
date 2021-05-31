package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
	
	public Class loadClass(String fileName, String className)
	       //���ܸ� �� �޼ҵ尡 ȣ��ɶ� ó���ϵ��� �̷�
			throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);//���ܹ߻�
		Class c= Class.forName(className);//���ܹ߻�
		return c;
		
	}
	
	

	public static void main(String[] args) {
		ThrowException test = new ThrowException();
		try {
			test.loadClass("a.text","java.lang.String");//�޼ҵ带 ȣ�� �Ҷ� ���� ó���� ��
		}catch(FileNotFoundException e){//�� ���� ��Ȳ ���� ���� ó���� ��
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {//����ó�� �� ���� Ŭ������ ����ó�� ���� �Ʒ��� ��ġ�ؾ��Ѵ�. ���ʿ� ��ġ�ϸ� �Ʒ��� ����ó���� ������� �ʴ´�.
			e.printStackTrace();
		}

	}

}
