package outputStream;

import java.io.FileOutputStream;

public class OutPutStreamArray2 {

	public static void main(String[] args) {
		//FileOutputStream fos= new FileOutputStream("outArray1.txt",true);//�ڹ�9���� ����
		//try(fos){
		try(FileOutputStream fos= new FileOutputStream("outArray2.txt")){//true��� ����Ʈ���� false�� ����
			byte[] bs= new byte[26];
			byte data=65;
			for(int i = 0;i<bs.length;i++) {//bs�Ǳ���(26)��ŭ �ݺ�
				bs[i]=data++;
			}
			fos.write(bs,2,10);//bs�� �ι�°��ġ���� 10��° ��ġ���� ���Ͽ� ��
			System.out.println("");//��ٲޱ���� ���� �־� ���� write�� ���Ͽ� ���� ���̶� ���� �ȵ�
			//������ ���̹� �����ο� ���� �ø�
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("����� �Ϸ� �Ǿ����ϴ�.");
		

	}

}
