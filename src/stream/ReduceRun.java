package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


//BinaryOperator�� ������ Ŭ���� ����
class CompareSt implements BinaryOperator<String>{
	//reduce()�޼��尡 ȣ��ɶ� �Ҹ��� �޼���, �� ���ڿ� ������ ��
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
}

public class ReduceRun {

	public static void main(String[] args) {
		String[] greetings = {"�ȳ� �ϼ��� ~~~", "�ȳ�","���� ��ħ","�ݰ����ϴ�.^^"};
		//���ٽ��� ���� �����ϴ� ���
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
		                                        //reduce(�ʱⰪ, �Ű����� -> {��ɱ���} 
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;	}));
		
		//BinaryOperator�� Ŭ���� ���
		String str=Arrays.stream(greetings).reduce(new CompareSt()).get();
		System.out.println(str);

	}

}
