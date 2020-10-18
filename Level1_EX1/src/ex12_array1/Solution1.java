package ex12_array1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution1 {

	public static int[] solution(int[] numbers) {

		ArrayList<Integer> sumList = new ArrayList<>(); //합계를 담을 리스트

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				sum = numbers[i] + numbers[j];
//				if(sumList.indexOf(sum) < 0) { //객체 인자를 전달하여 해당 인덱스에 동일 값이 없을 때
//					sumList.add(sum);
//				}
				
				if(!sumList.contains(sum)) { //객체 인자를 전달하여 해당 객체가 존재하면 true
					sumList.add(sum);
				}
			}
		}

		Collections.sort(sumList); //오름차순으로 정렬 
		
		int[] answer = new int[sumList.size()]; //합계 리스트 길이 만큼 배열 생성
		
		for(int i=0;i<answer.length;i++) {
			answer[i] = sumList.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {

		int[] numbers = { 2, 1, 3, 4, 1 };
		
		int[] answer = solution(numbers);
		
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}

	}
}
