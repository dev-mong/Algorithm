package ex06_matrix;

public class Solution1 {

	public static double solution(int[] arr) {
		double answer=0;
		
		for(int i=0;i<arr.length;i++) {
			answer+=arr[i];
		}
		answer = answer/arr.length;
		
		return answer;
	}
	

	public static void main(String[] args) {

		int[] arr= new int[4];
		for(int i=0;i<arr.length;i++) {
			arr[i]+=i+1;
		}
		double answer = solution(arr);
		System.out.println(answer);
	}

}
