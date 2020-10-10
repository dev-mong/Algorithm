package Day02;

import java.util.Scanner;

//예제 15
//* 직각이등변 출력
public class Ex3_triangleStar {

	public static void main(String[] args) {

		System.out.println("단수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 단

		System.out.println("\n왼쪽 아래가 직각인 이등변 삼각형 출력");
		triangleLb(num);

		System.out.println("\n왼쪽 위가 직각인 이등변 삼각형 출력");
		triangleLU(num);

		System.out.println("\n오른쪽 위가 직각인 이등변 삼각형 출력");
		triangleRU(num);

		System.out.println("\n오른쪽 아래가 직각인 이등변 삼각형 출력");
		triangleRB(num);

	}

	// 왼쪽 아래가 직각인 이등변 삼각형 출력 메소드
	static void triangleLb(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 왼쪽 위가 직각인 이등변 삼각형 출력 메소드
	static void triangleLU(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 오른쪽 위가 직각인 이등변 삼각형 출력 메소드
	static void triangleRU(int n) {
		for (int i = n; i > 0; i--) {
			if (i < n) {
				for (int k = n; k > i; k--) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 오른쪽 아래가 직각인 이등변 삼각형 출력 메소드
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			if (i < n) {
				for (int k = n; k > i; k--) {
					System.out.print(" ");
				}
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
