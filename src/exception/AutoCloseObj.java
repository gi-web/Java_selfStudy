package exception;

public class AutoCloseObj implements AutoCloseable {
//AutoCloseable인터페이슬 implement하면 반드시 close()메소드를 구현해 주어야 한다. 
	@Override
	public void close() throws Exception {
		System.out.println("리소스가 close()되었습니다");

	}

}
