package exception;

public class AutoCloseRun {

	public static void main(String[] args) {
		AutoCloseObj obj = new AutoCloseObj();
		try(obj){
			throw new Exception();//������ ���ܸ� �߻���Ŵ
		}catch(Exception e) {
			System.out.println("���� �κ��Դϴ�. ");
		}

	}

}
