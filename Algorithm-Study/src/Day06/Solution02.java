package Day06;

import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {

		System.out.println("수열의 개수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("진행 단계를 입력 하세요");
		int s = sc.nextInt();

		int[] arr = new int[n]; // 입력한 수의 배열

		for (int i = 0; i < n; i++) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			arr[i] = num;
		}

		int min = arr[0]; // 최소값
		int cnt = 0;
		int current = 0; // 현재 위치
		
		while (cnt < s) {
			for (int i = cnt; i < arr.length; i++) {
				if (min > arr[i]) { // 작은 수 값 비교
					min = arr[i]; // 최소값 저장
					current = i;
				}
			}
			
			System.out.println(min);
			arr[current] = arr[cnt]; //가장 작은 수의 위치에 현재 인덱스 값을 저장
			arr[cnt] = min;
			min = arr[cnt+1];
			cnt++;
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
