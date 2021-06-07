package inputStream;

import java.io.FileInputStream;
import java.io.IOException;

//FileInputStream(String name)-파일이름 name(경로포함)을 매개변수로 입력받아 스트림을 생성
//FileInputStream(File f)-File 클래스 정보를 매개변수로 입력 받아 입력 스트림을 생성
public class FileInputStreamTest1 {

	public static void main(String[] args) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("input.txt");
			//int read()메서드 : 입력스트림으로 부터 한 바이트씩 자료를 읽고 자료의 아스키코드값 반환
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println((char)fis.read());// char자료형으로 반환
			
		}catch (IOException e) {
			System.out.println(e);
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
				
			}catch (NullPointerException e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
