package wrapper;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		//아래경로에 File클래스 생성, 아직 실제 파일이 생성된 것은 아님
		File file=new File("C:\\Java\\eclipse-workspace\\selfStudyJava\\newFile.txt");
		file.createNewFile();//실제 파일 생성//에러나타날때  throws로 예외처리
		//파일속성을 보여주는 메소드를 호출하여 출력
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath());
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();//파일삭제
		
		
		

	}

}
