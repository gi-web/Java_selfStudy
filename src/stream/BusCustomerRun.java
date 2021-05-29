package stream;

import java.util.ArrayList;
import java.util.List;

public class BusCustomerRun {

	public static void main(String[] args) {
		BusCustomer lee = new BusCustomer("�̼���",40, 1000);
		BusCustomer park = new BusCustomer("�ڹ���",30, 1000);
		BusCustomer hong = new BusCustomer("ȫ�浿",10, 100);
		
		List<BusCustomer> customerList = new ArrayList<>();
		customerList.add(lee);
		customerList.add(park);
		customerList.add(hong);
		System.out.println("����� ���");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total =customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("�� ������ : "+total);
		
		System.out.println("15�� �λ� �� ��� �����Ͽ� ���");
		customerList.stream().filter(c->c.getAge() >=15)
			.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		

	}

}
