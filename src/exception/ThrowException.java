package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowException {
	
	public Class loadClass(String fileName, String className)
	       //예외를 두 메소드가 호출될때 처리하도록 미룸
			throws FileNotFoundException, ClassNotFoundException{
		FileInputStream fis = new FileInputStream(fileName);//예외발생
		Class c= Class.forName(className);//예외발생
		return c;
		
	}
	
	

	public static void main(String[] args) {
		ThrowException test = new ThrowException();
		try {
			test.loadClass("a.text","java.lang.String");//메소드를 호출 할때 예외 처리를 함
		}catch(FileNotFoundException e){//각 예외 상황 마다 예외 처리를 함
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e) {//예외처리 최 상위 클래스로 예외처리 제일 아래에 위치해야한다. 윗쪽에 위치하면 아래의 예외처리는 실행되지 않는다.
			e.printStackTrace();
		}

	}

}
