package Day02;

import java.util.Scanner;

//예제 
//선형 검색

public class Ex10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = { 6, 4, 3, 2, 1, 9, 8 };

		
		System.out.print("검색 할 값 :");
		int num = sc.nextInt();

		// 배열 값 출력
		int result = print(arr, num);
		System.out.println();
		System.out.println(num + "은 " + "arr[" + result + "]" + "에 있습니다.");
	}

	static int print(int[] arr, int num) {

		int result = 0;

		System.out.print("  | ");
		for (int k = 0; k <= 6; k++) {
			System.out.print(k + "  ");
		}

		System.out.println("\n--+------------------------");

		for (int i = 0; i < 6; i++) { 

			System.out.print("  | ");
			for (int j = 1; j <= i; j++) { // 현재 위치 출력 칸 띄우기
				System.out.print("   ");
			}
			System.out.println("*");

			System.out.print(i+" | ");
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "  ");
			}
			
			if (arr[i] == num) {
				result = i;
				break;
			}
			System.out.println();
		}
		return result;

	}

}
