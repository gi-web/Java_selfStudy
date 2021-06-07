package outputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest1 {

	public static void main(String[] args) {
		//아래문장의 true를 지우면 디폴트값인 false로 설정되어 파일을 실행할때마다 기존 문장은 삭제.새로생성되며
		//아래와 같이 true로 해놓으면 실행할때마다 문장이 추가 되어 기존 문장과 연결되어 생성된다.
		//실행후 selfStydyJava를 새로고침 하면 out.txt파일이 생성된 것을 볼수 있다. 
		try(FileOutputStream fos = new FileOutputStream("out.txt",true)){//out.txt파일생성
			fos.write(65);
			fos.write(66);
			fos.write(67);
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
