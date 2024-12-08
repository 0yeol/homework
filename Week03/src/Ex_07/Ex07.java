//7-1, 7-2
package Ex_07;


public class Cat { //클래스 선언
	
}
class Cat { //클래스 선언
	
}
public class Car { //클래스 선언
	int wheel = 4; //필드 선언, 초기화
	//7-7
	int wheel; //필드 선언
	
	void ride() { //메서드 선언
		System.out.println("달립니다."); //메서드 호출되면 출력 
		//7-8
		System.out.println("씽씽씽"); //메서드 호출되면 출력
	}
}
public class Family { //클래스 선언
	//필드 선언
	String name;
	int age;
	String address = "서울";
}
public class Student { //클래스 선언
	static String schoolName = "코리아 고등학교"; //정적 멤버에 코리아 고등학교 저장
	//7-14
	String studentName; //인스턴스 필드 선언
	static void goToSchool() { //정적메서드 선언
		System.out.println("오늘은 학교에 가는 날입니다.");
	}
	void hello() { //인스턴스 메서드 선언
		System.out.println("안녕하세요, 제 이름은 " + studentName + "입니다.");
	}
	static void goToSchool() { //정적 메서드 선언
		System.out.println("학교에 갑니다."); //호출 시 출력
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Cat c = new Cat(); //Cat클래스를 이용해서 객체 생성
		//7-6
		Car c = new Car(); //클래스 이용해서 객체 생성
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다."); //필드 값 출력
		
		c.wheel = 5; //c 객체의 데이터 wheel 값을 5로 변경
		System.out.println("wheel의 개수는 " + c.wheel + "개입니다."); //필드 값 출력
		
		c.ride(); //메서드 호출
		c.ride();
		c.ride();
		//7-11
		//클래스로 객체생성
		Family father = new Family();
		Family son = new Family();
		//father객체.address에 인천 값 저장
		father.address = "인천";
		System.out.println(son.address); //son.address의 기본값 서울 출력
		//7-13
		System.out.println(Student.schoolName); //정적 필드 호출
		Student.goToSchool(); //정적 메서드 호출
		//7-15
		Student stu1 = new Student(); //객체 생성
		
		stu1.studentName = "김고이"; //객체명.studentName에 김고이 저장
		stu1.hello(); //메드 호출
		System.out.println("학교는 " + Student.schoolName + "입니다."); 
		Student.goToSchool(); //메서드 호출
		
		Student stu2 = new Student();
		stu1.studentName = "김고삼"; //객체명.studentName에 김고삼 저장
		stu2.hello();  //메서드 호출
		System.out.println("학교는 " + Student.schoolName + "입니다.");
		Student.goToSchool(); //메서드 호출
	}
	
	
}
