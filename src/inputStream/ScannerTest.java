package inputStream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�б�: ");
		String school = scanner.nextLine();//���ڿ��� �б��̸� �Է¹ޱ�
		
		System.out.println("��: ");
		int grade = scanner.nextInt();//������ �г��Է¹ޱ�
		
		System.out.println("��ȣ: ");
		int bun = scanner.nextInt();//������ ��ȣ�¹ޱ�
		
		System.out.println(school);
		System.out.println(grade);
		System.out.println(bun);
		
		

	}

}
