package wrapper;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond=0;
		try(FileInputStream fis = new FileInputStream("a.exe");
			FileOutputStream fos = new FileOutputStream("out2.zip");
			BufferedInputStream bis=new BufferedInputStream(fis);
			BufferedOutputStream bos=new BufferedOutputStream(fos)
				) {
			millisecond = System.currentTimeMillis();// 파일 복사 시작전 시간
			int i;
			while((i=bis.read()) != -1) {
				bos.write(i);
			}
			millisecond = System.currentTimeMillis()-millisecond;//파일 복사하는데 걸리는 시간
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사하는데 "+millisecond+"millisecond 소요");

	}

}
