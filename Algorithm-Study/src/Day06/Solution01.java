package Day06;

import java.util.Scanner;

public class Solution01 {

	public static void main(String[] args) {
		
		System.out.print("단 입력");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int k=0;k<num-i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<i*2-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
