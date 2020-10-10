package Day02;

import java.util.Scanner;

//예제 16
//n단의 * 피라미드 출력 

public class Ex4 {

	public static void main(String[] args) {

		System.out.println("단수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		spira(num);

	}

	// 피라미드 출력 메소드
	static void spira(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n-i; j++) {
				System.out.print(" ");
			}
			int cal = (i - 1) * 2 + 1;
			for (int j = 0; j < cal; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
