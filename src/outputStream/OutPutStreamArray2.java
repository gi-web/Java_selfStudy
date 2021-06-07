package outputStream;

import java.io.FileOutputStream;

public class OutPutStreamArray2 {

	public static void main(String[] args) {
		//FileOutputStream fos= new FileOutputStream("outArray1.txt",true);//자바9부터 지웜
		//try(fos){
		try(FileOutputStream fos= new FileOutputStream("outArray2.txt")){//true대신 디폴트값인 false로 설정
			byte[] bs= new byte[26];
			byte data=65;
			for(int i = 0;i<bs.length;i++) {//bs의길이(26)만큼 반복
				bs[i]=data++;
			}
			fos.write(bs,2,10);//bs의 두번째위치부터 10번째 위치까지 파일에 씀
			System.out.println("");//출바꿈기능을 위해 넣어 봤음 write는 파일에 쓰는 것이라 적용 안됨
			//적용방법 네이버 지식인에 질문 올림
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("출력이 완료 되었습니다.");
		

	}

}
