package readerWrite;


import java.io.FileWriter;
//����Ʈ������ �ƴ� ���� ������ �б� ������ �ѱ� ���� ������ ����
public class FileWriter1 {

	public static void main(String[] args) {
		try(FileWriter fw=new FileWriter("write.txt")) {
			
			fw.write('A');
			char buf[] = {'B','C','D','E'};
			
			fw.write(buf);
			fw.write("�޻� ���� ��ħ");
			fw.write("65");//���� 65�� �ν�
			fw.write(65);//�ƽ�Ű�ڵ尪 65�� �ν�
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ� �Ǿ����ϴ�. ");
	}
	

}
