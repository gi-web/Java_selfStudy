package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;


//BinaryOperator를 구현한 클래스 정의
class CompareSt implements BinaryOperator<String>{
	//reduce()메서드가 호출될때 불리는 메서드, 두 문자열 길이을 비교
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length)
			return s1;
		else return s2;
	}
}

public class ReduceRun {

	public static void main(String[] args) {
		String[] greetings = {"안녕 하세요 ~~~", "안녕","좋은 아침","반갑습니다.^^"};
		//람다식을 직접 구현하는 방법
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
		                                        //reduce(초기값, 매개변수 -> {기능구현} 
			if(s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else return s2;	}));
		
		//BinaryOperator를 클래스 사용
		String str=Arrays.stream(greetings).reduce(new CompareSt()).get();
		System.out.println(str);

	}

}
