package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamRun {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("�̼���");
		sList.add("������");
		sList.add("ȫ�浿");
		
		Stream<String> stream=sList.stream();//��Ʈ������
		stream.forEach(s->System.out.print(s+" "));//�迭�� ��Ҹ� �ϳ��� ���
		System.out.println();//�ٹٲ�
		
		sList.stream().sorted().forEach(s->System.out.print(s+"  "));
		//��Ʈ�����λ���  �߰�����(����)     �ּۿ���(�迭��� �ϳ��� ���)
		
		
		
	}

}
