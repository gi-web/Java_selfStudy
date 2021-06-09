package wrapper;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessTest {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rf= new RandomAccessFile("random.txt","rw");
		System.out.println("포인터 위치:"+rf.getFilePointer());//0번지부터 시작
		rf.writeInt(100);// int형은 4byte차지
		System.out.println("포인터 위치:"+rf.getFilePointer());
		rf.writeDouble(3.14);//8
		System.out.println("포인터 위치:"+rf.getFilePointer());
		rf.writeUTF("안뇽");//한글 1자 3byte*2글자*마지막 null문자(한글끝에 들어감) 2byte=8byte
		System.out.println("포인터 위치:"+rf.getFilePointer());
		
		//파일을 읽으려면 파일포인터 위치를 seek를 이용해 0번지로 동시켜주어야 한다. 
		rf.seek(0);
		System.out.println("포인터 위치:"+rf.getFilePointer());
		
		int i = rf.readInt();
		double d=rf.readDouble();
		String str=rf.readUTF();
		
		System.out.println("포인터 위치:"+rf.getFilePointer());//읽기가 끝난후 파일 포인터
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
		

	}

}
