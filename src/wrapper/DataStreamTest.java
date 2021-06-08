package wrapper;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamTest {

	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream
				(new FileOutputStream("data.txt")) ) {
			//�� �ڷ����� �°� �ڷḦ ��
			dos.writeByte(100);	
			dos.writeChar('a');	
			dos.writeInt(200);	
			dos.writeFloat(3.14f);	
			dos.writeUTF("�� ��� HELLO");	
			
				
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try(DataInputStream dis = new DataInputStream
				(new FileInputStream("data.txt"))) {
			//���Ͽ� �� ������ �ڷ����� �����Ͽ� ���� �޼���� �о� ��
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
