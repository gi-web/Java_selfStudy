package exception;

public class AutoCloseRun {

	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception();//강제로 예외를 발생시킴
		}catch(Exception e) {
			System.out.println("예외 부분입니다. ");
		}

	}

}
