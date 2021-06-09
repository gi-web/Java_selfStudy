package wrapper;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Bird implements Externalizable{
	
	String name;
	String sound;
	int leg;
	
	public Bird() {}//�̻����ڸ� ������ ������ external.out�� ����� ������ �о�ö� ��������
//Externalizable�������̽��� �޼��� ���α׷��Ӱ� ���� ����
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(sound);
		out.write(leg);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name=in.readUTF();
		sound=in.readUTF();
		leg=in.read();
		
	}
	
	public String toString() {
		return name+","+sound+","+leg;
	}
	
	
}

public class ExternalizableTest {

	public static void main(String[] args)
		throws IOException, ClassNotFoundException{//������ �о�ö� try-catch�� ������
		Bird myBird=new Bird();
		myBird.name="������";
		myBird.sound="±±";
		myBird.leg=2;
		
		FileOutputStream fos=new FileOutputStream("external.out");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		try(fos;oos) {
			oos.writeObject(myBird);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		FileInputStream fis = new FileInputStream("external.out");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Bird b1=(Bird)ois.readObject();
		System.out.println(b1);
		System.out.println("��");
		

	}

}
