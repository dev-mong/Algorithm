package ex19_noSame;

//같은 숫자는 싫어 

public class Solution1 {

	public static int[] solution(int[] arr) {
		int[] answer = new int[arr.length];
		int temp = arr[0];
		answer[0] = arr[0];
		int cnt = 1;
	
		for (int i = 1; i < arr.length; i++) {
			if (temp == arr[i]) {
				continue;
			}
			answer[cnt] = arr[i];
			temp = arr[i];
			cnt++;
		}

		int[] result = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			result[i] = answer[i];
		}

		return result;
	}

	public static void main(String[] args) {

		int[] arr = { 1, 1, 3, 3, 0, 1, 1 };

		solution(arr);

	}

}
