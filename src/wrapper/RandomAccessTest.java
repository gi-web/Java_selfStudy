package wrapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf= new RandomAccessFile("random.txt","rw");
		System.out.println("������ ��ġ:"+rf.getFilePointer());//0�������� ����
		rf.writeInt(100);// int���� 4byte����
		System.out.println("������ ��ġ:"+rf.getFilePointer());
		rf.writeDouble(3.14);//8
		System.out.println("������ ��ġ:"+rf.getFilePointer());
		rf.writeUTF("�ȴ�");//�ѱ� 1�� 3byte*2����*������ null����(�ѱ۳��� ��) 2byte=8byte
		System.out.println("������ ��ġ:"+rf.getFilePointer());
		
		//������ �������� ���������� ��ġ�� seek�� �̿��� 0������ �������־�� �Ѵ�. 
		rf.seek(0);
		System.out.println("������ ��ġ:"+rf.getFilePointer());
		
		int i = rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		
		System.out.println("������ ��ġ:"+rf.getFilePointer());//�бⰡ ������ ���� ������
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		

	}

}
