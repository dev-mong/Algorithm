package ex21_divArr;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {

	public static int[] solution(int[] arr, int divisor) {

		ArrayList<Integer> divLis = new ArrayList<Integer>(); // 나머지 값을 저장 할 리스트

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				divLis.add(arr[i]); // 리스트에 추가
			}
		}

		int[] answer;

		if (divLis.size() == 0) {
			answer = new int[1];
			answer[0] = -1;
		} else {
			answer = new int[divLis.size()];
			Collections.sort(divLis);
			for (int i = 0; i < divLis.size(); i++) {
				answer[i] = divLis.get(i);
			}
		}

		System.out.println(answer.length);

		return answer;
	}

	public static void main(String[] args) {

		int[] arr = { 3, 2, 6 }; // 자연수 배열

		int divisor = 10; // 나누는 수

		solution(arr, divisor);

	}

}
