package Day02;

import java.util.Scanner;

//예제 14
//별표 사각형으로 출력 (입력한 수를 한 변으로 하는 정사각형으로 출력 )

public class Ex2_star {

	public static void main(String[] args) {

		System.out.println("사각형을 출력합니다.");
		System.out.println("단수를 입력하세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		System.out.println("단 수 : " + num);

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
