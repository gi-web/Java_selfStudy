package inputStream;

import java.io.IOException;

public class SystemInRun {

	public static void main(String[] args) {
		System.out.println("���� ���� �Է��� enter ������ ");
		int a;
		try {
			while((a=System.in.read()) != '\n' ){//enterŰ(-1�Ǵ� '\n')���Էµɶ����� �Է¹���
				System.out.print((char)a);//enterŰ�� �ԷµǸ� �Է¹��� ���� ���
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
