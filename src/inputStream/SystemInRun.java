package inputStream;

import java.io.IOException;

public class SystemInRun {

	public static void main(String[] args) {
		System.out.println("영어 문장 입력후 enter 누르기 ");
		int a;
		try {
			while((a=System.in.read()) != '\n' ){//enter키(-1또는 '\n')가입력될때까지 입력받음
				System.out.println((char)a);//enter키가 입력되면 입력받은 문자 출력
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
