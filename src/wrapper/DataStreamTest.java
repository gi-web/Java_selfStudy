package wrapper;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream
				(new FileOutputStream("data.txt")) ) {
			//각 자료형에 맞게 자료를 씀
			dos.writeByte(100);	
			dos.writeChar('a');	
			dos.writeInt(200);	
			dos.writeFloat(3.14f);	
			dos.writeUTF("굿 모닝 HELLO");	
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream
				(new FileInputStream("data.txt"))) {
			//파일에 쓴 순서와 자료형을 같이하여 같은 메서드로 읽아 함
			 System.out.println(dis.readByte());
			 System.out.println(dis.readChar());
			 System.out.println(dis.readInt());
			 System.out.println(dis.readFloat());
			 System.out.println(dis.readUTF());
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
