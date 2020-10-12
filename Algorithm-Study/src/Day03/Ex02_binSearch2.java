package Day03;

import java.util.Scanner;

//예제 4 
//이진 검색 

public class Ex02_binSearch2 {

	public static void main(String[] args) {

		int[] a = { 1, 2, 5, 5, 6, 8, 9 };

		// 배열 정렬
		System.out.print("[ ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		System.out.println("]");
		System.out.println("검색 할 값을 입력하세요.");

		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt(); // 검색 할 값

		int idx = binSearchX(a, a.length, search);
		System.out.println(search + "의 맨 앞 요소는  a[" + idx + "] 에 위치합니다.");
		
	}
	
	static int binSearchX(int [] a,int n, int search) {
		
		int end = a.length; // 비교 할 배열의 끝 인덱스
		int start = 0; // 비교할 배열의 처음 인덱스
		int center = (end + start) / 2; // 중앙 인덱스 값 : 마지막 인덱스와 처음 인덱스 / 2

		int idx = 0;
		
		for (int m = 0; m < a.length; m++) {

			do {
				center = (end + start) / 2;
				if (a[center] < search) { // 검색한 결과가 중앙 값 보다 크면
					start = center + 1; // 시작행을 증가
					break;
				} else if (a[center] == search) {

					idx=center; //정답 인덱스 값
					
					for(int k=start;k<end;k++) { //정답 인덱스가 여러개 일 때 비교 - 처음 시작 인덱스부터 끝 인덱스 비교하기 
					
						if(a[k] == search) {
							idx = k;
							return idx;
						}
					}

					
				} else if (a[center] > search) {// 검색한 결과가 중앙 값 보다 작으면
					end = center - 1; // 종료행을 감소
					break;
				}
			} while (start <= end);
		}
		
		return idx;

	}

}
