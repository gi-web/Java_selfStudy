package exception;

public class AutoCloseObj implements AutoCloseable {
//AutoCloseable�������̽� implement�ϸ� �ݵ�� close()�޼ҵ带 ������ �־�� �Ѵ�. 
	@Override
	public void close() throws Exception {
		System.out.println("���ҽ��� close()�Ǿ����ϴ�");

	}

}
