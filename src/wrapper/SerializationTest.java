package wrapper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable{//직렬화 하겠다는 의도 표시(마크인터페이스)
	/**
	 5라인의 노란색 위에 마우스 올리고 Add generated serial version ID선택하면
	 아레의 10라인 코드가 자동생성
	 */
	private static final long serialVersionUID = 7932470477599339872L;//버전관리를 위한 정보
	String name;
	transient  String sound;//직렬화 하지않을 변수로 지정하면 직렬화시 null값이 저장됨
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
		throws ClassNotFoundException{//역직렬화 할때 클래스 정보가 존재하지 않을수있으므로 코드 추가
		Animal dog=new Animal("해피","멍멍",4);
		Animal bird=new Animal("구름이","짹짹",2);
		
		try(FileOutputStream fos=new FileOutputStream("serial.out");
			ObjectOutputStream oos=new ObjectOutputStream(fos)) {
			//dog와 bird의 값을 파일에 씀(직렬화)
			oos.writeObject(dog);
			oos.writeObject(bird);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(FileInputStream fis= new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			//dog와 bird값을 파일에서 읽어 드림(역직렬화)
			Animal a1=(Animal)ois.readObject();
			Animal a2=(Animal)ois.readObject();
			
			System.out.println(a1);
			System.out.println(a2);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
