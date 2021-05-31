package inputStream;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학교: ");
		String school = scanner.nextLine();//문자열로 학교이름 입력받기
		
		System.out.println("반: ");
		int grade = scanner.nextInt();//정수로 학년입력받기
		
		System.out.println("번호: ");
		int bun = scanner.nextInt();//정수로 번호력받기
		
		System.out.println(school);
		System.out.println(grade);
		System.out.println(bun);
		
		

	}

}
