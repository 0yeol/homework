package Ex_08;

public class MidTerm {
	//8-16
	public int score(int scores[])
	{
		int result = 0;
		for(int i = 0; i < scores.length; i++) //scores배열의 길이만큼 반복
		{
			result += scores[i];  //result에 저장  
		}
		return result; //result값 반환
	}
}
