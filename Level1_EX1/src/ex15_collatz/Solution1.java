package ex15_collatz;

public class Solution1 {

	public static int solution(long num) {
		int answer = 0;

		
		
		while (answer < 500) {
			
			if (num == 1) {
				break;
			} 
			
			if (num % 2 == 0) {
				num = num / 2;
			} else if (num % 2 != 0) {
				num = (num * 3) + 1;
			} 
			
			answer++;
		}
		
		
		return num==1 ? answer : -1; 
	}

	public static void main(String[] args) {

		int num = 16;

		
		System.out.println(solution(num));

	}

}
