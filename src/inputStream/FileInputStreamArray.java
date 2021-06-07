package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream(String name)-파일이름 name(경로포함)을 매개변수로 입력받아 스트림을 생성
//FileInputStream(File f)-File 클래스 정보를 매개변수로 입력 받아 입력 스트림을 생성
public class FileInputStreamArray {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("inputArray.txt")) {
			byte[] bs=new byte[10];//한번에 10글자씩 읽어 배열에 저장한다.   
			int i;
			while ((i=fis.read(bs))!=-1) {//10 글자씩 읽다가 마지막에는 남은 문자길이 만큼읽고 i값도 남은 문자길이가 된다..
				for(int k=0; k<i ;k++) {//i길이(기본10개 마지막은 남은 문자갯수)만큼 문자를 하나씩 읽어와서 아래 문장에서 출력한다. 
					System.out.print((char)bs[k]);//아스키코드값을 문자로 변환해서 출력
				}
			System.out.println(":" +i+"바이트 읽음");	
			
			}
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
