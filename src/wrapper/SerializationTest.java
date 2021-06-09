package wrapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{//����ȭ �ϰڴٴ� �ǵ� ǥ��(��ũ�������̽�)
	/**
	 5������ ����� ���� ���콺 �ø��� Add generated serial version ID�����ϸ�
	 �Ʒ��� 10���� �ڵ尡 �ڵ�����
	 */
	private static final long serialVersionUID = 7932470477599339872L;//���������� ���� ����
	String name;
	transient  String sound;//����ȭ �������� ������ �����ϸ� ����ȭ�� null���� �����
	int leg;
	
	public Animal() {}
	
	public Animal(String name, String sound,  int leg) {
		this.name=name;
		this.sound=sound;
		this.leg=leg;
	}
	
	public String toString() {
		return name+","+sound+","+leg;
		
	}
	
	
}
public class SerializationTest {

	public static void main(String[] args) 
		throws ClassNotFoundException{//������ȭ �Ҷ� Ŭ���� ������ �������� �����������Ƿ� �ڵ� �߰�
		Animal dog=new Animal("����","�۸�",4);
		Animal bird=new Animal("������","±±",2);
		
		try(FileOutputStream fos=new FileOutputStream("serial.out");
			ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			//dog�� bird�� ���� ���Ͽ� ��(����ȭ)
			oos.writeObject(dog);
			oos.writeObject(bird);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(FileInputStream fis= new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			//dog�� bird���� ���Ͽ��� �о� �帲(������ȭ)
			Animal a1=(Animal)ois.readObject();
			Animal a2=(Animal)ois.readObject();
			
			System.out.println(a1);
			System.out.println(a2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
