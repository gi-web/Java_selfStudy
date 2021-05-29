package stream;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name=name;
		this.price=price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class LibaryRun {
	

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바",25000));
		bookList.add(new Book("파이썬",15000));
		bookList.add(new Book("안드로이드",30000));
		
		int total = bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("모든책 가격의 합은 "+total+"입니다");
		
		System.out.println("**책 가격이 20,000원 이상인 책의 이름을 정렬 하여 출력하면 아래와 같습니다. **");
		bookList.stream().filter(c->c.getPrice() >= 20000)
			.map(c->c.getName()).sorted().forEach(c->System.out.println(c));
		
	}

}
