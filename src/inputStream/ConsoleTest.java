package inputStream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		//직접 콘솔 창에서 자료를 입력받을때 사용하는 클래스 Console, 이클립스와 연동 되지 않음
		Console console = System.console();//콘솔클래스 반환
		
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
