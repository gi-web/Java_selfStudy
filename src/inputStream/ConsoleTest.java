package inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		//���� �ܼ� â���� �ڷḦ �Է¹����� ����ϴ� Ŭ���� Console, ��Ŭ������ ���� ���� ����
		Console console = System.console();//�ܼ�Ŭ���� ��ȯ
		
		System.out.println("id : ");
		String id = console.readLine();
		System.out.println("job : ");
		String job = console.readLine();
		System.out.println("password : ");
		char[] pass= console.readPassword();
		String strPass = new String(pass);
		
		System.out.println(id);
		System.out.println(job);
		System.out.println(strPass);
		
		

	}

}
