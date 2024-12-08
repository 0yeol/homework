package Ex_09;
//9-1
public class Snack { //클래스 선언
	int price; //필드 선언
	
	//9-3
	Snack(int p) { //생성자 생성
		price = p; //매개변수로 받은 값 price(필드)에 저장 
	}
	void info() { //메서드 선언
		System.out.println("-과자의 가격은" + price + "원입니다."); //호출 시 출력
	}
}
public class Person { //클래스 선언
	//필드
	String name;
	int age;
	
	Person(String n, int a) //생성자
	{
		//매개변수로 받은 값 저장
		name = n;
		age = a;
	}
	void introduce() { //메서드 선언
		System.out.println("안녕하세요.저는 " + age + "세" + name + "입니다.");
	}
}
//9-7
public class Phone { //클래스 선언
	//필드
	String brand;
	int series;
	String color = "검정색"; //필드 기본값
	
	//생성자
	//매개변수 3개 받는 생성자-
	public Phone(String b, int s, String c) {
		brand = b;
		series = s;
		color = c;
	}
	//9-9
	//매개 변수 2개 받는 생성자
	public Phone(String b, int s) {
		brand = b;
		series = s;
	}
	
	
	//메서드
	void phoneInfo() {
		System.out.println(color + " " + brand + " " + series);
	}
	
}
//9-11
public class Book { //클래스 선언
	//필드 선언 및 초기화
	String title = "제목없음";
	int series = 1;
	int page = 100;
	
	Book() { //기본 생성자
		
	}
	Book(String t) { //title값만 받는 생성자
		title = t;
	}
	Book(String t, int p) //title, page 값 받는 생성자
	{
		title = t;
		page = p;
	}
	Book( int s, String t) //title, series 값 받는 생성자
	{
		title = t;
		series = s;
	}
}
public class Ex09 {
	public static void main(String[] args) {
		//9-2
		Snack chip = new Snack(); //객체 생성
		chip.price = 2000; //객체명.필드값 price에 2000저장
		chip.info(); //메서드 호출
		//9-4
		Snack chip = new Snack(5000); //객체 생성, 필드 초기화
		chip.info(); //메서드 호출
		//9-6
		Person p1 = new Person("김자바", 20); //객체 생성, 필드 초기화
		Person p2 = new Person("이코딩", 40);
		p1.introduce(); //객체 p1에 저장된 필드값으로 메서드 호출
		p2.introduce(); //객체 p2에 저장된 필드값으로 메서드 호출
		//9-8
		//객체 생성 및 초기화
		Phone p1 = new Phone("갤럭시", 1, "흰색");
		Phone p2 = new Phone("아이폰", 2); //컴파일 오류(매개변수를 2개 받는 생성자가 없어서 오류)
		//9-10
		//객체 생성 및 초기화
		Phone p1 = new Phone("갤럭시", 1, "흰색"); //매개변수 3개있는 생성자로 이동
		Phone p2 = new Phone("아이폰", 2); //매개변수 2개있는 생성자로 이동
		
		p1.phoneInfo(); //p1 메서드 호출
		p2.phoneInfo(); //p2 메서드 호출
		//9-12
		Book b1 = new Book(); //객체 생성(기본 생성자로 감)
		//기본으로 저장되어 있는 값들 출력
		System.out.println("b1.title: " + b1.title);
		System.out.println("b1.series: " + b1.series);
		System.out.println("b1.page: " + b1.page);
		
		Book b2 = new Book("멘토시리즈 자바"); //객체생성(title값만 받는 생성자로 감)
		//title값만 바뀌고 나머지는 기본값
		System.out.println("b2.title: " + b2.title);
		System.out.println("b2.series: " + b2.series);
		System.out.println("b2.page: " + b2.page);
		
		Book b3 = new Book("신데렐라", 170); //객체생성(title, page값 받는 생성자로 감)
		//title, page 값은 바뀌고 나머지는 기본값
		System.out.println("b3.title: " + b3.title);
		System.out.println("b3.series: " + b3.series);
		System.out.println("b3.page: " + b3.page);
		
		Book b4 = new Book(5, "노인과 바다"); //객체생성(series, title값 받는 생성자로 감)
		//title, page 값은 바뀌고 나머지는 기본값
		System.out.println("b4.title: " + b4.title);
		System.out.println("b4.series: " + b4.series);
		System.out.println("b4.page: " + b3.page);
	}
	
	
}
