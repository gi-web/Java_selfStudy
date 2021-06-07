package inputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//FileInputStream(String name)-�����̸� name(�������)�� �Ű������� �Է¹޾� ��Ʈ���� ����
//FileInputStream(File f)-File Ŭ���� ������ �Ű������� �Է� �޾� �Է� ��Ʈ���� ����
public class FileInputStreamArray {

	public static void main(String[] args) {
		
		
		try(FileInputStream fis = new FileInputStream("inputArray.txt")) {
			byte[] bs=new byte[10];//�ѹ��� 10���ھ� �о� �迭�� �����Ѵ�.   
			int i;
			while ((i=fis.read(bs))!=-1) {//10 ���ھ� �дٰ� ���������� ���� ���ڱ��� ��ŭ�а� i���� ���� ���ڱ��̰� �ȴ�..
				for(int k=0; k<i ;k++) {//i����(�⺻10�� �������� ���� ���ڰ���)��ŭ ���ڸ� �ϳ��� �о�ͼ� �Ʒ� ���忡�� ����Ѵ�. 
					System.out.print((char)bs[k]);//�ƽ�Ű�ڵ尪�� ���ڷ� ��ȯ�ؼ� ���
				}
			System.out.println(":" +i+"����Ʈ ����");	
			
			}
			
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
