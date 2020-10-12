package Day03;

import java.util.Scanner;

//예제 4 
//이진 검색 

public class Ex01 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 5, 6, 8, 9 };

		// 배열 정렬
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("]");
		System.out.println("검색 할 값을 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt(); // 검색 할 값

		System.out.print("  | ");
		for (int k = 0; k <= 6; k++) {
			System.out.print(k + "  ");
		}

		System.out.println("\n--+------------------------");

		int end = a.length; // 비교 할 배열의 끝 인덱스
		int start = 0; // 비교할 배열의 처음 인덱스
		int center = (end + start) / 2; // 중앙 인덱스 값 : 마지막 인덱스와 처음 인덱스 / 2

		for (int m = 0; m < a.length; m++) {

			System.out.print("  |");
			
//			for(int r=1;r<=start;r++) {
//				System.out.print(" ");
//			}
//			System.out.print("<-");
//			for (int i = 0; i < a.length; i++) {
//				System.out.print(" ");
//				if (a[i] == a[center]) {
//					System.out.print("+");
//				}
//			}
//			
//			for(int r=1;r<=end;r++) {
//				System.out.print(" ");
//			}
//			System.out.println("->");
			
			System.out.printf(String.format("%d%s<-", start)," ","");
			for (int i = 0; i < a.length; i++) {
				if (a[i] == a[center]) {
					System.out.printf("%s","+");
				}
			}
			
			System.out.printf("%s->"," ");
			
			System.out.println();
			
			System.out.print(m + " | ");
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[j] + "  ");
			}
			System.out.println();

			do {
				
				center = (end + start) / 2;
				if (a[center] < search) { // 검색한 결과가 중앙 값 보다 크면
					start = center + 1; // 시작행을 증가
					break;
				} else if (a[center] == search) {
					System.out.println(search + "는  a[" + center + "] 에 위치합니다.");
					return;
				} else if (a[center] > search) {// 검색한 결과가 중앙 값 보다 작으면
					end = center - 1; // 종료행을 감소
					break;
				}
			} while (start <= end);
		}

	}

}
