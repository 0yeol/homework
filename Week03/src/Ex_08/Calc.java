package Ex_08;

public class Calc {
	//8-8
	void sum(int num1, int num2) //메서드 선언
	{
		System.out.println("두 수의 합은 " + (num1 + num2) + "입니다."); //괄호안 값 출력
	}
	void sum(int[] nums) //메서드선언(매개변수 배열로)
	{
		int result =0;
		for(int i =0; i < nums.length; i++) //배열의 길이만큼 반복
		{
			result += nums[i]; //result에 더하여 저장
		}
		System.out.println("숫자들의 합은 " + result + "입니다.");
	}
	public int sum1(int[] nums) //메서드 선언
	{
		int result =0;
		for(int i =0; i<nums.length; i++) //배열길이만큼 반복
		{
			result += nums[i]; //result에 배열요소들 저장
		}
		return result; //result값 반환
	}
}
