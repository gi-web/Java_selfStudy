package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream(String name)-파일이름 name(경로포함)을 매개변수로 입력받아 스트림을 생성
//FileInputStream(File f)-File 클래스 정보를 매개변수로 입력 받아 입력 스트림을 생성
public class FileInputStreamTest2 {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("input.txt")) {
			int i;
			while ((i=fis.read())!=-1) {//문장 끝까지 바이트 단위로 한 글자씩 읽는다.
				System.out.println((char)i);//아스키코드값을 문자로 변환해서 출력
			
			}
			System.out.println("end");
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
