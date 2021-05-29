package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamRun {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("이순신");
		sList.add("유관순");
		sList.add("홍길동");
		
		Stream<String> stream=sList.stream();//스트림생성
		stream.forEach(s->System.out.print(s+" "));//배열의 요소를 하나씩 출력
		System.out.println();//줄바꿈
		
		sList.stream().sorted().forEach(s->System.out.print(s+"  "));
		//스트림새로생성  중간연산(정렬)     최송연산(배열요소 하나씩 출력)
		
		
		
	}

}
