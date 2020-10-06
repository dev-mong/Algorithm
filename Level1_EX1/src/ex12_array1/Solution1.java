package ex12_array1;


public class Solution1 {

	public static int[] solution(int[] numbers) {
		int[] answer = {};

		int sum = 0;
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				sum = numbers[i]+numbers[j];
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		
		int[] numbers = {2,1,3,4,1};
		solution(numbers);
		
	}
}
