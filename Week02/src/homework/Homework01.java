package homework;

public class Homework01 {
	public static void main(String[] args) {
		//2-1
		System.out.print("welcome"); //괄호안에  데이터 welcome을 콘솔창에 출력(줄바꿈 X)
		System.out.print("JAVA World"); //괄호안에 데이터 JAVA World를 콘솔창에 출력(줄바꿈X)
		//2-2
		System.out.println("welcome"); //괄호안에  데이터 welcome을 콘솔창에 출력(줄바꿈 O)
		System.out.println("JAVA World"); //괄호안에 데이터 JAVA World를 콘솔창에 출력(줄바꿈O)
		//2-3
		System.out.printf("저는 대학교 %d 학년에 재학중입니다!", 3); //%d로 형식을 int로 지정하여 콘솔창에 출력(줄바꿈 X)
		//2-4
		System.out.printf("%d은 첫 번째, %f은 두 번째, %s은 세번째.", 1, 2.0, "셋"); //%d로 형식을 정수형로 %f로 실수형으로 %s로 문자열로 지정하여 괄호안에 데이터를 콘솔창에 출력
		//2-5
		System.out.printf("%5d", 1); //정수형으로 형식을 지정하고 오른쪽으로 정렬하여 5칸의 너비로 콘솔창에 1 출력
	    System.out.println();
	    System.out.printf("%5d", 12); //정수형으로 형식을 지정하고 오른쪽으로 정렬하여 5칸의 너비로 콘솔창에 12출력
	    System.out.println();
	    System.out.printf("%5d", 123); //정수형으로 형식을 지정하고 오른쪽으로 정렬하여 5칸의 너비로 콘솔창에 123출력
	    System.out.println();
	    System.out.printf("%5d", 1234); //정수형으로 형식을 지정하고 오른쪽으로 정렬하여 5칸의 너비로 콘솔창에 1234출력
	    System.out.println();
	    System.out.printf("%5d", 12345); //정수형으로 형식을 지정하고 오른쪽으로 정렬하여 5칸의 너비로 콘솔창에 12345출력
	   //2-6
	    System.out.printf("%.1f", 1.1234567); //실수형으로 형식을 지정하고 소수점을 1자리까지 출력(반올림하여 출력됨) 
        System.out.println();
        System.out.printf("%.2f", 1.1234567); //실수형으로 형식을 지정하고 소수점을 2자리까지 출력(반올림하여 출력됨)
        System.out.println();
        System.out.printf("%.3f", 1.1234567); //실수형으로 형식을 지정하고 소수점을 3자리까지 출력(반올림하여 출력됨)
        System.out.println();
        System.out.printf("%.4f", 1.1234567); //실수형으로 형식을 지정하고 소수점을 4자리까지 출력(반올림하여 출력됨)
        System.out.println();
        System.out.printf("%.5f", 1.1234567); //실수형으로 형식을 지정하고 소수점을 5자리까지 출력(반올림하여 출력됨)
        //2-7
        int studentAge; // 학생의 나이를 저장할 수 있는 변수 선언
        studentAge = 20; // 변수에 값을 저장
        System.out.println(studentAge); //변수 정수형타입 studentAge에 저장된 값을 출력 후 줄바꿈
        //2-8
        String myCity = "Seoul"; // 문자열타입으로 변수 myCity를 선언하고, 변수에 "Seoul"을 저장  
        System.out.println("I am from " + myCity); //I am from과 myCity에 저장된 값을 연결하여 출력 후 줄바꿈
        //2-9
        int myAge = 20; //정수형 타입으로 myAge라는 변수를 선언하고, 변수에 20을 저장
        int yourAge = myAge; //정수형 타입으로 yourAge라는 변수를 선언하고, 변수에 myAge에 저장된 값을 저장
        System.out.println(myAge); //정수형 myAge라는 변수에 저장된 값을 출력 후 줄바꿈
        System.out.println(yourAge); //정수형 yourAge라는 변수에 저장된 값을 출력 후 줄바꿈
        //2-10
        int myAge = 20; //정수형 타입으로 myAge라는 변수를 선언하고, 변수에 20을 저장
        int yourAge = 30; //정수형 타입으로 yourAge라는 변수를 선언하고, 변수에 30을 저장
        int tempAge;	//정수형 타입으로 tempAge라는 변수 선언
        tempAge = myAge;   //myAge에 저장된 값을 tempAge에 저장
        myAge = yourAge;   //yourAge의 값을 myAge에 저장
        yourAge = tempAge; //tempAge에 저장해둔 myAge 값을 yourAge에 저장
        System.out.println(myAge); //myAge에 저장된 값 출력 후 줄바꿈
        System.out.println(yourAge); //yourAge에 저장된 값 출력 후 줄바꿈
        //2-11
        byte num1 = 20;	//byte형으로 num1을 선언하고, 변수에 20을 저장 
        short num2 =30;	//short형으로 num2을 선언하고, 변수에 30을 저장
        int num3 = 40;	//int형으로 num3을 선언하고, 변수에 40을 저장
        long num4 = 50; //long형으로 num4을 선언하고, 변수에 50을 저장	        
        System.out.println(num1);	//num1에 저장된 값을 출력 후 줄바꿈
        System.out.println(num2);	//num2에 저장된 값을 출력 후 줄바꿈
        System.out.println(num3);	//num3에 저장된 값을 출력 후 줄바꿈
        System.out.println(num4);	//num4에 저장된 값을 출력 후 줄바꿈
        //2-12
        byte num1 = 0110; //byte형으로 num1을 선언하고, 변수에 2진수값으로 0110 저장
        short num2 = 0107;//short형으로 num2을 선언하고, 변수에 8진수값으로 0107 저장
        int num3 = 0x46;//int형으로 num3을 선언하고, 변수에 16진수값으로 0x46 저장
        long num4 = 69L;//long형으로 num4을 선언하고, 변수에 10진수값으로 69 저장
        System.out.println(num1);	//num1에 저장된 값을 출력 후 줄바꿈
        System.out.println(num2);	//num2에 저장된 값을 출력 후 줄바꿈
        System.out.println(num3);	//num3에 저장된 값을 출력 후 줄바꿈
        System.out.println(num4);	//num4에 저장된 값을 출력 후 줄바꿈
      //2-13
        double marathon = 42.195; //실수형 더블타입으로 marathon이라는 변수를 선언하고, 변수 값에 42.195 저장
        float halfMarathon = 21.0975f; //실수형 float타입으로 halfMarathon 이라는 변수를 선언하고, 변수값에 21.0975 저장(마지막문자에 f를 써야됨)

        System.out.println("마라톤은 + marathon" + "km를 달립니다. " ); //문자열과 marathon 값을 연결하여 출력후 줄바꿈
        System.out.println("하프마라톤은 + halfMarathon" +"km를 달립니다." ); // 문자열과 halfMarathon값을 연결하여 출력 후 줄바꿈
        //2-14
        double pieDouble = 3.141592653589793;
        //실수형 double 타입으로 pieDouble를 선언하고, 변수에 값저장
        float pieFloat = 3.141592653589793f;
        //실수형 float 타입으로 pieFloat를 선언하고, 변수에 값저장
        System.out.println("double : " + pieDouble);
        //문자열과 소수점 15자리까지의 값을 연결하여 출력 후 줄바꿈
        System.out. println("float: " + pieFloat);
        //문자열과 소수점 6자리까지의 값을 연결하여 출력 후 줄바꿈
        //2-15
        char ga = '가';
        char na = '나';
        //2-16

        int ga = '가'; //가의 유니코드값으로 저장
        int na = '나'; //나의 유니코드값으로 저장

        int alphabetA ='A'; 
        //유니코드(정수) 65-'A'와 매핑됨 
        int alphabetB='B'; 
        //유니코드(정수) 66-'B'와 매핑됨

        System.out.println(ga); 
        //'가'의유니코드 값 출력 
        System.out.println(na);
         //'나'의유니코드 값 출력
        System.out.println(alphabetA);
        //alphabetA의 유니코드값 출력
        System.out .println(alphabetB);
        //alphabetB의 유니코드값 출력
        //2-17
        int alphabetA = 'A'; //'A‘의 유니코드 65가 저장됨 
        int alphabetB = 'B'; //'B'의 유니코드66이 저장
        System.out. println(alphabetA); //alphabetA에 저장된 값이 유니코드 숫자로 출력
        System.out. println(alphabetB); //alphabetB에 저장된 값이 유니코드 숫자로 출력
        char alphabetC = 67; // 유니코드67의 값인 'C'가 저장됨
        System.out. println(alphabetC); //alphabetC에 저장된 값이 뮨자형으로 출력
        //2-18
        boolean isStudent = true; //isStudent에 true(참)이라는 값이 들어감
        System.out.println(isStudent); //isStudent 값에 저장된 true값이 출력됨
        //2-19
        boolean isStudent = true; //isStudent에 true(참)이라는 값이 들어감
        if(isStudent) //만약 isStudent의 값이 참이면
        {
        	System.out.println("저는 학생입니다."); //참일 때 콘솔창에 출력
        }
        else //만약 참이 아니라면 
        {
        	System.out.println("저는 학생이 아닙니다."); //거짓일 때 콘솔창에 출력
        }
    	//2-20	  
    	String hi = "안녕하세요"; // 문자열 변수에 hi라는 변수를 선언하고, hi값에 안녕하세요 입력
    	String niceToMeetYou = "만나서 반갑습니다.";  //문자열 변수에 niceToMeetYou를 선언하고, 그 값에 만나서 반갑습니다를 저장	System.out.println(hi); // hi값을 출력 후 줄바꿈
    	System.out.println(niceToMeetYou); //niceTOMeetYou값을 출력 후 줄바꿈
    	//2-21
    	int num1 = 11; //정수형 변수 num1를 선언하고, 값 11 저장
    	double num2 = 3.14; //실수형 변수 num2를 선언하고 3.14 저장;
    	double num1Change = (double)num1; //실수형 num1Change값에 num1값을 실수형으로 형변환하여 저장 
    	
    	System.out.println("num1 : " + num1); //num1의 값을 출력 후 줄바꿈
    	System.out.println("num1Change : "+ num1Change); //nun1Change 값을 출력 후 줄바꿈
    	System.out.println(num1Change + num2); //num1Change 값과 num2의 값을 합산하여 출력 후 줄바꿈
    	System.out.println((int)1.23);	// 실수값을 정수형으로 전환하여 출력(소수점은 다 버려짐) 
    	//2-22
    	int i1 = 10; //정수형 변수 i1을 선언하고 값 10 저장
    	byte b1 = (byte)i1; //정수형 byte변수에 b1을 선언하고, i1값을 byte로 형변환하여 저장
    	System.out.println(b1); //b1값을 출력 후 줄바꿈
    	
    	int i2 = 128; //정수형 변수 i2를 선언하고, 값 128저장 
    	byte b2 = (byte)i2; //정수형 byte 로 b2를 선언하고 , i2를 byte로 형변환하여 저장
    	System.out.println(b2); //b2값을 출력 후 줄바꿈 (오버플로우 되어 -128)
    	//2-23
    	double d1 = 1.0e100; //1.0 x (10의 100승) (float의 최대 범위를 넘음)
    	float f1 = (float)d1; 
    	System.out.println(f1);
    	double d2 = 1.0e-100; //1.0 x (10의 -100승) (float의 최소 범위를 넘음)
    	float f2 = (float)d2
    	System.out.println(f2);
    	
	}
}
