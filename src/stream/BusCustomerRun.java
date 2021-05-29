package stream;

import java.util.ArrayList;
import java.util.List;

public class BusCustomerRun {

	public static void main(String[] args) {
		BusCustomer lee = new BusCustomer("이순신",40, 1000);
		BusCustomer park = new BusCustomer("박문수",30, 1000);
		BusCustomer hong = new BusCustomer("홍길동",10, 100);
		
		List<BusCustomer> customerList = new ArrayList<>();
		customerList.add(lee);
		customerList.add(park);
		customerList.add(hong);
		System.out.println("고객명단 출력");
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		
		int total =customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 버스비 : "+total);
		
		System.out.println("15세 인상 고객 명단 정력하여 출력");
		customerList.stream().filter(c->c.getAge() >=15)
			.map(c->c.getName()).sorted().forEach(s->System.out.println(s));
		

	}

}
