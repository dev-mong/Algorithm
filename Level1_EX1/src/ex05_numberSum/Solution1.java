package ex05_numberSum;

//두 정수 사이의 합

public class Solution1 {

	public static long solution(int a, int b) {
		long answer = 0;
		
		if(a<b)
		{
			while(a<=b) {
				answer += a;
				a++;
			}
		} else {
			while(b<=a) {
				answer += b;
				b++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int a=5;
		int b=3;
		
		
		solution(a, b);
		
		
	}

}
