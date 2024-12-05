package Ex_08;


public class Ex08 {
	
	//8-4
	
	
	public static void main(String[] args) {
		//8-1
		printHello(); //main 메서드 안에서 printHello() 메서드 호출
		//8-5
		Jogger jogger = new Jogger(); //객체 생성
		jogger.run(); //Jogger 인스턴스의 rum()메서드 호출
		//Jogger jogger = new Jogger(); //객체 생성
		jogger.name = "김나비"; //jogger클래스에 name이라는 변수에 김나비 저장
		jogger.sayName(); //jogger 인스턴스의 sayName() 메서드 호출
		jogger.run(); //jogger 인스턴스의 run() 메서드 호출
		//8-7
		Book myBook = new Book(); //객체 생성
		myBook.count(3); // Book클래스에 count메서드 값에 3을 넣어 호출
		//8-9
		Calc calc = new Calc(); //객체 생성 
		calc.sum(5, 3); //calc 클래스에 sum메서드 호출 값에(5,3)
		calc.sum(10, 7); //calc 클래스에 sum메서드 호출 값에(10,7)
		//8-11
		Person hong = new Person(); //객체생성
		hong.introduce("홍길동", 20); //hong 인스턴스 introduce 메서드 호출 
		hong.hello(); //hong 인스턴스 hello메서드 호출
		//8-13
		int nums[] = {100, 200}; //배열 생성
		//Calc calc = new Calc(); //객체 생성
		calc.sum(nums); //calc 인스턴스의 sum 메서드 호출
		//8-15
		int[] nums1 = {500,200}; //배열 생성
		//Calc calc = new Calc(); //객체 생성
		System.out.println("숫자들의 합은 " + calc.sum1(nums) + "입니다.");
		//calc 인스턴스 sum1 메서드 호출 후 반환된 값 출력
		//8-17
		int[] studentA = {97, 53}; //배열생성
		int[] studentB = {95, 66}; //배열생성
		
		MidTerm mid = new MidTerm(); //객체 생성
		int sumA = mid.score(studentA); //sumA에 score에 호출된 값 저장
		int sumB = mid.score(studentB); //sumB에 score에 호출된 값 저장
		
		if(sumA > sumB) //만약 sumA가 더크면
		{
			System.out.println("A학생의 중간고사 총점이 더 높습니다.");
		}
		else if(sumA < sumB) //만약 sumB가 더크면
		{
			System.out.println("B학생의 중간고사 총점이 더 높습니다.");
		}
		else //다 아니면
		{
			System.out.println("두 학생의 중간고사 총점이 같습니다.");
		}
		
		
		
		
		
	}
	//8-1
	static void printHello() //printHello()라는 메서드 선언
	{ 								//조건부
		System.out.println("안녕하세요");    //괄호안 출력
		System.out.println("만나서 반값습니다."); //괄호안 출력 
	}
	
	
	
}
