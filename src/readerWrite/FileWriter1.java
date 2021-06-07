package readerWrite;


import java.io.FileWriter;
//바이트단위가 아닌 문자 단위로 읽기 때문에 한글 깨짐 현상이 없음
public class FileWriter1 {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("write.txt")) {
			
			fw.write('A');
			char buf[] = {'B','C','D','E'};
			
			fw.write(buf);
			fw.write("햇살 좋은 아침");
			fw.write("65");//문자 65로 인식
			fw.write(65);//아스키코드값 65로 인식
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료 되었습니다. ");
	}
	

}
