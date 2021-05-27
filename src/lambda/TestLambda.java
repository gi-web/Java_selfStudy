package lambda;

import lambda.PrintString;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//<�������̽��� ������ ���ٽ� �����ϱ�>
		//���ٽ��� �������̽��� ������ �����ϰ� �� ������ ����� ���ٽ�  ������ ȣ��
		PrintString lambdaStr=s->System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		
		//<�Ű������� �����ϴ� ���ٽ�>
		//�ż����� �Ű������� ���ٽ��� ������ ���� ���� 
		showMyString(lambdaStr);
		
		//<��ȯ������ ���̴� ���ٽ�>
		//���ٽ��� ����� �޼��带 ������ ��ȯ�ޱ�
		PrintString reStr = returnString();
		reStr.showString("hello");//�޼��� ȣ��
	

	}
	
	//�Ű������� �������̽� ������ ����
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
	
	//���ٽ��� ��ȯ�ϴ� �޼ҵ�
	public static PrintString returnString() {
		return s->System.out.println(s+"world");
	}

}
