package lambda;

import lambda.PrintString;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		//<인터페이스형 변수에 람다식 대입하기>
		//람다식을 인터페이스형 변수에 대입하고 그 변수를 사용해 람다식  구현부 호출
		PrintString lambdaStr=s->System.out.println(s);
		lambdaStr.showString("hello lamda_1");
		
		//<매개변수로 전달하는 람다식>
		//매서드의 매개변수로 람다식을 대입한 변수 전달 
		showMyString(lambdaStr);
		
		//<반환값으로 쓰이는 람다식>
		//람다식을 사용한 메서드를 변수로 반환받기
		PrintString reStr = returnString();
		reStr.showString("hello");//메서드 호출
	

	}
	
	//매개변수를 인터페이스 형으로 받음
	public static void showMyString(PrintString p) {
		p.showString("hello lamda_2");
	}
	
	//람다식을 반환하는 메소드
	public static PrintString returnString() {
		return s->System.out.println(s+"world");
	}

}
