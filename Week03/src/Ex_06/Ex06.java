package Ex_06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		//6-1
		int[] arr = new int[4]; //정수형 배열 크기 4로 선언
		System.out.println(arr); //배열변수(참조형 변수)를 출력
		//6-2
		//배열에 값 삽입
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		
		//배열에 값을 출력
		System.out.println("arr[0] = " + arr[0]);
		System.out.println("arr[0] = " + arr[1]);
		System.out.println("arr[0] = " + arr[2]);
		System.out.println("arr[0] = " + arr[3]);
		//6-3
		int[] intArray = new int[5]; //정수형 배열 크기 5로 선언
		String[] strArray = new String[5];//문자열 배열 크기 5로 선언
		
		//5개의 값을 가지는 배열선언
		int[] varArray = {1,2,3,4,5};
		
		//intArray값 출력
		System.out.println("int Array[0] = " + intArray[0]);
		System.out.println("int Array[1] = " + intArray[1]);
		//strArray값 출력
		System.out.println("str Array[0] = " + strArray[0]);
		System.out.println("str Array[1] = " + strArray[1]);
		//varArray값 출력
		System.out.println("var Array[0] = " + varArray[0]);
		System.out.println("var Array[1] = " + varArray[1]);
		//6-4
		int[] numbers = new int[10]; //크기가 10인 배열 선언
		
		//배열에 랜덤함수 이용해서 값 입력
		for(int i =0; i< numbers.length; i++)
		{
			numbers[i] = (int)(Math.random() * 30) + 1;
		}
		//배열안에서 짝수만 구해서 합 저장
		int sum = 0;
		for(int i =0; i< numbers.length; i++)
		{
			if(numbers[i] % 2 == 0)
			{
				sum += numbers[i];
			}
		}
		//배열의 랜덤값 출력
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i] + " ");
		}
		System.out.println(); //줄바꾸기
		System.out.println("배열의 짝수들의 합: " + sum); //배열안 짝수값 출력
		//6-5
		char[] cards = {'1', 'L', 'O', '2', 'V', '3', 'E'}; //배열에 값 넣고 선언
		String myWord = ""; //문자열 myword 선언
		for(int i = 0; i < cards.length; i++)
		{
			int word = cards[i]; //int로 형변환해서 word에 저장
			if(word >= 65 && word <= 90) //A~Z까지면
			{
				myWord += (char)word; //myWord에 저장
			}
			
		}
		System.out.println("단어: " + myWord);
		//6-6
		int[] arr = {1,6,2,3,10,7,4,5,8,9}; //배열 선언
		int temp = 0; //값 치환할 때 쓸 변수
		for(int i = arr.length-1; i > 0; i--) //정렬 반복문
		{
			for(int j =0; j < i; j++)
			{
				if(arr[j] > arr[j+1]) //arr[j]가 arr[j+1] 보다 크다면
				{
					
					temp = arr[j+1];  //값치환해서 서로 바꿔주기
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("정렬 후 출력: " );
		for(int i =0; i < arr.length; i++) //정렬 후 출력
		{
			System.out.print(arr[i] + " ");
		}
		//6-7
		int[] arr = {1,6,2,3,10,7,4,5,8,9}; //배열 선언
		
		System.out.println(Arrays.toString(arr)); //toString메소드 사용해서 배열을 문자열로 출력
		//6-8
		int[] arr = {1,6,2,3,10,7,4,5,8,9}; //배열 선언
		System.out.println("정렬 전 배열: " + Arrays.toString(arr));
		//배열 오름차순으로 정렬하는 메소드 사용
		Arrays.sort(arr);
		System.out.println("오름차순 정렬: " + Arrays.toString(arr));
		//6-9
		Integer[] arr = {1,6,2,3,10,7,4,5,8,9}; //배열 선언 
		System.out.println("정렬 전 배열: " + Arrays.toString(arr)); 
		//배열 내림차순으로 정렬하는 메소드 사용
		Arrays.sort(arr, Comparator.reverseOrder());
		System.out.println("내림차순 정렬: " + Arrays.toString(arr));
		//6-10
		int[] arr01 = {1,2,3}; //배열 선언
		
		//배열의 얕은복사
		int[] arr02 = arr01; //arr02 선언 후 얕은복사로 arr01값 복사(참조값으로)
		System.out.println("arr01 배열" + Arrays.toString(arr01));
		
		//arr02배열값 변경
		arr02[1] = 10;
		//변경 후 배열 출력 
		System.out.println("arr02 배열: " + Arrays.toString(arr01)); //1, 10, 3
		System.out.println("arr01 배열: " + Arrays.toString(arr02)); //1, 10, 3
		//6-11
		int[] card = {1,6,4,5,3,2}; //배열 선언, 초기화
		int[] newCard = new int[card.length]; //배열 크기 card의 길이만큼 선언
		
		//newCard에 card배열 값 삽입
		for(int i =0; i < card.length; i++)
		{
			newCard[i] = card[i]; 
		}
		System.out.println("card 배열: " + Arrays.toString(card)); 
		System.out.println("newCard 배열: " + Arrays.toString(newCard));
		//6-12
		int[] card = {3,1,4,5,10};
		//배열 깊은복사 Arrays.copyOf(배열, 복사범위)
		int[] newCard = Arrays.copyOf(card, card.length);//배열명, 어디까지 복사할껀지
		System.out.println("card배열: " + Arrays.toString(card));
		//card배열값 변경
		card[1] = 10;
		
		//card변경 후 배열 출력
		System.out.println("card배열: " + Arrays.toString(card));
		System.out.println("newCard배열: " + Arrays.toString(newCard));
		//6-13
		int[] card = {1,6,4,5,3,2}; //배열 선언, 초기화
		int[] newCard = new int[card.length]; //배열크기 card배열 길이만큼 선언 
		//복사대상배열, 복사 시작위치, 카피할 배열, 시작위치, 복사할 길이
		System.arraycopy(card, 0, newCard, 0, card.length);
		//출력
		System.out.println("card배열: " + Arrays.toString(card));
		System.out.println("newCard배열: " + Arrays.toString(newCard));
		//6-14
        int[][] arr = new int[2][3]; // 2행 3열 크기의 배열 생성
        // 첫 번째 행의 값 초기화
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        // 두 번째 행의 값 초기화
        arr[1][0] = 11;
        arr[1][1] = 12;
        arr[1][2] = 13;
        System.out.println("2차원 배열 : " + arr); // 배열 객체의 참조값 출력
        System.out.println("2차원 배열 1행 : " + arr[0]); // 첫 번째 행의 참조값 출력

        System.out.println("행의 크기 : " + arr.length); // 행의 개수 출력

        System.out.println("1행의 열 크기 : " + arr[0].length); // 첫 번째 행의 열 개수 출력
        System.out.println("2행의 열 크기 : " + arr[1].length); // 두 번째 행의 열 개수 출력

        System.out.println("arr[0][0] = " + arr[0][0]); // 첫 번째 행 첫 번째 값 출력
        //6-15
        // 5x5 2차원 배열 선언
        int[][] arr = new int[5][5];
        int count = 1; // 배열에 채울 값 초기화

        // 2차원 배열에 값 채우기
        for (int i = 0; i < 5; i++) // 행 반복
        { 
            for (int j = 0; j < 5; j++)  // 열 반복
            {
                arr[i][j] = count++; // 배열에 값 저장 후 count 증가
            }
        }
        //출력
        for (int i = 0; i < 5; i++) 
        { 
            for (int j = 0; j < 5; j++) 
            { 
                System.out.print(arr[i][j] + "\t"); // 값을 탭으로 구분하여 출력
            }
            System.out.println(); //줄바꿈
        }
        //6-16
        //당첨 번호 리스트
        int[][] lotto = {{2,6,11,33,42,44},
        				{1,6,17,22,24,33},
        				{7,16,24,33,42,44},
        				{11,27,32,34,43,46},
        				{6,17,22,24,33,41}};
        Scanner scan = new Scanner(System.in); //입력클래스 import
        String myNum = "";
        System.out.print("당첨 숫자 6개를 연속으로 입력해주세요 >> ");
        myNum = scan.next(); // 입력메소드
        boolean isWin = false; // 당첨 여부 확인변수

        
       
        for (int i = 0; i < lotto.length; i++) 
        {
        	//당첨 번호 만들기 위한 변수
        	 String lottoNumber = "";
        	 for(int j =0; j < lotto[i].length; i++)
        	 {
        		 lottoNumber += lotto[i][j];
        	 }
        	 if (myNum.equals(lottoNumber)) // 입력값이 당첨 번호와 일치하면
             { 
                 isWin = true;
                 break; 
             }
        }

 
        if (isWin) { //isWin이 참이면
            System.out.println(myNum + " 번호 당첨!");
        } else {
            System.out.println(myNum + " 번호는 당첨되지 못했습니다.");
        }

        // Scanner 닫기
        scan.close();
        //6-17
        int[] score = {90, 92, 93}; //배열 선언, 초기화
        
        int sum =0; //총합구할 변수 
        double avg = 0; //평균구할 변수
        for(int val : score) //for-each문으로 score값 모두 합산
        {
        	sum += val;
        }
        avg = (double) sum /3; //평균 avg에 저장
        System.out.println("총점: " + sum + ", 평균: " + avg); //출력
	}
}





